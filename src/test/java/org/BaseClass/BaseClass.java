package org.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
/*import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;*/
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	
	public static void browserLaunch(String browsername) {
		
	switch (browsername) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		
	case "edge":
		WebDriverManager.chromedriver().setup();
		driver= new EdgeDriver();
		break;
		default:
			System.err.println("invalid browsername");
		
		}
	
		}
		//maximaize
	public static void 	maximize(){
		driver.manage().window().maximize();
	}
	//impwait
	public static  void impwait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}
	//url Launch
	public static void launchUrl(String url) {
		driver.get(url);
	}
	//quit
	public static void quit() {
		driver.quit();
	}
	//sendkeys
	public static void fillTextBox(WebElement e,String data) {
		e.sendKeys(data);
		
	}
	//get Attribute
	public static String getAttribute(WebElement e) {
		String text = e.getAttribute("value");
		return text;
	}
	//move to Element
	public static void moveToElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e);
	}
	//drag and drop
	public static void dragAndDrop(WebElement e,WebElement u) {
		Actions a=new Actions(driver);
		a.dragAndDrop(e, u).perform();
	}
	//Clickbutton
  public static void Click(WebElement e) {
	 e.click();
	}
	//Select
	public static void selectbyindex(WebElement e,int index) {
	Select s=new Select(e);
	s.selectByIndex(index);
	}
	public static WebElement findElement(String locatorname,String value) {
		WebElement e=null;
		if(locatorname.equals("id")) {
			e=driver.findElement(By.id(value));
		}else if(locatorname.equals("name")) {
			e=driver.findElement(By.name(value));
		}else if(locatorname.equals("xpath")) {
			e=driver.findElement(By.xpath(value));
	}
		return e;	
	}
	//currenturl
	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
	}
	//GET TITLE
	public static void getTitle() {
		String title = driver.getTitle();
	}
	//Screenshot
	public static  void takeScreenshot(String Filename) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
	 File from = tk.getScreenshotAs(OutputType.FILE);
      File to=new File(System.getProperty("user.dir")+"C:\\Users\\maarii\\eclipse-workspace\\Maven\\src\\test\\resources\\Screenshot\\"+Filename+".png");
      FileUtils.copyFile(from, to);
	}
	//SendKey Js script
	public static void jsSendKeys(String data,WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+data+"')", e);
	}
	
/*	public static String xcelRead(String filename,String sheetname,int rowno,int cellno) throws IOException {
		File f=new File("C:\\Users\\maarii\\eclipse-workspace\\Maven\\src\\test\\resources\\Xcel\\"+filename+".xlsx");
		FileInputStream ia=new FileInputStream(f);
		Workbook wk=new XSSFWorkbook(ia);
		Sheet sheet = wk.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		//Row to cell
		Cell cell = row.getCell(cellno);
		int cellType = cell.getCellType();
		//type0--->number,date
		//type1--->string
		String value=null;
		if(cellType==1) {
		 value = cell.getStringCellValue();
		}else {
			if(DateUtil.isCellDateFormatted(cell)) {
		value=new SimpleDateFormat("dd-MM-YYYY").format(cell.getDateCellValue());
			}else {
				value=String.valueOf((long)cell.getNumericCellValue());
			}
		}
		return value;
		
	}*/
		
		
}



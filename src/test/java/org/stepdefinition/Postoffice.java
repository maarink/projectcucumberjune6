package org.stepdefinition;

import org.BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Postoffice extends BaseClass {
	WebDriver driver;
	Select s;
	@Given("The user should be open the home page")
	public void the_user_should_be_open_the_home_page() {
	   WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.macys.com/");
	    driver.manage().window().maximize();
	    
	}

	@When("The user has to click the register button")
	public void the_user_has_to_click_the_register_button() {
		WebElement click = driver.findElement(By.xpath("//a[@class='sign-up-submit']"));
		click.click();
	   WebElement click1 = driver.findElement(By.xpath("(//input[@class='globalSearchInputField tftextinput4 input'])[1]"));
	click1.sendKeys("maari@gmail.com");
	WebElement clickforget = driver.findElement(By.xpath("(//input[@class='globalSearchInputField tftextinput4 input'])[2]"));
	clickforget.sendKeys("600045");
	}

	@When("The user has to fill the username,dob and passing year")
	public void the_user_has_to_fill_the_username_dob_and_passing_year() {
		 WebElement month = driver.findElement(By.xpath("(//select[@class='input4'])[1]"));
		    s=new Select(month);
		    s.selectByIndex(4);
		    WebElement date = driver.findElement(By.xpath("(//select[@class='input4'])[2]"));
		     s=new Select(date);
		    s.selectByVisibleText("20");
		    WebElement year = driver.findElement(By.xpath("(//select[@class='input5'])"));
		    s=new Select(year);
		    s.selectByValue("1998");
	    
	}

	@When("The user has to click the submit button")
	public void the_user_has_to_click_the_submit_button() {
		 WebElement click2 = driver.findElement(By.xpath("//*[@id=\'holder\']/div/div[2]/label"));
			click2.click();
	}

	@Then("The should navigate the function")
	public void the_should_navigate_the_function() {
		System.out.println("the user successfully the invalid login page");
		quit();
	}


	
}

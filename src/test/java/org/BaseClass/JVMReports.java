package org.BaseClass;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {

	public static void generateJVMreport(String json) {
//    1.File Location
		File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\JVMReport");
//    2.Configuration
		Configuration con=new Configuration(loc, "open");
		con.addClassifications("browsername","chrome");
		con.addClassifications("browserversion","96");
		con.addClassifications("version","11");
		con.addClassifications("os","window");
		con.addClassifications("Sprint","28");
//    3.Report Builder	
		List<String> jsonFiles=new LinkedList<>();
		jsonFiles.add(json);
		ReportBuilder r=new ReportBuilder(jsonFiles, con);
		r.generateReports();
	}
	
	
}

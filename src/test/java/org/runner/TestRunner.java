package org.runner;

import org.BaseClass.JVMReports;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
                  glue="org.stepdefinition",
                  dryRun=false,
                  plugin={"pretty",
                  "html:src\\test\\resources\\Reports",
                  "json:src\\test\\resources\\Reports\\jsonReports.json",
                  "junit:src\\test\\resources\\Reports\\junitReport.xml"},
               monochrome = true)
public class TestRunner {
	@AfterClass
public static void Reports() {
		JVMReports.generateJVMreport("src\\test\\resources\\Reports\\jsonReport.json");
System.out.println("--------report generated--------------");
}
}

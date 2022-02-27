package com.settings;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.utility.PropertyUtility;

import cucumber.api.CucumberOptions;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "Reports/cucumber.json", jsonUsageReport = "Reports/cucumber-usage.json", screenShotLocation = "Screenshots/", screenShotSize = "500px", detailedReport = true, detailedAggregatedReport = true, overviewReport = true, overviewChartsReport = true, featureOverviewChart = true, usageReport = true, coverageReport = true, toPDF = true, pdfPageSize = "auto", outputFolder = "Reports/",retryCount=0)
@CucumberOptions(features = "Features", glue = { "com/toDo/stepdefs" }, plugin = {
		"html:Reports/cucumber-html-report", "json:Reports/cucumber.json",
		"pretty:Reports/cucumber-pretty.txt",
		"usage:Reports/cucumber-usage.json",
		"junit:Reports/cucumber-results.xml" }, monochrome = true)

public class TestRunner {
	
	public static WebDriver driver;
	public static String browser;
	
	public static void main(String args[]) throws Exception {

		String tag = System.getProperty("tag");
		browser = System.getProperty("browser");
		System.setProperty("cucumber.options", "--tags " + tag + "");
		System.setProperty("cucumber.reports.reportPrefix",
				PropertyUtility.getProperty("ApplicationName"));
		JUnitCore junitRunner = new JUnitCore();
		junitRunner.run(com.settings.TestRunner.class);
		
	}
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://todomvc.com/examples/vue/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	
	@BeforeClass
	public static void driverSetup() throws MalformedURLException {
		launchBrowser();
	}
	 @AfterClass
	 public static void tearDown() throws Exception {
		 driver.quit();

	 }
}

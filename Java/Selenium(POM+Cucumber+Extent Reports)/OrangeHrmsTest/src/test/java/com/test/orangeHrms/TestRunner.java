package com.test.orangeHrms;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;








@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:/Users/ARKA-PC/New Workspace/OrangeHrmsTest/FeatureFiles/login.feature","C:/Users/ARKA-PC/New Workspace/OrangeHrmsTest/FeatureFiles/HomePage.feature"},glue= {"StepDefinationsForOrangeHrms"},monochrome=true,
plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/json-report/cucumber.json"})
public class TestRunner  {
	
	
	
	
	
	

	
	/*
	 * @AfterClass public static void setup() { Reporter.loadXMLConfig(new
	 * File("C:/Users/ARKA-PC/New Workspace/OrangeHrmsTest/Reosurces/extent-config.xml"
	 * )); //Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	 * Reporter.setSystemInfo("User Name", "AJ");
	 * Reporter.setSystemInfo("Application Name", "Test App ");
	 * Reporter.setSystemInfo("Operating System Type",
	 * System.getProperty("os.name").toString());
	 * Reporter.setSystemInfo("Environment", "Production");
	 * Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
}

package org.runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utility.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
glue="org.stepdefinition",monochrome=true,dryRun=false
)

public class TestRunnerclass {
	
	@AfterClass
	public static void report() {
		JVMReport.generateJvmReport(System.getProperty("user.dir")+"\\Reports\\kam.json");
	}                                                   //Mention the path of json file created

}

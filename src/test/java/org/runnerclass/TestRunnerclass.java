package org.runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utility.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",
glue="org.stepdefinition",monochrome=true,dryRun=false,plugin={"html:target\\Reports",
"junit:target\\Reports\\fb.xml","json:target\\Reports\\FbLanding.json",
"rerun:src\\test\\resources\\Rerun\\Failed.txt"
}
)

public class TestRunnerclass {
	
	@AfterClass
	public static void report() {
		JVMReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\FbLanding.json");
	}                                                   //Mention the path of json file created

}

package org.utility;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;




public class JVMReport {
	public static void generateJvmReport(String jsonpath) {
		//1.Mention the location of cucumber report to be saved
		File fn =new File(System.getProperty("user.dir")+"\\Reports");

		//2.Give details using configuration class
		Configuration con =new Configuration(fn, "FacebookLogin");
		con.addClassifications("Platform name", "Windows");
		con.addClassifications("Platform Version","Windows-10");
		con.addClassifications("Browser", "Google Chrome");
		con.addClassifications("Browser Version","95.1");
		
		//3.Add the json file path into list
		List<String>li=new ArrayList<String>();
		li.add(jsonpath);
		
		//4.Create the object for reportbuilder class
		ReportBuilder build=new ReportBuilder(li,con);
		build.generateReports();
	}
	
	
	
}

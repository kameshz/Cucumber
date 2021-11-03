package org.stepdefinition;

import org.POJOclass.FbLoginPojo;
import org.junit.Assert;
import org.utility.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLoginSteps extends Baseclass {
	@Given("The user should launch the chrome browser")
	public void the_user_should_launch_the_chrome_browser() {
	    
	}
	@When("The user should type the url")
	public void the_user_should_type_the_url() {
	    
	}
	@When("The user should maximize the window")
	public void the_user_should_maximize_the_window() {
	    
	}
	@When("The user should type invalid username and passwords")
	public void the_user_should_type_invalid_username_and_passwords(io.cucumber.datatable.DataTable d) {
		FbLoginPojo f=new FbLoginPojo();
		
		sendkeys(f.getTxtuser(),d.asList().get(0));
	    sendkeys(f.getTxtpass(),d.asList().get(1));	
	
	}
		
	@When("The user should click the login button")
	public void the_user_should_click_the_login_button() throws InterruptedException {
		FbLoginPojo f=new FbLoginPojo();
		click(f.getBtnlogin());
		
	}
	@When("The user should get the title of the incorrect page")
	public void the_user_should_get_the_title_of_the_incorrect_page() {
	    getTitle();
	}
	@Then("The user should navigate to incorrect credential page")
	public void the_user_should_navigate_to_incorrect_credential_page() {
	    String cu = driver.getCurrentUrl();
	  Assert.assertTrue("Check your input", cu.contains("privacy"));
	  System.out.println("The test case is passed");
	}
	@When("The user should type invalid username {string} and valid password {string}")
	public void the_user_should_type_invalid_username_and_valid_password(String string, String string2) {
		FbLoginPojo f=new FbLoginPojo();
		sendkeys(f.getTxtuser(),string);
	    sendkeys(f.getTxtpass(),string2);	
	}
	
	
	
	
	
	
	
}

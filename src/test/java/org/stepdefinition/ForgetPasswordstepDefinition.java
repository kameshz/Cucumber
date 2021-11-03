package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.utility.Baseclass;

import io.cucumber.java.en.*;

public class ForgetPasswordstepDefinition extends Baseclass {
	@Given("The user should launch the browser")
	public void the_user_should_launch_the_browser() {
	   
	}

	@When("The user should load the url")
	public void the_user_should_load_the_url() {
	    
	}

	@When("The user should click forgot passord link")
	public void the_user_should_click_forgot_passord_link() {
	   driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

	@When("The user should navigate to find your account page")
	public void the_user_should_navigate_to_find_your_account_page() {
	    String url = driver.getCurrentUrl();
	    Assert.assertTrue("Verify the fb account page",url.endsWith("screen=0"));
	    System.out.println("Account page verified");
	}

	@When("The user should type registered mobile number or email-id")
	public void the_user_should_type_registered_mobile_number_or_email_id() {
	    driver.findElement(By.id("identify_email")).sendKeys("1234567890");
	}

	@When("The user should click the search button")
	public void the_user_should_click_the_search_button() {
	   driver.findElement(By.id("did_submit")).click();
	}

	@Then("The user should navigate to reset your password page")
	public void the_user_should_navigate_to_reset_your_password_page() {
	   String current = driver.getCurrentUrl();
	   Assert.assertTrue("Navigated to reset your password page", current.contains("recover"));
	}
}


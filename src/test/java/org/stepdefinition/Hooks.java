package org.stepdefinition;

import org.utility.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass {

@Before
public void beforeScenario() {
	System.out.println("Scenario start");
	launchBrowser();
	launchurl("https://www.facebook.com");
	winMax();
}

@After
public void afterScnario() {
	closebrowser();
	
}
@Before(order=6)
public void before() {
	System.out.println("order No:6");
	
}

@After(order=3)
public void after() {
	System.out.println("order No:3");
	
}
@Before(order=7)
public void beforeSc() {
	System.out.println("Order no:7");
	
}

@After(order=10)
public void afterSc() {
	System.out.println("Order no:10");
	
}
@Before(order=20)
public void beforeS() {
	System.out.println("order no:20");
	
}

@After(order=30)
public void afters() {
	System.out.println("order no:30");
	
}













}

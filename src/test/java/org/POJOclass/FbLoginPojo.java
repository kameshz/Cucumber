package org.POJOclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Baseclass;

public class FbLoginPojo extends Baseclass {
	public FbLoginPojo() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="email")
	private WebElement txtuser;
	
	@FindBy(id="pass")
	private WebElement txtpass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnlogin;
	
	
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
}

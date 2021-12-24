package org.softassert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testng.BaseClass;


public class Loginpage extends BaseClass {

	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement clkexistname;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement existpass;
	
	 @FindBy(xpath="//input[@name='login']")
	    private WebElement btnlogin;
	

	public WebElement getbtnlogin() {
		return btnlogin;
	}

	public WebElement getClkexistname() {
		return clkexistname;
	}

	public WebElement getExistpass() {
		return existpass;
	}
}


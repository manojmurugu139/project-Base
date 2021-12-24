package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class booknow extends BaseClass {
		
	public booknow() {
PageFactory.initElements(driver, this);	
}
	
	
	@FindBy(name="first_name")
	private WebElement firstname;
	
	@FindBy(name="last_name")
	private WebElement lastname;

	@FindBy(name="address")
	private WebElement billingaddress;

	@FindBy(id="cc_num")
	private WebElement cardno;

	@FindBy(name="cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement mnth;


	@FindBy(id="cc_exp_year")
	private WebElement year;


	@FindBy(name="cc_cvv")
	private WebElement ccvnum;
	
	@FindBy(name="book_now")
	private WebElement booknum;
	
	@FindBy(name="order_no")
	private WebElement printordernum;

	public WebElement getPrintordernum() {
		return printordernum;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMnth() {
		return mnth;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCcvnum() {
		return ccvnum;
	}

	public WebElement getBooknum() {
		return booknum;
	}



}

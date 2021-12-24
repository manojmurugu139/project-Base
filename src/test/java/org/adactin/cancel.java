package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cancel extends BaseClass {
	public cancel() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement clkbooked;

@FindBy(name="search_hotel_id")
private WebElement clkgo;

@FindBy(name="ids[]")
private WebElement clkcheckbox;

@FindBy(name="cancelall")
private WebElement clkcancel;


public WebElement getClkbooked() {
	return clkbooked;
}

public WebElement getClkgo() {
	return clkgo;
}
public WebElement getClkcheckbox() {
	return clkcheckbox;
}
public WebElement getClkcancel() {
	return clkcancel;
}



}
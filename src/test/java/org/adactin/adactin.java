package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adactin extends BaseClass {
	
	public adactin() {
PageFactory.initElements(driver, this);	}

	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(name="room_type")
	private WebElement roomtype;
	
	@FindBy(name="room_nos")
	private WebElement rooms;
	
	@FindBy(name="datepick_in")
	private WebElement checkindate;
	
	@FindBy(name="datepick_out")
	private WebElement checkoutdate;
	
	@FindBy(name="adult_room")
	private WebElement adultrooms;
	
	@FindBy(name="child_room")
	private WebElement childrenrooms;
	
	@FindBy(name="Submit")
	private WebElement clksubmit;
	
	@FindBy(name="radiobutton_0")
	private WebElement clkrdobtn;
	
	@FindBy(name="continue")
	private WebElement clkrcontinue;
	
	
	

	public WebElement getClkrcontinue() {
		return clkrcontinue;
	}

	public WebElement getClkrdobtn() {
		return clkrdobtn;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultrooms() {
		return adultrooms;
	}

	public WebElement getChildrenrooms() {
		return childrenrooms;
	}

	public WebElement getClksubmit() {
		return clksubmit;
	}
	
	
	
}

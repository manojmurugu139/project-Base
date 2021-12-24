package org.adactin;

import java.util.Date;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class target extends BaseClass {
	@BeforeClass
	private void beforeclass() {
	chromeBrowser();
	urlLaunch("https://adactinhotelapp.com/");
	impWait(5000);
	}
@BeforeMethod
private void beforemethod() {
	System.out.println("Test Starts======="+new Date());
	
	}
@AfterMethod
private void aftermethod() throws InterruptedException {
	System.out.println("Test Ends======="+new Date());

	Thread.sleep(5000);
}
@org.testng.annotations.Parameters({"username","password"})
@Test
private void test(@Optional ("jujkf")String user,String pass) throws InterruptedException {
	Loginpage l=new Loginpage();
	
	sendKey(l.getClkexistname() , user);
	sendKey(l.getExistpass(), pass);
	click(l.getbtnlogin());
	
   adactin a=new adactin();
   
   selectByIndex(a.getLocation(), 6);
   selectByIndex(a.getHotel(), 3);
   selectByIndex(a.getRoomtype(), 1);
   a.getCheckindate().clear();
   sendKey(a.getCheckindate(), "23/12/2021");
   a.getCheckoutdate().clear();
   sendKey(a.getCheckoutdate(), "25/12/2021");
   selectByIndex(a.getAdultrooms(), 2);
   selectByIndex(a.getChildrenrooms(), 2);
   click(a.getClksubmit());
   click(a.getClkrdobtn());
   click(a.getClkrcontinue());
   booknow b=new booknow();
   sendKey(b.getFirstname(), "Manoj");
   sendKey(b.getLastname(), "Murugu");
   sendKey(b.getBillingaddress(), "Thanks");
   sendKey(b.getCardno(), "9809878767656543");
   selectByIndex(b.getCardtype(), 3);
   selectByIndex(b.getMnth(), 9);
   selectByIndex(b.getYear(), 11);
   sendKey(b.getCcvnum(), "345");
   click(b.getBooknum());
   
   System.out.println(getAttribute(b.getPrintordernum()));
  
   cancel c=new cancel();
   click(c.getClkbooked());
   Thread.sleep(30000);
   click(c.getClkgo());
   click(c.getClkcheckbox());
   click(c.getClkcancel());
    simpleAlert();
   
   
   
	
	

	
	


}
}




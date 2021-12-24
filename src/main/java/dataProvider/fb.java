package dataProvider;

import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fb extends BaseClass {
	
	@BeforeClass
	private void beforeclass() {
chromeBrowser();
urlLaunch("https://www.facebook.com/");

		impWait(5000);
	}
	
	@BeforeMethod
	private void beforemethod() throws InterruptedException {
System.out.println("Test Starts======="+new Date());

Thread.sleep(5000);
	}
	
@Test(dataProvider="login",dataProviderClass=dplogin.class)
private void test1(String Username, String Userpass) throws InterruptedException {


	login l=new login();
	sendKey(l.getUsername(), Username);
	sendKey(l.getUserpass(), Userpass);
	//click(l.getBtnlogin());
	

	click(l.getCrteacnt());
	Thread.sleep(5000);
	refresh();
}	

@Test(dataProvider="register",dataProviderClass=dplogin.class)
private void test2(String fname , String lname , String num , String pass ) {
	urlLaunch("https://www.facebook.com/");
	reg r=new reg();
	 sendKey(r.getFirstname(), fname);
	  sendKey(r.getLastname(), lname);
	  sendKey(r.getMobilenum(),num);
	  sendKey(r.getPassword(), pass);
	  click(r.getSubmit());




}
@AfterMethod
private void aftermethod() {
System.out.println("Test Ends======"+new Date());
}
 

}


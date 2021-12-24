package testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.*;

public class sample extends BaseClass {
	
	@BeforeClass
	private void beforeclass() {
System.out.println("Before Class");
        chromeBrowser();
	}	
	@AfterClass
	private void afterclass() {
System.out.println("after class");
quit();

	}
	@BeforeMethod 
	private void beforemethod() {
		System.out.println("Before Method");
		System.out.println("Test Starts------"+new Date());
	}
	
	@AfterMethod
	private void aftermethod() {		
System.out.println("After Class");
    System.out.println("Test Ends---------"+new Date());
	}
	@Test()
	private void test1() {
    System.out.println("test1");
   urlLaunch("https://adactinhotelapp.com/");
   Assert.assertTrue(GetCurrentUrl().contains("Hotel"), "Verrify url");
   

	
	}
	
	@Test
	private void test2() {
    System.out.println("test2");
	}
	
	@Test
	private void test3() {
    System.out.println("test3");
	}
	
}

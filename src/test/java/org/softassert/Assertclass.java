package org.softassert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testng.BaseClass;

public class Assertclass extends BaseClass {
@Test
private void test() {
	chromeBrowser();
	Loginpage l=new Loginpage();
	urlLaunch("https://adactinhotelapp.com/");
	Assert.assertTrue(l.GetCurrentUrl().contains("hotel"), "verify url");
	
	SoftAssert s=new SoftAssert();
    sendKey(l.getClkexistname(), "manoj");
    s.assertEquals(l.getClkexistname(), "manoj","veify user");
    sendKey(l.getExistpass(), "manoj");
    s.assertEquals(l.getExistpass(), "manoj","veify user"); 
    s.assertAll();
  

}
}

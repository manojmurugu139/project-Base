package dataProvider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login extends BaseClass{
	
	public login() {
PageFactory.initElements(driver, this);	
}

	@FindBy(name="email")
	private WebElement Username;
	
	@FindBy(id="pass")
	private WebElement Userpass;
	
	
	@FindBy(name="login")
	private WebElement btnlogin;
	
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement crteacnt;


	public WebElement getUsername() {
		return Username;
	}


	public WebElement getUserpass() {
		return Userpass;
	}


	public WebElement getBtnlogin() {
		return btnlogin;
	}


	public WebElement getCrteacnt() {
		return crteacnt;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

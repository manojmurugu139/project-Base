package dataProvider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class reg extends BaseClass {
	 public reg() {
      PageFactory.initElements(driver, this);
	}
	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(name="reg_email__")
	private WebElement mobilenum;
	
	@FindBy(id="password_step_input")
	private WebElement password;
	
	@FindBy(name="websubmit")
	private WebElement submit;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getMobilenum() {
		return mobilenum;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

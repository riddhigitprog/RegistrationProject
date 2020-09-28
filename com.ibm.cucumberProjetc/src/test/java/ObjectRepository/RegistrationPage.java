package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegistrationPage {
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='firstname']") 
	  WebElement FirstNameInputfield;
	@FindBy(name="lastname") 
	  WebElement LastNameInputfield;
	@FindBy(name="email") 
	  WebElement EmailInputfield;
	@FindBy(name="username") 
	  WebElement UserNameInputfield;
	@FindBy(name="pass1") 
	  WebElement PasswordInputfield;
	@FindBy(name="pass2") 
	  WebElement ConfirmPasswordInputfield;
	@FindBy(id="registration_submit") 
	  WebElement SubmitRegistration;
	public void FirstNameInputfield(String arg1) {
		
		FirstNameInputfield.sendKeys(arg1);
	}
public void LastNameInputfield(String arg1) {
		
		LastNameInputfield.sendKeys(arg1);
	}
public void EmailInputfield(String arg1) {
	
	 EmailInputfield.sendKeys(arg1);
	
}
public void UsernameInputfield(String arg1) {
	UserNameInputfield.sendKeys(arg1);
	
}
public void PasswordInputfield(String arg1) {
	 PasswordInputfield.sendKeys(arg1);
	
}
public void ConfirmPasswordInputfield(String arg1) {
	ConfirmPasswordInputfield.sendKeys(arg1);
	
}
public void ClickRegisterbtn() {
	SubmitRegistration.click();
	
}




}

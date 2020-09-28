package ObjectRepository;

import java.util.Random;

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
	if (arg1.contains("emailregexp")) {
	//	System.out.println("arg 1 is"+arg1);
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		EmailInputfield.sendKeys("username"+ randomInt +"@gmail.com");   
	}else {
		 EmailInputfield.sendKeys(arg1);
	}
}
public void UsernameInputfield(String arg1) {
	if(arg1.contains("usernameregexp")) {
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		UserNameInputfield.sendKeys("username"+ randomInt);
	}else {
	UserNameInputfield.sendKeys(arg1);
	}
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

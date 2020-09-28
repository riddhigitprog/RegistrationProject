package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ObjectRepository.RegistrationPage;
import junit.framework.Assert;
import StepDefinitions.SignUpSteps;
public class HomePage  {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='cm-content']/div/div[2]/div/p[1]") 
	  WebElement RegistrationSuccessMessage;
	@FindBy(xpath="//a[@class='dropdown-toggle']") 
	  WebElement ClickProfileLink;
	@FindBy(xpath="//div[@class='text-center']/p") 
	  WebElement ValidateRegisteredEmail;
	@FindBy(xpath="//a[@title='Inbox']") 
	  WebElement ClickInboxLink;

	
	
	public void ValidateRegistrationSuccess() {
		
	Boolean validate_Registration_Success = RegistrationSuccessMessage.isDisplayed();
	Assert.assertTrue(validate_Registration_Success);
	}
	public void ProfileLink() {
	ClickProfileLink.click();
	}
	public void ValidateRegisteredEmail() {
		
		Boolean validate_Registered_Email = ValidateRegisteredEmail.isDisplayed();
		Assert.assertTrue(validate_Registered_Email);
	}
	public void Inboxlink() {
		ClickInboxLink.click();
		
	}
	
	
}

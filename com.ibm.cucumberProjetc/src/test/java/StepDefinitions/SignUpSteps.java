package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import ObjectRepository.SignUp;
import ObjectRepository.ComposeMailPage;
import ObjectRepository.HomePage;
import ObjectRepository.RegistrationPage;
public class SignUpSteps {
	WebDriver driver;
	@Given("^I navigate to \"(.*?)\"$")
	public void navigateTo(String arg1) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\RiddhimanDe\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		  driver = new EdgeDriver();
		driver.navigate().to(arg1);
		driver.manage().window().maximize();
	}

	@And("^I click on SignUp button$")
	public void clickSignUpButton() throws Exception {
		SignUp signup = new SignUp(driver); 
		signup.SignUplink();
	}
	
	@And("^I enter Firstname the value \"(.*?)\"$")
	public void InputFirstName(String arg1) throws Exception 
	{
		RegistrationPage Firstname = new RegistrationPage(driver);
		Firstname.FirstNameInputfield(arg1);
	}
	
	@And("^I enter Lastname the value \"(.*?)\"$")
	public void InputLastName(String arg1) throws Exception {
	
		RegistrationPage Lastname = new RegistrationPage(driver);
		Lastname.LastNameInputfield(arg1);
	}
        
	@And("^I enter Email the value \"(.*?)\"$")
	public void InputEmail(String arg1) throws Exception {
	
		RegistrationPage Email = new RegistrationPage(driver);
		Email.EmailInputfield(arg1);
	}
	@And("^I enter Username the value \"(.*?)\"$")
	public void InputUsername(String arg1) throws Exception {
	
		RegistrationPage Username = new RegistrationPage(driver);
		Username.UsernameInputfield(arg1);
	}
	@And("^I enter Password the value \"(.*?)\"$")
	public void InputPassword(String arg1) throws Exception {
	
		RegistrationPage Password = new RegistrationPage(driver);
		Password.PasswordInputfield(arg1);
	}
	@And("^I enter ConfirmPassword the value \"(.*?)\"$")
	public void InputConfirmPassword(String arg1) throws Exception {
	
		RegistrationPage ConfirmPassword = new RegistrationPage(driver);
		ConfirmPassword.ConfirmPasswordInputfield(arg1);
	}
	
	@And("^I click on Register button$")
	public void clickRegisterButton() throws Exception {
		RegistrationPage Registerbtn = new RegistrationPage(driver); 
		Registerbtn.ClickRegisterbtn();
	}
	
	@Then("^SignUp success message should be present$")
	public void ValidateSignUpSuccessMsg() throws Exception {
		HomePage succcesmessage = new HomePage(driver); 
		succcesmessage.ValidateRegistrationSuccess();
	}
	
	@Then("^I click on Profile button$")
	public void ClickProfileButton() throws Exception {
		HomePage ClickProfileLink = new HomePage(driver); 
		ClickProfileLink.ProfileLink();
	}
	@Then("^Registered email should be present$")
	public void ValidateRegisteredEmail() throws Exception {
		HomePage RegisteredEmail = new HomePage(driver); 
		RegisteredEmail.ValidateRegisteredEmail();
	}
	@Then("^I click on Inbox button$")
	public void ClickInboxButton() throws Exception {
		HomePage ClickInboxLink = new HomePage(driver); 
		ClickInboxLink.Inboxlink();
		
	}
	@Then("^I click on Compose button$")
	public void ClickComposeButton() throws Exception {
		ComposeMailPage ClickComposeLink = new ComposeMailPage(driver); 
		ClickComposeLink.Composelink();
		
	}
	@And("^I enter SendTo the value \"(.*?)\"$")
	public void InputSendTo(String arg1) throws Exception {
	
		ComposeMailPage SendTo = new ComposeMailPage(driver); 
		SendTo.InputSendTo(arg1);
	}
	@Then("^I click on SendersName link$")
	public void ClickSendersName() throws Exception {
		ComposeMailPage ClickSenderNameLink = new ComposeMailPage(driver); 
		ClickSenderNameLink.ClickSenderNameLink();
		
	}
	@And("^I enter Subject the value \"(.*?)\"$")
	public void InputSubject(String arg1) throws Exception {
	
		ComposeMailPage InputSubject = new ComposeMailPage(driver); 
		InputSubject.InputSubject(arg1);
	}
	@And("^I enter Message the value \"(.*?)\"$")
	public void InputMessage(String arg1) throws Exception {
	
		ComposeMailPage InputMessage = new ComposeMailPage(driver); 
		InputMessage.InputMessage(arg1);
	}
	@Then("^I click on SendMessage button$")
	public void ClicksendMessage() throws Exception {
		ComposeMailPage ClickSendMessage = new ComposeMailPage(driver); 
		ClickSendMessage.ClickSendMessageButton();
		
	}
	@Then("^Email sent success message should be present$")
	public void ValidateEmailSentSuccessMessage() throws Exception {
		ComposeMailPage EmailSentSuccess = new ComposeMailPage(driver); 
		EmailSentSuccess.EmailSuccessmsg();
		driver.close();
		driver.quit();
	}
}

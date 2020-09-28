package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class ComposeMailPage {

	public ComposeMailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@title='Compose message']") 
	  WebElement ClickComposeMailMessage;
	
	@FindBy(xpath="//input[@class='select2-search__field']") 
	  WebElement InputSenderEmail;
	@FindBy(xpath="//span[@class='select2-results']/ul/li[1]") 
	  WebElement ClickSenderEmailName;
	@FindBy(xpath="//input[@id='compose_message_title']") 
	  WebElement InputSubject;
	@FindBy(xpath="//div[@id='cke_1_contents']") 
	  WebElement InputMessage;
	@FindBy(xpath="//button[@id='compose_message_compose']") 
	  WebElement SendMessage;
	@FindBy(xpath="//div[@class='alert alert-success']") 
	  WebElement SentMessagesuccess;
	
	public void Composelink() {
		ClickComposeMailMessage.click();
		
	}

	public void InputSendTo(String arg1) {
		InputSenderEmail.sendKeys(arg1);
		
	}

	public void ClickSenderNameLink() throws InterruptedException {
		Thread.sleep(3000);
		ClickSenderEmailName.click();
	}

	public void InputSubject(String arg1) {
		InputSubject.sendKeys(arg1);
		
	}

	public void InputMessage(String arg1) throws InterruptedException {
		Thread.sleep(5000);
		InputMessage.sendKeys(arg1);
	}

	public void ClickSendMessageButton() {
		
		SendMessage.click();
	}

	public void EmailSuccessmsg() {
		
		Boolean validate_SentMessage_success = SentMessagesuccess.isDisplayed();
		Assert.assertTrue(validate_SentMessage_success);
	}
	
}

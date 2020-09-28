package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	public SignUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),' Sign up! ')]") 
	 private WebElement SignUpbtn;
	
	public void SignUplink() {
		SignUpbtn.click();
		 }

}

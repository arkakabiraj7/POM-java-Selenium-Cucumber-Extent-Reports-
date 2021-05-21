package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.UtilsClass;

public class ForGotPasswrdPage extends UtilsClass {
	
	
	@FindBy(xpath="//*[@id=\"securityAuthentication_userName\"]")
	WebElement uernameBox;
	
	@FindBy(xpath="//*[@id=\"btnSearchValues\"]")
	WebElement resetBtn;
	
	
	
	public ForGotPasswrdPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void EnterUseridAndClickOnReset(String username)
	{
		uernameBox.sendKeys(username);
		resetBtn.click();
	}
	

}

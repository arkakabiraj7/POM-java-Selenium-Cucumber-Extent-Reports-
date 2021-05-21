package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.UtilsClass;

public class LoginPgae extends UtilsClass {
	
	
	@FindBy(xpath="//*[@id=\"txtUsername\"]") 
	WebElement usename;
	
	
	@FindBy(xpath="//*[@id=\"txtPassword\"]") 
	WebElement pwd;
	
	
	@FindBy(xpath="//*[@id=\"btnLogin\"]") 
	WebElement LoginBtn;
	
	
	@FindBy(linkText="Forgot your password?") 
	WebElement ForgotpasswordLnk;
	
	
	
	public LoginPgae()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public HomePage enterCredentialsAndClick(String username,String password)
	{
		usename.sendKeys(username);
		pwd.sendKeys(password);
		LoginBtn.click();
		return new HomePage();
		
	}
	
	
	public ForGotPasswrdPage ClickOnForgotPassword()
	{
		ForgotpasswordLnk.click();
		return new ForGotPasswrdPage();
	}
	
	

}

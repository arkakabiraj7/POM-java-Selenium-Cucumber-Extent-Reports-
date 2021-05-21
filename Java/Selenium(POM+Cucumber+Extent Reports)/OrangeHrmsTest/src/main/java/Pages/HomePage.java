package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.UtilsClass;

public class HomePage extends UtilsClass {
	
	
	@FindBy(xpath="//*[@id=\"welcome\"]") 
	WebElement usenameOnHomePage;
	
	
	@FindBy(xpath="//*[@id=\"txtPassword\"]") 
	WebElement pwd;
	
	
	@FindBy(xpath="//*[@id=\"btnLogin\"]") 
	WebElement LoginBtn;
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public Boolean   verifyUsername()
	{
		
		if(usenameOnHomePage.isDisplayed())
		{
			return true;
		}
		
		else
			
		{
			return false;
		}
		
	}

}

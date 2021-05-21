package StepDefinationsForOrangeHrms;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

import Pages.ForGotPasswrdPage;
import Pages.HomePage;
import Pages.LoginPgae;
import Utils.UtilsClass;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LoginPage extends UtilsClass {
	
	LoginPgae lp=null;
	HomePage hp=null;
	ForGotPasswrdPage fp=null;
	
	@Given("When user in on login page")
	public void when_user_in_on_login_page() {
		
	 System.setProperty("webdriver.chrome.driver","./exe/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
		
	 
	}
	
	@And("enter credentials")
	public void enter_credentials(io.cucumber.datatable.DataTable dataTable) {
		
		List<List<String>> allvals=dataTable.asLists();
		
		String username=allvals.get(1).get(0);
		String password =allvals.get(1).get(2);
		
		lp= new LoginPgae();
		
		hp= lp.enterCredentialsAndClick(username, password);
		
	  //  HomePage hp= new HomePage();
	   
	}
	@SuppressWarnings("deprecation")
	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() {
		
		if(hp.verifyUsername())
		{ 
			Assert.assertTrue(true);
		}
		else
			
			
		{
			Assert.assertFalse(false);
		}
			
	   
	}
	
	
	
	@Given("When user is on login page")
	public void when_user_is_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver","./exe/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	}
	

	@And("user clicks on forgotpassword link")
	public void user_clicks_on_forgotpassword_link() {
		
		lp=new LoginPgae();
		lp.ClickOnForgotPassword();
	   
	}
	@SuppressWarnings("deprecation")
	@Then("user should navigate to forgot password page")
	public void user_should_navigate_to_forgot_password_page() {
		
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode", driver.getCurrentUrl());		
	   
	}
	@And("user enter {string} and  clicks on Reset password")
	public void user_enter_and_clicks_on_reset_password(String string) {
		 fp= new  ForGotPasswrdPage();
	     fp.EnterUseridAndClickOnReset(string);
	}

		
	    		
	  
	
	
	@SuppressWarnings("deprecation")
	@Then("User should get the message {string}")
	public void user_should_get_the_message(String string) {
		
		Assert.assertEquals(true,driver.getPageSource().contains(string));
	   
	}
	
	

	@After
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
	
	
	

}

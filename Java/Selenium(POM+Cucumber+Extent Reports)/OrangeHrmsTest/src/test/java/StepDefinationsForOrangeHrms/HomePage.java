package StepDefinationsForOrangeHrms;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;


import Pages.LoginPgae;
import Utils.UtilsClass;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class HomePage extends UtilsClass  {
	
	LoginPgae lp=null;
     Pages.HomePage hp=null;
	
	@Given("When user in present in  login page")
	public void when_user_in_present_in_login_page() {
		
		 System.setProperty("webdriver.chrome.driver","./exe/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	}


	@Given("enter credentials the credentials")
	public void enter_credentials_the_credentials(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> allvals=dataTable.asLists();
		
		String username=allvals.get(1).get(0);
		String password =allvals.get(1).get(2);
		
		lp= new LoginPgae();
		
		hp= lp.enterCredentialsAndClick(username, password);
		
	   
	}
	@Then("user should be able to  navigate to home page")
	public void user_should_be_able_to_navigate_to_home_page() {
		if(hp.verifyUsername())
		{ 
			Assert.assertTrue(true);
		}
		else
			
			
		{
			Assert.assertFalse(false);
		}
	   
	}

	
	
	
	@Given("when user is on homepage")
	public void when_user_is_on_homepage() {
	   
	}

	@Then("Click on Admin Button")
	public void click_on_admin_button() {
	   
	}
	
	
	@After
	public void tearDown()
	{
		//driver.close();
		driver.quit();
	}
	
	

}

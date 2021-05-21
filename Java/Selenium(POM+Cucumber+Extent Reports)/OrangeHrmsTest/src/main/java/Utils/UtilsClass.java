package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilsClass {
	
	
	public  static WebDriver driver;
	
	
	
	public static void initializeImplicitWait()
	{
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	public static WebDriverWait getExplicitWaitInstyance()
	{
		WebDriverWait w= new WebDriverWait(driver,50);
		return w;
	}
	
	

}

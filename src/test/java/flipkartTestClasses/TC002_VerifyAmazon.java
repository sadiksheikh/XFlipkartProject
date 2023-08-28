package flipkartTestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC002_VerifyAmazon {
  @Test
  public void verifyAmazon() 
  {
	  Reporter.log("Amazom Open", true);
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/ref=nav_logo");
	  
	  driver.manage().window().maximize();
	  Reporter.log("Windows Maximize", true);
	  
	  driver.quit();
	  Reporter.log("Browser is Closed", true);
	  
	  
  }
}

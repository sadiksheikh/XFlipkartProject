package flipkartTestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC003_VerifyMintra {
  @Test
  public void verifyMintra() 
  {
	  Reporter.log("Browser open", true);
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.myntra.com/");
	  
	  driver.manage().window().maximize();
	  Reporter.log("Browser Maximize", true);
	  
	  driver.quit();
	  Reporter.log("Browser Close", true);
  }
}

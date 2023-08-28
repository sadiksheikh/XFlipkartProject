package flipkartTestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC004_VerifyAjio {
  @Test
  public void verifyAjio() 
  {
Reporter.log("Browser Open", true);
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.ajio.com/");
	  
	  driver.manage().window().maximize();
	  Reporter.log("Windows Maximize", true);
	  driver.quit();
	  Reporter.log("Browser is Closed", true);
  }
}

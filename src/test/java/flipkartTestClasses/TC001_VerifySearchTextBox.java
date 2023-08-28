package flipkartTestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC001_VerifySearchTextBox {
  @Test
  public void verifySearchTextBox() 
  {
	  Reporter.log("Browser Open", true);
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.flipkart.com/");
	  
	  driver.manage().window().maximize();
	  Reporter.log("Windows Maximize", true);
	  driver.quit();
	  Reporter.log("Browser is Closed", true);
  }
}

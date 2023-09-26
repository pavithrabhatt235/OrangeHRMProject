package OrangeHRM.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
 
	public WebDriver driver;
 
@BeforeMethod
  public void launchApp()  {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
@AfterMethod
public void closeApp() {
	driver.close();
}
  }


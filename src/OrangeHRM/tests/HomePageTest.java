package OrangeHRM.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import OrangeHRM.pages.HomePage;
import OrangeHRM.pages.LoginPage;
import utilities.ReadDataForHomepage;

public class HomePageTest extends BaseClass{
	HomePage homepage;
	LoginPage loginpage;
	
	@Test(priority = 8,dataProviderClass = ReadDataForHomepage.class,dataProvider ="pim")
    public void pim(String uname,String pwd)   {
		homepage=new HomePage(driver);
		loginpage=new LoginPage(driver);
		
		loginpage.login(uname,pwd);
		homepage.clickOnPIM();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		homepage.employeeListPageIsVisible();
  }
}

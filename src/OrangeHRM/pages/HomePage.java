package OrangeHRM.pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import OrangeHRM.tests.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")WebElement pimTab;
	
	public HomePage(WebDriver d){
		driver=d;
		PageFactory.initElements(driver, this);
	}
	public void clickOnPIM() {
		pimTab.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void employeeListPageIsVisible() {
		String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
}

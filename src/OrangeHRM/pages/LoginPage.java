package OrangeHRM.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import OrangeHRM.tests.BaseClass;

public class LoginPage extends BaseClass{
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")WebElement userName;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")WebElement passWord;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")WebElement loginButton;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")WebElement invalidData;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span")
	public WebElement blankUsername;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span")
	public WebElement blankPassword;
	@FindBy(xpath="//*[text()=\"Forgot your password? \"]")WebElement forgotpassword;
	@FindBy(xpath = "//*[text()=\"Reset Password\"]")WebElement resetPassword;
	
	public LoginPage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
	}
	public void login(String uname,String pwd) {
		userName.clear();
		userName.sendKeys(uname);
		passWord.clear();
		passWord.sendKeys(pwd);
		loginButton.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
	public String invalidCrendentials() {
		String actual_error=invalidData.getText();
		return actual_error;
	}
	public void homePageIsVisble() {
		 String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		 String actualURL=driver.getCurrentUrl();
		 Assert.assertEquals(actualURL, expectedURL);
	}
	public void invalidCredentialsMessage() {
		 String expected_Error="Invalid credentials";
		 String actual_Error=invalidCrendentials();
		 Assert.assertEquals(actual_Error,expected_Error);
	}
	public void errorMessageForBlankUsername() {
		  String expected_Error="Required";
		  String actual_Error=blankUsername.getText();
		  Assert.assertEquals(actual_Error,expected_Error);
	}
	public void errorMessageForBlankPassword() {
		String expected_Error="Required";
		 String actual_Error=blankPassword.getText();
		 Assert.assertEquals(actual_Error,expected_Error);
	}
	public void errorMessageForBlankUsernameAndPassword() {
		 String expected_Error="Required";
		 String actual_error1=blankUsername.getText();
		 String actual_Error=blankPassword.getText();
		 Assert.assertEquals(actual_Error,expected_Error);
		 Assert.assertEquals(actual_error1, expected_Error);
	}
	}

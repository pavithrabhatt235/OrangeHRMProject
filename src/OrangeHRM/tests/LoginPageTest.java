package OrangeHRM.tests;

import org.testng.annotations.Test;
import OrangeHRM.pages.LoginPage;
import utilities.ReadDataForLogin;

public class LoginPageTest extends BaseClass{
	LoginPage loginpage;

  @Test(priority = 1,dataProviderClass = ReadDataForLogin.class,dataProvider ="loginPageTest")
  public void loginPageTest(String uname,String pwd) throws Exception {
	  loginpage=new LoginPage(driver);
	  loginpage.login(uname,pwd);
	  loginpage.homePageIsVisble();
	  }
 
 @Test(priority=2,dataProviderClass = ReadDataForLogin.class,dataProvider ="verifyWithInvadidUsername")
  public void verifyWithInvadidUsername(String uname,String pwd) {
	  loginpage=new LoginPage(driver);
	  loginpage.login(uname,pwd);
	  loginpage.invalidCredentialsMessage();
  }

 @Test(priority = 3,dataProviderClass = ReadDataForLogin.class,dataProvider ="verifyWithBlankUsername")
 public void verifyWithBlankUsername(String uname,String pwd) {
	  loginpage=new LoginPage(driver);
	  loginpage.login(uname,pwd);
	  loginpage.errorMessageForBlankUsername();
 }

 @Test(priority = 4,dataProviderClass = ReadDataForLogin.class,dataProvider ="verifyWithBlankPassword")
 public void verifyWithBlankPassword(String uname,String pwd) {
	 loginpage=new LoginPage(driver);
	 loginpage.login(uname,pwd);
	 loginpage.errorMessageForBlankPassword();
 }
 
 @Test(priority = 5,dataProviderClass = ReadDataForLogin.class,dataProvider ="verifyWithInvalidPassword")
 public void verifyWithInvalidPassword(String uname,String pwd) {
	  loginpage=new LoginPage(driver);
	  loginpage.login(uname,pwd);
	  loginpage.invalidCredentialsMessage();
 }
 
 @Test(priority = 6,dataProviderClass = ReadDataForLogin.class,dataProvider ="verifyLoginWithInvalidCredentials")
 public void verifyLoginWithInvalidCredentials(String uname,String pwd) {
	 	  loginpage=new LoginPage(driver);
		  loginpage.login(uname,pwd);
		  loginpage.invalidCredentialsMessage();
}
 
 @Test(priority = 7,dataProviderClass = ReadDataForLogin.class,dataProvider ="verifyLoginWithBlankCredentials")
 public void verifyLoginWithBlankCredentials(String uname,String pwd) {
	 loginpage=new LoginPage(driver);
	 loginpage.login(uname,pwd);
	 loginpage.errorMessageForBlankUsernameAndPassword();
 }
 }

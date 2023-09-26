package utilities;

import org.testng.annotations.DataProvider;

public class ReadDataForLogin {

	@DataProvider(name="loginPageTest")
	public Object[][]loginpagetest1(){
		return new Object[][] {{"Admin","Admin123"}};
}
	@DataProvider(name="verifyWithInvadidUsername")
	public Object[][]loginpagetest2(){
		return new Object[][] {{"Adm","Admin123"}};
}
	@DataProvider(name="verifyWithBlankUsername")
	public Object[][]loginpagetest3(){
		return new Object[][] {{"","Admin123"}};
}
	@DataProvider(name="verifyWithBlankPassword")
	public Object[][]loginpagetest4(){
		return new Object[][] {{"Admin",""}};
}
	@DataProvider(name="verifyWithInvalidPassword")
	public Object[][]loginpagetest5(){
		return new Object[][] {{"Admin","admin12"}};
	}
	@DataProvider(name="verifyLoginWithInvalidCredentials")
	public Object[][]loginpagetest6(){
		return new Object[][] {{"Adm","admin12"}};
	}
	@DataProvider(name="verifyLoginWithBlankCredentials")
	public Object[][]loginpagetest7(){
		return new Object[][] {{"",""}};
	}
}
		
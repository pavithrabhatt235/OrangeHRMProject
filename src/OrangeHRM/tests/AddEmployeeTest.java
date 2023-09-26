package OrangeHRM.tests;

import org.testng.annotations.Test;

import OrangeHRM.pages.AddEmployeePage;
import OrangeHRM.pages.HomePage;
import OrangeHRM.pages.LoginPage;
import utilities.ReadDataForAddEmployee;

public class AddEmployeeTest extends BaseClass {
	HomePage homepage;
	AddEmployeePage add_emp1;
	LoginPage loginpage;
	
 @Test(priority = 9,dataProviderClass = ReadDataForAddEmployee.class,dataProvider ="verifyAddEmployeepage")
  public void verifyAddEmployeepage(String uname,String pwd,String fname,String mname,String lname,String empID,String photo) throws Exception {
		homepage=new HomePage(driver);
		loginpage=new LoginPage(driver);
		add_emp1=new AddEmployeePage(driver);
		loginpage.login(uname,pwd);
		
			homepage.clickOnPIM();
			add_emp1.addEmployeeTab();
			add_emp1.typeFirstname(fname);
			add_emp1.typeMiddlename(mname);
			add_emp1.typeLastname(lname);
			add_emp1.typeEmployeeID(empID);
			add_emp1.addPhoto(photo);
			add_emp1.save();
			add_emp1.personalDetailsPageIsVisible();
		  }

@Test(priority = 10,dataProviderClass = ReadDataForAddEmployee.class,dataProvider ="verifyCreateLoginDetails")
	public void verifyCreateLoginDetails(String uname,String pwd,String fname,String mname,String lname,String empID,String photo,String name,String password,String confirmpwd) throws Exception  {
		homepage=new HomePage(driver);
		loginpage=new LoginPage(driver);
		add_emp1=new AddEmployeePage(driver);
		loginpage.login(uname,pwd);
		homepage.clickOnPIM();
			
			add_emp1.addEmployeeTab();
			add_emp1.typeFirstname(fname);
			add_emp1.typeMiddlename(mname);
			add_emp1.typeLastname(lname);
			add_emp1.typeEmployeeID(empID);
			add_emp1.addPhoto(photo);
			add_emp1.createLoginDeatails();
			add_emp1.typeUsername(name);
			add_emp1.typePassword(password);
			add_emp1.typeConfirmPassword(confirmpwd);
			add_emp1.selectStatus();
			add_emp1.save();
			add_emp1.personalDetailsPageIsVisible();
			  }

@Test(priority=11,dataProviderClass = ReadDataForAddEmployee.class,dataProvider ="verifyWithfnameAndlname")
public void verifyWithfnameAndlname(String uname,String pwd,String fname,String lname) throws Exception {
	homepage=new HomePage(driver);
	loginpage=new LoginPage(driver);
	add_emp1=new AddEmployeePage(driver);
	
	loginpage.login(uname,pwd);
	homepage.clickOnPIM();
	add_emp1.addEmployeeTab();
	add_emp1.typeFirstname(fname);
	add_emp1.typeLastname(lname);
	add_emp1.save();
	add_emp1.personalDetailsPageIsVisible();
}

@Test(priority = 12,dataProviderClass = ReadDataForAddEmployee.class,dataProvider ="verifyWithEmployeeID")
public void verifyWithEmployeeID(String uname,String pwd,String fname,String lname,String empID) {
	homepage=new HomePage(driver);
	loginpage=new LoginPage(driver);
	add_emp1=new AddEmployeePage(driver);
	
	loginpage.login(uname,pwd);
	homepage.clickOnPIM();
	add_emp1.addEmployeeTab();
	add_emp1.typeFirstname(fname);
	add_emp1.typeLastname(lname);
	add_emp1.typeEmployeeID(empID);
	add_emp1.save();
	add_emp1.personalDetailsPageIsVisible();
}

@Test(priority = 13,dataProviderClass = ReadDataForAddEmployee.class,dataProvider ="verifyCancelButton")
public void verifyCancelButton(String uname,String pwd,String fname,String lname,String empID) throws Exception {
	homepage=new HomePage(driver);
	loginpage=new LoginPage(driver);
	add_emp1=new AddEmployeePage(driver);
	loginpage.login(uname,pwd);
	homepage.clickOnPIM();
	add_emp1.addEmployeeTab();
	add_emp1.typeFirstname(fname);
	add_emp1.typeLastname(lname);
	add_emp1.typeEmployeeID(empID);
	add_emp1.cancel();
	add_emp1.employeeInformationPageIsVisible();
		}

@Test(priority=14,dataProviderClass = ReadDataForAddEmployee.class,dataProvider ="verifyWithBlankFnameandLname")
public void verifyWithBlankFnameandLname(String uname,String pwd,String fname,String lname,String empID) {
	homepage=new HomePage(driver);
	loginpage=new LoginPage(driver);
	add_emp1=new AddEmployeePage(driver);
	loginpage.login(uname,pwd);
	homepage.clickOnPIM();
	add_emp1.addEmployeeTab();
	add_emp1.typeFirstname(fname);
	add_emp1.typeLastname(lname);
	add_emp1.typeEmployeeID(empID);
	add_emp1.save();
	add_emp1.errorMesaage();
}

@Test(priority = 15,dataProviderClass = ReadDataForAddEmployee.class,dataProvider ="verifyWithInvalidUsername")
public void verifyWithInvalidUsername(String uname,String pwd,String fname,String mname,String lname,String empID,String photo,String name,String password,String confirmpwd) throws Exception {
	homepage=new HomePage(driver);
	loginpage=new LoginPage(driver);
	add_emp1=new AddEmployeePage(driver);
	loginpage.login("Admin", "admin123");
	homepage.clickOnPIM();
	
	add_emp1.addEmployeeTab();
	add_emp1.typeFirstname(fname);
	add_emp1.typeMiddlename(mname);
	add_emp1.typeLastname(lname);
	add_emp1.typeEmployeeID(empID);
	add_emp1.addPhoto(photo);
	add_emp1.createLoginDeatails();
	add_emp1.typeUsername(name);
	add_emp1.typePassword(password);
	add_emp1.typeConfirmPassword(confirmpwd);
	add_emp1.selectStatus();
	add_emp1.save();
	add_emp1.errorMessageForUsername();
}

@Test(priority = 16,dataProviderClass = ReadDataForAddEmployee.class,dataProvider ="verifyWithInvalidPassword")
public void verifyWithInvalidPassword(String uname,String pwd,String fname,String mname,String lname,String empID,String photo,String name,String password,String confirmpwd) throws Exception {
	homepage=new HomePage(driver);
	loginpage=new LoginPage(driver);
	add_emp1=new AddEmployeePage(driver);
	loginpage.login(uname,pwd);
	homepage.clickOnPIM();
	
	add_emp1.addEmployeeTab();
	add_emp1.typeFirstname(fname);
	add_emp1.typeMiddlename(mname);
	add_emp1.typeLastname(lname);
	add_emp1.typeEmployeeID(empID);
	add_emp1.addPhoto(photo);
	add_emp1.createLoginDeatails();
	add_emp1.typeUsername(name);
	add_emp1.typePassword(password);
	add_emp1.typeConfirmPassword(confirmpwd);
	add_emp1.selectStatus();
	add_emp1.save();
	add_emp1.errorMessageForPasswor();
	}

@Test(priority = 17,dataProviderClass = ReadDataForAddEmployee.class,dataProvider ="verifyConfirmPasswordErrmsg")
public void verifyConfirmPasswordErrmsg(String uname,String pwd,String fname,String mname,String lname,String empID,String photo,String name,String password,String confirmpwd) throws Exception {
	homepage=new HomePage(driver);
	loginpage=new LoginPage(driver);
	add_emp1=new AddEmployeePage(driver);
	loginpage.login(uname,pwd);
	homepage.clickOnPIM();
	
	add_emp1.addEmployeeTab();
	add_emp1.typeFirstname(fname);
	add_emp1.typeMiddlename(mname);
	add_emp1.typeLastname(lname);
	add_emp1.typeEmployeeID(empID);
	add_emp1.addPhoto(photo);
	add_emp1.createLoginDeatails();
	add_emp1.typeUsername(name);
	add_emp1.typePassword(password);
	add_emp1.typeConfirmPassword(confirmpwd);
	add_emp1.selectStatus();
	add_emp1.save();
	add_emp1.errorMessageForMismatchPassword();
}

@Test(priority = 18,dataProviderClass = ReadDataForAddEmployee.class,dataProvider ="verifyWithInvalidFormat")
public void verifyWithInvalidFormat(String uname,String pwd,String fname,String mname,String lname,String empID,String photo) throws Exception {
	homepage=new HomePage(driver);
	loginpage=new LoginPage(driver);
	add_emp1=new AddEmployeePage(driver);
	loginpage.login(uname,pwd);
	homepage.clickOnPIM();
	
	add_emp1.addEmployeeTab();
	add_emp1.typeFirstname(fname);
	add_emp1.typeMiddlename(mname);
	add_emp1.typeLastname(lname);
	add_emp1.typeEmployeeID(empID);
	add_emp1.addPhoto(photo);
	add_emp1.photoWithInvalidFileFormat();
}

@Test(priority=19,dataProviderClass = ReadDataForAddEmployee.class,dataProvider ="verifyWithInvalidEmployeeID")
	public void verifyWithInvalidEmployeeID(String uname,String pwd,String fname,String mname,String lname,String empID)  {
	homepage=new HomePage(driver);
	loginpage=new LoginPage(driver);
	add_emp1=new AddEmployeePage(driver);
	loginpage.login(uname,pwd);
	homepage.clickOnPIM();
	add_emp1.addEmployeeTab();
	add_emp1.typeFirstname(fname);
	add_emp1.typeMiddlename(mname);
	add_emp1.typeLastname(lname);
	add_emp1.typeEmployeeID(empID);
	add_emp1.errorMessageForInvalidEmployeeID();
	}
}





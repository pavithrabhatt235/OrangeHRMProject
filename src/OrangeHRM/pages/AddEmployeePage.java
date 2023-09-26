package OrangeHRM.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import OrangeHRM.tests.BaseClass;

public class AddEmployeePage extends BaseClass{

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")WebElement addEmployee;
	@FindBy(xpath="//*[@name=\"firstName\"]")WebElement firstname;
	@FindBy(xpath="//*[@name=\"middleName\"]")WebElement middlename;
	@FindBy(xpath="//*[@name=\"lastName\"]")WebElement lastname;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")WebElement employeeID;
	@FindBy(xpath="//*[text()=\" Save \"]")WebElement saveButton;
	@FindBy(xpath="//*[text()=\" Cancel \"]")WebElement cancelButton;
	@FindBy(xpath="//*[text()=\"Create Login Details\"]")WebElement createLoginDetails;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")WebElement createLoginCheckbox;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")WebElement username;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")WebElement password;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")WebElement confirmPassword;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button/i")WebElement uploadPhoto;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div/label")WebElement status;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/h6")
	public WebElement personalDetails;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")
	public WebElement EmpInformation;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/span")
	public WebElement errormsg;
	@FindBy(xpath="//*[text()=\"Should be at least 5 characters\"]")
	public WebElement invalidUsername;
	@FindBy(xpath = "//*[text()=\"Should have at least 7 characters\"]")
	public WebElement invalidPassword;
	@FindBy(xpath="//*[text()=\"Passwords do not match\"]")
	public WebElement mismatchPassword;
	@FindBy(xpath="//*[text()=\"File type not allowed\"]")
	public WebElement invalidFiletype;
	@FindBy(xpath="//*[text()=\"Should not exceed 10 characters\"]")
	public WebElement invalidEmployeeID;
	
	public AddEmployeePage(WebDriver d){
		driver=d;
		PageFactory.initElements(driver, this);
	}
	public void addEmployeeTab() {
		addEmployee.click();
	}
	public void typeFirstname(String fname) {
		firstname.sendKeys(fname);
	}
	public void typeMiddlename(String mname) {
		middlename.sendKeys(mname);
	}
	public void typeLastname(String lname) {
		lastname.sendKeys(lname);
	}
	public void typeEmployeeID(String empID) {
		employeeID.sendKeys(empID);
	}
	public void createLoginDeatails() {
		createLoginCheckbox.click();
	}
	public void typeUsername(String uname) {
		username.sendKeys(uname);
	}
	public void typePassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void typeConfirmPassword(String cpwd) {
		confirmPassword.sendKeys(cpwd);
	}
	public void addPhoto(String path) throws Exception {
		uploadPhoto.click();
		Robot rb=new Robot();
		rb.delay(2000);
		StringSelection ss=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	public void selectStatus() {
		status.isSelected();
	}
	public void save() {
		saveButton.click();
	}
	public void cancel() {
		cancelButton.click();
	}
	public void personalDetailsPageIsVisible() {
		String expected="Personal Details";
		String actual=personalDetails.getText();
		Assert.assertEquals(actual, expected);
	}
	public void employeeInformationPageIsVisible() {
		String expected_result="Employee Information";
		String actual_result=EmpInformation.getText();
		Assert.assertEquals(actual_result, expected_result);
}
	public void errorMesaage() {
		String expected_error="Required";
		String actual_error=errormsg.getText();
		Assert.assertEquals(actual_error, expected_error);
	}
	public void errorMessageForUsername() {
		String expected_errmsg="Should be at least 5 characters";
		String actual_errmsg=invalidUsername.getText();
		Assert.assertEquals(actual_errmsg, expected_errmsg);
	}
	public void errorMessageForPasswor() {
		String expected_errmsg="Should have at least 7 characters";
		String actual_errmsg=invalidPassword.getText();
		Assert.assertEquals(actual_errmsg, expected_errmsg);
	}
	public void errorMessageForMismatchPassword() {
		String expected_errormsg="Passwords do not match";
		String actual_errormsg=mismatchPassword.getText();
		Assert.assertEquals(actual_errormsg, expected_errormsg);
	}
	public void photoWithInvalidFileFormat() {
		String expected_errormsg="File type not allowed";
		String actual_errormsg=invalidFiletype.getText();
		Assert.assertEquals(actual_errormsg, expected_errormsg);
	}
	public void errorMessageForInvalidEmployeeID() {
		String expected_errmsg="Should not exceed 10 characters";
		String actual_errmsg=invalidEmployeeID.getText();
		Assert.assertEquals(expected_errmsg, actual_errmsg);
}
}
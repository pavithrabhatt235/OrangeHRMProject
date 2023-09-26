package utilities;

import org.testng.annotations.DataProvider;

public class ReadDataForAddEmployee {
	@DataProvider(name="verifyAddEmployeepage")
	public Object[][]addemployeetest1(){
		return new Object[][] {{"Admin","admin123","adarsh1","a","sagar1","02349","C:\\Users\\HP\\Desktop\\flower.jpg"}};
}
	@DataProvider(name="verifyCreateLoginDetails")
	public Object[][]addemployeetest2(){
		return new Object[][] {{"Admin","admin123","abhilash","a","sagara","023456","C:\\Users\\HP\\Desktop\\flower.jpg","abhilash","abcde123XYZ$28","abcde123XYZ$28"}};
}
	@DataProvider(name="verifyWithfnameAndlname")
	public Object[][]addemployeetest3(){
		return new Object[][] {{"Admin","admin123","aditya","s"}};
}
	@DataProvider(name="verifyWithEmployeeID")
	public Object[][]addemployeetest4(){
		return new Object[][] {{"Admin","admin123","aditya","s","12345"}};
}
	@DataProvider(name="verifyCancelButton")
	public Object[][]addemployeetest5(){
		return new Object[][] {{"Admin","admin123","aditya","s","12345"}};
}
	@DataProvider(name="verifyWithBlankFnameandLname")
	public Object[][]addemployeetest6(){
		return new Object[][] {{"Admin","admin123","","","12345"}};
}
	@DataProvider(name="verifyWithInvalidUsername")
	public Object[][]addemployeetest7(){
		return new Object[][] {{"Admin","admin123","","","12345"}};
}
	@DataProvider(name="verifyWithInvalidUsername")
	public Object[][]addemployeetest8(){
		return new Object[][] {{"Admin","admin123","abhishek","a","sagara","023496","C:\\Users\\HP\\Desktop\\flower.jpg","abc","12345XYzab","12345XYzab"}};
}
	@DataProvider(name="verifyWithInvalidPassword")
	public Object[][]addemployeetest9(){
		return new Object[][] {{"Admin","admin123","abhishek","a","sagara","023496","C:\\Users\\HP\\Desktop\\flower.jpg","abhishek","1234","1234"}};
}
	@DataProvider(name="verifyConfirmPasswordErrmsg")
	public Object[][]addemployeetest10(){
		return new Object[][] {{"Admin","admin123","abhishek","a","sagara","023496","C:\\Users\\HP\\Desktop\\flower.jpg","abhishek","1234XYZabc","234XYZab"}};
}
	@DataProvider(name="verifyWithInvalidFormat")
	public Object[][]addemployeetest11(){
		return new Object[][] {{"Admin","admin123","abhishek","a","sagara","023496","C:\\Users\\HP\\Desktop\\otherformat.txt"}};
}
	@DataProvider(name="verifyWithInvalidEmployeeID")
	public Object[][]addemployeetest12(){
		return new Object[][] {{"Admin","admin123","abhishek","a","sagara","023496234567"}};
}
}

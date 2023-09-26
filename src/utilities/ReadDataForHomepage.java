package utilities;

import org.testng.annotations.DataProvider;

public class ReadDataForHomepage {

	@DataProvider(name="pim")
	public Object[][]homepagetest1(){
		return new Object[][] {{"Admin","admin123"}};
}
}

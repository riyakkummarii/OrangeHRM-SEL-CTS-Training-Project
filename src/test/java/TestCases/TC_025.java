package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Wrappers.DemoprojWrappers;

public class TC_025 extends DemoprojWrappers{
	@Test(dataProvider="fetchData")
	public void tc25(String username,String password)
	{  String error="Username cannot be empty";
		
		new LoginPage()
		.clickLogin()
		
        ;	
		new LoginPage()
				.checkNullCredentials(error)
				
				;

	}
		
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testDescription="Checking the Login button functionality keeoing the username and password field null";
	}
}

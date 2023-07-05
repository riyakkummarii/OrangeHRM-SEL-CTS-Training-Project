package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Wrappers.DemoprojWrappers;

public class Logout extends DemoprojWrappers{
	@Test(dataProvider="fetchData")
	public void loginuser(String username,String password)
	{ new LoginPage()
		.enterUserName(username)
		.enterPasswqord(password)
		.clickLogin()
		.ClickAdminDropDown()
		.ClickLogout()
        ;
	
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testCaseName="Verify the Login functionality";
		testDescription="Check whether user is able to login successfully";
	}

}

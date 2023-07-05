package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Wrappers.DemoprojWrappers;

public class ChangePassword extends DemoprojWrappers{
	@Test(dataProvider="fetchData")
	public void changepassword(String username,String password,String newpass)
	{ new LoginPage()
		.enterUserName(username)
		.enterPasswqord(password)
		.clickLogin()
		.ClickAdminDropDown()
		.ClickChangePassword()
		.enterCurrentPassword(password)
		.enterNewPassword(newpass)
		.enterConfirmPassword(newpass)
		.clickSave()
        ;
	
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="ChangePassword";
		testCaseName="Verify the Login functionality";
		testDescription="Check whether user is able to login successfully";
	}


}

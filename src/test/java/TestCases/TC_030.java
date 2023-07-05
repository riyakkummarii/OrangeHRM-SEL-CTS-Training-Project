package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Wrappers.DemoprojWrappers;

public class TC_030 extends DemoprojWrappers{

	@Test(dataProvider="fetchData")
	public void tc30(String username,String password)
	{  
		//Actual Test case 41
		new LoginPage()
		.enterUserName(username)
		.enterPasswqord(password)
		.clickLogin()
		.ClickAdminDropDown()
		.ClickLogout()
		.checkSucessfullLogout()
        ;
				
	}

	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testDescription="To check the Logout functionality";
	}
}

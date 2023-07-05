package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Wrappers.DemoprojWrappers;

public class EditEmployeePersonalDetails extends DemoprojWrappers{
	@Test(dataProvider="fetchData")
	public void loginuser(String username,String password) throws InterruptedException
	{ new LoginPage()
		.enterUserName(username)
		.enterPasswqord(password)
		.clickLogin()
		.ClickPIM()
		.clickEmployeeList()
		.clickanEmployeetoEdit()
        ;
	
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="PersonalDetails";
		testCaseName="Verify the Login functionality";
		testDescription="Check whether user is able to login successfully";
	}

}

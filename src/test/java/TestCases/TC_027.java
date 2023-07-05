package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.RetryLoginPage;
import Wrappers.DemoprojWrappers;

public class TC_027 extends DemoprojWrappers{
	@Test(dataProvider="fetchData")
	public void tc27(String username,String password)
	{  String error="Retry Login";
		new LoginPage()
		.enterUserName(username)
		.enterPasswqord("kfjkdsfksdh")
		.clickLogin()
		
        ;
		new RetryLoginPage()
		.checkErrorMessage(error)
		;
	
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testDescription="Including invalid details (anything except what Password was sent in mail )for the Password text box and keeping Username valid and clicking the Login button";
	}
}

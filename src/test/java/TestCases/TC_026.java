package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.RetryLoginPage;
import Wrappers.DemoprojWrappers;

public class TC_026 extends DemoprojWrappers{
	@Test(dataProvider="fetchData")
	public void tc26(String username,String password)
	{  String error="Retry Login";
		new LoginPage()
		.enterUserName("adm")
		.enterPasswqord(password)
		.clickLogin()
		
        ;
		new RetryLoginPage()
		.checkErrorMessage(error)
		;
	
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testDescription="Including invalid details (anything except what username was sent in mail )for the UserName text box and keeping password valid and clicking the Login button";
	}
}

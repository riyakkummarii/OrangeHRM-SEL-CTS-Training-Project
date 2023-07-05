package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Wrappers.DemoprojWrappers;

public class TC_39 extends DemoprojWrappers{

	@Test(dataProvider="fetchData")
	public void tc39(String u,String password)
	{  
		new LoginPage()
		.enterUserName(u)
		.enterPasswqord("Kc1zUTHf@")
		.clickLogin()
        ;
				
	}

	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testDescription="To check the Logout functionality";
	}
}

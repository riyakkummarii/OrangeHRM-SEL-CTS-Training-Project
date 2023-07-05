package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Wrappers.DemoprojWrappers;

public class TC_38 extends DemoprojWrappers{

	@Test(dataProvider="fetchData")
	public void tc38(String u,String password)
	{  
		new LoginPage()
		.enterUserName("Administrator")
		.enterPasswqord(password)
		.clickLogin()
        ;
				
	}

	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testDescription="To check the Logout functionality";
	}
}

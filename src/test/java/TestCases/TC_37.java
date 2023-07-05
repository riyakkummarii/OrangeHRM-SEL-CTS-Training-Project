package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Wrappers.DemoprojWrappers;

public class TC_37 extends DemoprojWrappers{

	@Test(dataProvider="fetchData")
	public void tc37(String u,String password)
	{  
		new LoginPage()
		.enterUserName("")
		.enterPasswqord("")
		.clickLogin()
        ;
				
	}

	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testDescription="To check the Logout functionality";
	}
}

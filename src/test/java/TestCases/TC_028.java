package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Wrappers.DemoprojWrappers;

public class TC_028 extends DemoprojWrappers{
	@Test(dataProvider="fetchData")
	public void tc28(String username,String password)
	{  		new LoginPage()
		.enterUserName(username)
		.enterPasswqord(password)
		
		.checkPasswordIsMasked()
		
        ;
			
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testDescription="To check if password is displayed on screen in encrypted manner";
	}
}

package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Wrappers.DemoprojWrappers;

public class TC_59 extends DemoprojWrappers{

	@Test(dataProvider="fetchData")
	public void tc59(String username,String password) throws InterruptedException
	{  
		new LoginPage()
		.enterUserName(username)
		.enterPasswqord(password)
		.clickLogin()
		.clickPerformance()
		.clickAppraisals()
		.clickAppraisalslist()
		
        ;
				
	}

	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testDescription="To check the save button functionality after pay grade and currency has been set";
	}
}

package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Wrappers.DemoprojWrappers;

public class TC_58 extends DemoprojWrappers{

	@Test(dataProvider="fetchData")
	public void tc58(String username,String password) throws InterruptedException
	{  
		new LoginPage()
		.enterUserName(username)
		.enterPasswqord(password)
		.clickLogin()
		.clickPerformance()
		.clickAppraisals()
		.clickAppraisalslist()
		.clickonAddAppraisals()
		
		
        ;
				
	}

	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testDescription="To check the save button fucntionality for all null inputs";
	}
}

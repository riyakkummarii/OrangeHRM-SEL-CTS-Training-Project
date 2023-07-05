package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Wrappers.DemoprojWrappers;

public class TC_57 extends DemoprojWrappers{

	@Test(dataProvider="fetchData")
	public void tc57(String username,String password) throws InterruptedException
	{  
		new LoginPage()
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
		dataSheetName="Login";
		testDescription="To check the save button functionality after pay grade and currency has been set";
	}
}

package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Wrappers.DemoprojWrappers;

public class TC_029 extends DemoprojWrappers{
	@Test(dataProvider="fetchData")
	public void tc29(String username,String password)
	{  String text="Admin";
		new LoginPage()
		.enterUserName(username)
		.enterPasswqord(password)
		.clickLogin()
		.checkProfilePage(text)
        ;
				
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testDescription="Including valid details for both the username and password field and clicking the Login button.";
	}
}

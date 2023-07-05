package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Wrappers.DemoprojWrappers;

public class TC_45 extends DemoprojWrappers{
	@Test(dataProvider="fetchData")
	public void number42(String username,String password,String Name,String	State,String City,String Postal ,String	Phone,String Fax,String	Address,String notes)
	{   
		
		new LoginPage()
		.enterUserName(username)
		.enterPasswqord("Kfgyfgsdhgf54642@")
		.clickLogin()
		.ClickAdmin()
		.ClickOrganization()
		.ClickLocations()                                
		.clickAddLocationIcon()
		.enterName("")
		.selectCountry()
		.selectTimeZone()
		.enterState("")
		.enterCity("")
		.enterPinCode("")
		.enterPhone("")
		.enterFax("")
		.enterAddress("")
		.enterNotes("")
		.clickSave()
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Locations";

		testCaseName="Verify the Login functionality";
		testDescription="Check whether user is able to login successfully";
	}
	
	

}

package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Wrappers.DemoprojWrappers;

public class AddEmployee extends DemoprojWrappers{

	@Test(dataProvider="fetchData")
	public void addEmployee(String username,String password,String fname,String mname,String lname,String empid,String uname,String pass) throws InterruptedException
	{ new LoginPage()
		.enterUserName(username)
		.enterPasswqord(password)
		.clickLogin()
		.ClickPIM()
		.ClickAddEmployee()
		.clickCreateLoginDetails()
		.enterFirstName(fname)
		.enterMiddleName(mname)
		.enterLastName(lname)
		.enterusername(uname)
		.selectLocation()
		.enterpassword(pass)
		.enterConfirmPassword(pass)
		.selectESSRole()
		.selectSupervisorRole()
		.selectAdminRole()
		.clickSave()
        ;
	
		
	}
	
	@BeforeClass
	public void beforeClass() {
		dataSheetName="AddEmployee";
		testCaseName="Verify the Login functionality";
		testDescription="Check whether user is able to login successfully";
	}

}

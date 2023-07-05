package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.OrangeHRM_HomePage;
import Wrappers.DemoprojWrappers;

public class TC_023 extends DemoprojWrappers
{
	@Test(dataProvider="fetchData")

	public void tc23(String fname,String lname,String cname,String phone,String jobtitle,String email,String comment  )
	{Actions act = new Actions(driver);
    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
    driver.get("https://www.orangehrm.com/");
    String error1="Please complete this required field.";
    String error2="Please select an option from the dropdown menu.";
    String error3="Please complete all required fields.";
           new OrangeHRM_HomePage()
            .clickContactSalesButton()
            .clickSubmit()
            .checkFirstName(error1)
            .checkLastName(error1)
            .checkJobTitle(error1)
            .checkCompanyName(error1)
            .checkCountry(error2)
            .checkEmail(error1)
            .checkPhone(error1)
            .checkComment(error1)
            .checkNoOfEmployees(error2)
            .checkSubmitForALLNull(error3)
         ;
  
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Contact Sales";
		
		testDescription="To check the Submit Button functionality keeping all fields null";
	}


}

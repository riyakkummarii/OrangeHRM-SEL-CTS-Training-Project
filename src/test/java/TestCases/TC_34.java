package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.ContactSalesPage;
import Pages.OrangeHRM_HomePage;
import Wrappers.DemoprojWrappers;

public class TC_34 extends DemoprojWrappers{
	
		@Test(dataProvider="fetchData")
		public void number34(String fname,String lname,String cname,String phone,String jobtitle,String email,String comment  )
		{ Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
        driver.get("https://www.orangehrm.com/");
        new OrangeHRM_HomePage()
        .clickContactSalesButton()
        ;
        new ContactSalesPage()
        .enterFirstName("")
        .enterLastName("")
        .enterCompanyName("")
        .enterPhoneNumber("")
        .selectNoOfEmployees()
        .enterEmail("")
        .enterJobTitle("")
        .enterComment("")
        .AcceptCookies()
        .selectCountry() 
        .clickSubmit()
        ;
      
			
		}
		@BeforeClass
		public void beforeClass() {
			dataSheetName="Contact Sales";
			testCaseName="Verify the Contact Sales functionality";
			testDescription="Check whether user is able to Contact the OrangeHRM successfully";
		}

}

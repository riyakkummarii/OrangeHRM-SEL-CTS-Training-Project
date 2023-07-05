package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.OrangeHRM_HomePage;
import Wrappers.DemoprojWrappers;

public class TC_021 extends DemoprojWrappers
{
	@Test(dataProvider="fetchData")

	public void tc21(String fname,String lname,String cname,String phone,String jobtitle,String email,String comment  )
	{Actions act = new Actions(driver);
    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
    driver.get("https://www.orangehrm.com/");
    String text="Must contain only numbers, +()-. and x.";
        new OrangeHRM_HomePage()
    .clickContactSalesButton()
    .enterFirstName(fname)
    .enterLastName(lname)
    .enterCompanyName(cname)
    .enterPhoneNumber("565fffd")
    .selectNoOfEmployees()
    .enterEmail(email)
    .enterJobTitle(jobtitle)
    .enterComment(comment)
    .AcceptCookies()
    .selectCountry() 
    .clickSubmit()
    .assertCheckPhone(text)
    
    ;
  
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Contact Sales";
		
		testDescription="Including invalid details ( alphabetical/special character )for the phone number text box and keeping all other details valid and clicking the submit button";
	}


}

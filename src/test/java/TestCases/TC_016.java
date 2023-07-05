package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.OrangeHRM_HomePage;
import Wrappers.DemoprojWrappers;

public class TC_016
extends DemoprojWrappers{
	@Test(dataProvider="fetchData")

	public void tc16(String fname,String lname,String cname,String phone,String jobtitle,String email,String comment  )
	{Actions act = new Actions(driver);
    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
    driver.get("https://www.orangehrm.com/");
    String error="First Name cannot contain more than 20 characters.";
    new OrangeHRM_HomePage()
    .clickContactSalesButton()
    .enterFirstName("RiyaKumariHemsworthsdhjj")
    .enterLastName(lname)
    .enterCompanyName(cname)
    .enterPhoneNumber(phone)
    .selectNoOfEmployees()
    .enterEmail(email)
    .enterJobTitle(jobtitle)
    .enterComment(comment)
    .AcceptCookies()
    .selectCountry() 
    .clickSubmit()
    .assertCheck(error)
    ;
  
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Contact Sales";
		
		testDescription="Including invalid details (more than 20 characters )for the First Name text box and keeping all other details valid and clicking the submit button";
	}


}

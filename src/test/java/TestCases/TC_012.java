package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.OrangeHRM_HomePage;
import Wrappers.DemoprojWrappers;

public class TC_012 extends DemoprojWrappers{
	@Test(dataProvider="fetchData")

	public void tc12(String url,String First_Name,String Last_Name,String	Email	,String Job_Title	,String Company,String	Phone_Number)
	{Actions act = new Actions(driver);
    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
    driver.get("https://www.orangehrm.com/");
   
	new OrangeHRM_HomePage()
	    .clickFree30DayTrial()
		.enterURL(url)
		.enterLastName(Last_Name)
		.enterFirstName(First_Name)
		.enterJobTitle(Job_Title)
		.enterEmail(Email)
		.enterCompany(Company)
		.selectNoOfEmployees()
		.enterPhoneNumber(Phone_Number)
		.selectIndustry()
		.selectCountry()
		.selectState()
		.AcceptCookies()
		.gotoCaptchaIframe()
		.Captcha()
		.Submit()
				
		
	;

}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Register";
	    testDescription="To verify that, keeping all other field input valid, submit button fucntionality works either keeping populate the dummy data for this instance -  check box (not a mandatory field) unchecked.";
	}


}


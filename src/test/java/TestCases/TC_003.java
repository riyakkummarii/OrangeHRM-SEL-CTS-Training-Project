package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.OrangeHRM_HomePage;
import Wrappers.DemoprojWrappers;

public class TC_003 extends DemoprojWrappers{
	@Test(dataProvider="fetchData")

	public void tc3(String url,String First_Name,String Last_Name,String	Email	,String Job_Title	,String Company,String	Phone_Number)
	{Actions act = new Actions(driver);
    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
    driver.get("https://www.orangehrm.com/");
    String error="First Name cannot contain more than 20 characters";
	new OrangeHRM_HomePage()
	    .clickFree30DayTrial()
		.enterURL(url)
		.enterLastName(Last_Name)
		.enterFirstName("RiyaKumariHemsworth")
		.enterJobTitle(Job_Title)
		.enterEmail(Email)
		.enterCompany(Company)
		.selectNoOfEmployees()
		.enterPhoneNumber(Phone_Number)
		.selectIndustry()
		.selectCountry()
		.selectState()
		.AcceptCookies()
		.clickDummycheckbox()
		.gotoCaptchaIframe()
		.Captcha()
		.Submit()
		.assertCheck(error)
	;

}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Register";
	    testDescription="Including invalid details (more than 20 characters )for the First Name text box and keeping all other details valid and clicking the submit button";
	}


}

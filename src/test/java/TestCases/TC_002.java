package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.OrangeHRM_HomePage;
import Wrappers.DemoprojWrappers;

public class TC_002 extends DemoprojWrappers{
	@Test(dataProvider="fetchData")

	public void tc2(String url,String First_Name,String Last_Name,String	Email	,String Job_Title	,String Company,String	Phone_Number)
	{Actions act = new Actions(driver);
    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
    driver.get("https://www.orangehrm.com/");
    String error="Your Favored URL should not be more than 15 characters.";
	new OrangeHRM_HomePage()
	    .clickFree30DayTrial()
		.enterURL("abcdyhfhffh1453636363")
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
	    testDescription="Including invalid details (more than 15 characters )for the favoured URL text box and keeping all other details valid and clicking the submit button";
	}


}

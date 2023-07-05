package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Wrappers.DemoprojWrappers;
import Pages.*;

public class Register extends DemoprojWrappers{
	@Test(dataProvider="fetchData")
	
	public void Registeruser(String url,String First_Name,String Last_Name,String	Email	,String Job_Title	,String Company,String	Phone_Number)throws InterruptedException {
		Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
        driver.get("https://www.orangehrm.com/");
        new OrangeHRM_HomePage()
        .clickFree30DayTrial()
        ;
		new Free30DayTrialPage()
		
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
		testCaseName="Verify the Register functionality";
		testDescription="Check whether user is able to register successfully";
	}
}

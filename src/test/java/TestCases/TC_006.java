package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.OrangeHRM_HomePage;
import Wrappers.DemoprojWrappers;

public class TC_006 extends DemoprojWrappers{
	@Test(dataProvider="fetchData")

	public void tc6(String url,String First_Name,String Last_Name,String	Email	,String Job_Title	,String Company,String	Phone_Number)
	{Actions act = new Actions(driver);
    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
    driver.get("https://www.orangehrm.com/");
  
	new OrangeHRM_HomePage()
	    .clickFree30DayTrial()
		.enterURL(url)
		.enterLastName(Last_Name)
		.enterFirstName(First_Name)
		.enterJobTitle(Job_Title)
		.enterEmail("notu")
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
		.mouseOverEmail()
		
	;

}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Register";
	    testDescription="Including invalid details ( except the format of abc@xyz.com )for the Email text box and keeping all other details valid and clicking the submit button";
	}


}

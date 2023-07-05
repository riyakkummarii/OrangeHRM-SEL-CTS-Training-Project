package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.OrangeHRM_HomePage;
import Wrappers.DemoprojWrappers;

public class TC_009 extends DemoprojWrappers{
	@Test(dataProvider="fetchData")

	public void tc9(String url,String First_Name,String Last_Name,String	Email	,String Job_Title	,String Company,String	Phone_Number)
	{Actions act = new Actions(driver);
    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
    driver.get("https://www.orangehrm.com/");
  String data="Computer / Technology - Services / Consultancy";
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
		.clickDummycheckbox()
		.gotoCaptchaIframe()
		.Captcha()
		.Submit()
		.assertCheckIndustryDropdown(data)
		
	;

}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Register";
	    testDescription="To check Industry field contain the database  values such as: Aerospace,Agriculture / Forestry,Automotive,Business Services / Consultancy - Non IT,Computer / Technology - Reseller (inc VAR),Computer / Technology - Services / Consultancy,Computer / Technology - Manufacturer,Education,Electronics,Finance/ Banking / Insurance / Real Estate / Legal,Government - National / Federal (inc Military),Government - Local,Healthcare,Manufacturing - Non Computer Related,Media / Marketing / Entertainment / Publishing / PR,Retail / Wholesale,Telecoms / Communications,Transportation / Distribution,Travel,Other";
	}


}


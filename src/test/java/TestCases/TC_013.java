package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.OrangeHRM_HomePage;
import Wrappers.DemoprojWrappers;

public class TC_013 extends DemoprojWrappers{
	@Test(dataProvider="fetchData")

	public void tc13(String url,String First_Name,String Last_Name,String	Email	,String Job_Title	,String Company,String	Phone_Number)
	{Actions act = new Actions(driver);
    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
    driver.get("https://www.orangehrm.com/");
   
	new OrangeHRM_HomePage()
	    .clickFree30DayTrial()
		.Submit()
		.mouseOverURL()
		.mouseOverCompany()
		.mouseOverFirstName()
		.mouseOverLastName()
		.mouseOverJobTitle()
		.mouseOverPhone()
		.mouseOverEmail()
		
	;

}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Register";
	    testDescription="To Verify the Submit button functionality by keeping all fields null";
	}


}


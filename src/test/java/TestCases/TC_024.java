package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.OrangeHRM_HomePage;
import Wrappers.DemoprojWrappers;

public class TC_024 extends DemoprojWrappers
{
	@Test(dataProvider="fetchData")

	public void tc24(String fname,String lname,String cname,String phone,String jobtitle,String email,String comment  )
	{Actions act = new Actions(driver);
    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
    driver.get("https://www.orangehrm.com/");
    String mess="Details successfully submitted";
           new OrangeHRM_HomePage()
           
           .clickContactSalesButton()
           .enterFirstName(fname)
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
           .checkSubmitForALLValid(mess)
           
            
         ;
  
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Contact Sales";
		
		testDescription="To check the submit button functionality keeping all fields valid";
	}


}

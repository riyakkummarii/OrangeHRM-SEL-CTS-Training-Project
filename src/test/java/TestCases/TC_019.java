package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.OrangeHRM_HomePage;
import Wrappers.DemoprojWrappers;

public class TC_019 extends DemoprojWrappers
{
	@Test(dataProvider="fetchData")

	public void tc19(String fname,String lname,String cname,String phone,String jobtitle,String email,String comment  )
	{Actions act = new Actions(driver);
    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
    driver.get("https://www.orangehrm.com/");
    String text="251 - 300";
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
    .assertCheckNoOFEmployeeDropdown(text)
    
    ;
  
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Contact Sales";
		
		testDescription="To check that No. of employees contain the database values such as: 0 - 10,11 - 15,16 - 20,21 - 25,26 - 50,51 - 75,76 - 100,101 - 150,151 - 200,201 - 250,251 - 300,301 - 350,351 - 400,401 - 450,451 - 500,501 - 600,601 - 700,701 - 800,801 - 900,901 - 1,000,1,001 - 1,500,1,501 - 2,000,2,001 - 2,500,2,501 - 3,000,3,001 - 3,500,3,501 - 4,000,4,001 - 4,500,4,501 - 5,000,5,001 - 5,500,5,501 - 6,000,6,001 - 6,500,6,501 - 7,000,7,001 - 7,500,7,501 - 8,000,8,001 - 8,500,8,501 - 9,000,9,001 - 9,500,9,501 - 10,000,10,000+";
	}


}

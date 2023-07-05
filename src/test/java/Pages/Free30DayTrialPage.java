package Pages;

import Wrappers.DemoprojWrappers;

public class Free30DayTrialPage extends DemoprojWrappers {
	
	
	public Free30DayTrialPage enterURL(String url) {
		enterByXpath(prop.getProperty("Free30DayTrialPage.URL.Xpath"),url);
		
		return this;
	}
	public Free30DayTrialPage enterFirstName(String fname) {
		enterByXpath(prop.getProperty("Free30DayTrialPage.FirstName.Xpath"),fname);
		
		return this;
	}
	public Free30DayTrialPage enterLastName(String lname) {
		enterByXpath(prop.getProperty("Free30DayTrialPage.LastName.Xpath"),lname);
		
		return this;
	}
	public Free30DayTrialPage enterEmail(String email) {
		enterByXpath(prop.getProperty("Free30DayTrialPage.Email.Xpath"),email);
		
		return this;
	}
	public Free30DayTrialPage enterJobTitle(String jobtitle) {
		enterByXpath(prop.getProperty("Free30DayTrialPage.JobTitle.Xpath"),jobtitle);
		
		return this;
	}
	public Free30DayTrialPage enterCompany(String company) {
		enterByXpath(prop.getProperty("Free30DayTrialPage.Company.Xpath"),company);
		
		return this;
	}
	public Free30DayTrialPage enterPhoneNumber(String phone) {
		enterByXpath(prop.getProperty("Free30DayTrialPage.Phone.Xpath"),phone);
		
		return this;
	}
	public Free30DayTrialPage selectNoOfEmployees() {
		selectByName(prop.getProperty("Free30DayTrialPage.NoOfEmployees.name"),"76 - 100");
		
		return this;
	}
	public Free30DayTrialPage selectIndustry() {
		selectByName(prop.getProperty("Free30DayTrialPage.Industry.name"),"Computer / Technology - Services / Consultancy");
		
		return this;
	}
	public Free30DayTrialPage selectCountry() {
		selectByName(prop.getProperty("Free30DayTrialPage.Country.name"),"India");
		
		return this;
	}
	public Free30DayTrialPage AcceptCookies() {
		clickByXpath(prop.getProperty("ContactSales.cookies.Xpath"));
		
		return this;
	}

	public Free30DayTrialPage selectState() {
		selectByName(prop.getProperty("Free30DayTrialPage.State.name"),"West Bengal");
		
		
		return this;
	}
	public Free30DayTrialPage Captcha() {
		
		clickByXpath(prop.getProperty("Free30DayTrialPage.Captcha.Xpath"));
		
		return this;
	}
	public Free30DayTrialPage Submit() {
		switchToParentFrame();
		
		clickByXpath(prop.getProperty("Free30DayTrialPage.Submit.Xpath"));
		
		return this;
	}
	public Free30DayTrialPage gotoCaptchaIframe() {
		PageDown();
		 driver.switchTo().frame(0);		
		return this;
	}
	public Free30DayTrialPage clickDummycheckbox() {
		switchToParentFrame();
		
		clickByName(prop.getProperty("Free30DayTrialPage.dummy.name"));
		
		return this;
	}	
	public Free30DayTrialPage assertCheck(String text) {
		
		verifyTextByXpath(prop.getProperty("Free30DayTrialPage.ErrorMessage.Xpath"), text);
		
		return this;
	}
public Free30DayTrialPage assertCheckEmployeeDropdown(String text) {
	presentindb(prop.getProperty("Free30DayTrialPage.NoOfEmployees.name"),text);
		
		
		return this;
	}
public Free30DayTrialPage assertCheckIndustryDropdown(String text) {
	presentindb(prop.getProperty("Free30DayTrialPage.Industry.name"),text);
		
		
		return this;
	}
public Free30DayTrialPage assertCheckCountryDropdown(String text) {
	presentindb(prop.getProperty("Free30DayTrialPage.Country.name"),text);
		
		
		return this;
	}


public Free30DayTrialPage mouseOverCompany() {
	
	mouseOverByXpath(prop.getProperty("Free30DayTrialPage.Company.Xpath"));
		return this;
	}
public Free30DayTrialPage mouseOverFirstName() {
	mouseOverByXpath(prop.getProperty("Free30DayTrialPage.FirstName.Xpath"));
	
		return this;
	}

public Free30DayTrialPage mouseOverLastName() {
	
	mouseOverByXpath(prop.getProperty("Free30DayTrialPage.LastName.Xpath"));
	
	return this;
	}

public Free30DayTrialPage mouseOverJobTitle() {
	
	mouseOverByXpath(prop.getProperty("Free30DayTrialPage.JobTitle.Xpath"));
	
		return this;
	}



public Free30DayTrialPage mouseOverURL() {
		mouseOverByXpath(prop.getProperty("Free30DayTrialPage.URL.Xpath"));


	return this;
}

public Free30DayTrialPage mouseOverEmail() {
	
	mouseOverByXpath(prop.getProperty("Free30DayTrialPage.Email.Xpath"));
			return this;
	}
public Free30DayTrialPage mouseOverPhone() {
	
	mouseOverByXpath(prop.getProperty("Free30DayTrialPage.Phone.Xpath"));
		return this;
	}
public Free30DayTrialPage validSubmit() throws InterruptedException {
	Thread.sleep(50000);
	clickByXpath(prop.getProperty("Free30DayTrialPage.Submit.Xpath"));
		return this;
	}
	
}

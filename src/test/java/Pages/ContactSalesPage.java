package Pages;

import Wrappers.DemoprojWrappers;

public class ContactSalesPage  extends DemoprojWrappers {

	
	public ContactSalesPage enterFirstName(String fname) {
		enterByName(prop.getProperty("ContactSales.FirstName.name"),fname);
		
		return this;
	}
	public ContactSalesPage enterLastName(String lname) {
		enterByName(prop.getProperty("ContactSales.LastName.name"),lname);
		
		return this;
	}
	public ContactSalesPage enterCompanyName(String cname) {
		enterByName(prop.getProperty("ContactSales.Company.name"),cname);
		
		return this;
	}
	public ContactSalesPage enterPhoneNumber(String phone) {
		enterByName(prop.getProperty("ContactSales.Phone.name"),phone);
		
		return this;
	}
	public ContactSalesPage enterJobTitle(String jobtitle) {
		enterByName(prop.getProperty("ContactSales.JobTitle.name"),jobtitle);
		
		return this;
	}
	public ContactSalesPage enterEmail(String email) {
		enterByName(prop.getProperty("ContactSales.Email.name"),email);
		
		return this;
	}
	public ContactSalesPage enterComment(String comment) {
		enterByName(prop.getProperty("ContactSales.Comment.name"),comment);
		
		return this;
	}
	public ContactSalesPage selectNoOfEmployees() {
		selectByName(prop.getProperty("ContactSales.noOfEmployees.name"),"251 - 300");
		
		return this;
	}
	public ContactSalesPage selectCountry() {
		selectByName(prop.getProperty("ContactSales.Country.name"),"Germany");
		
		return this;
	}
	public ContactSalesPage AcceptCookies() {
		clickByXpath(prop.getProperty("ContactSales.cookies.Xpath"));
		
		return this;
	}
	public ContactSalesPage clickSubmit() {
		clickByXpath(prop.getProperty("ContactSales.Submit.Xpath"));
		
		return this;
	}
	public ContactSalesPage  assertCheck(String text) {
	
	verifyTextByXpath(prop.getProperty("ContactSalesPage.ErrorMessage.Xpath"), text);
		
		return this;
		}
	public ContactSalesPage  assertCheckEmail(String text) {
		
		verifyTextByXpath(prop.getProperty("ContactSalesPage.ErrorMessageEmail.Xpath"), text);
			
			return this;
			}
	public  ContactSalesPage assertCheckNoOFEmployeeDropdown(String text) {
		presentindb(prop.getProperty("ContactSales.noOfEmployees.name"),text);
			
			
			return this;
		}
public ContactSalesPage  assertCheckPhone(String text) {
		
		verifyTextByXpath(prop.getProperty("ContactSalesPage.ErrorMessagePhone.Xpath"), text);
			
			return this;
			}
public  ContactSalesPage assertCheckCountryDropdown(String text) {
	presentindb(prop.getProperty("ContactSales.Country.name"),text);
		
		
		return this;
	}
public  ContactSalesPage checkFirstName(String text) {
	
	verifyTextByXpath(prop.getProperty("ContactSalesPage.ErrorMessageFirstNameforNull.Xpath"), text);

	return this;
	}
public  ContactSalesPage checkLastName(String text) {
	
	verifyTextByXpath(prop.getProperty("ContactSalesPage.ErrorMessageLastNameforNull.Xpath"), text);

	return this;
	}
public  ContactSalesPage checkCompanyName(String text) {
	
	verifyTextByXpath(prop.getProperty("ContactSalesPage.ErrorMessageCompanyNmaeforNull.Xpath"), text);

	return this;
	}
public  ContactSalesPage checkNoOfEmployees(String text) {
	
	verifyTextByXpath(prop.getProperty("ContactSalesPage.ErrorMessageNoOfEmployeesforNull.Xpath"), text);

	return this;
	}
public  ContactSalesPage checkPhone(String text) {
	
	verifyTextByXpath(prop.getProperty("ContactSalesPage.ErrorMessagePhoneforNull.Xpath"), text);

	return this;
	}
public  ContactSalesPage checkCountry(String text) {
	
	verifyTextByXpath(prop.getProperty("ContactSalesPage.ErrorMessageCountryForNull.Xpath"), text);

	return this;
	}
public  ContactSalesPage checkJobTitle(String text) {
	
	verifyTextByXpath(prop.getProperty("ContactSalesPage.ErrorMessageJobTitleForNull.Xpath"), text);

	return this;
	}
public  ContactSalesPage checkEmail(String text) {
	
	verifyTextByXpath(prop.getProperty("ContactSalesPage.ErrorMessageEmailForNull.Xpath"), text);

	return this;
	}
public  ContactSalesPage checkComment(String text) {
	
	verifyTextByXpath(prop.getProperty("ContactSalesPage.ErrorMessageCommentForNull.Xpath"), text);

	return this;
	}
public  ContactSalesPage checkSubmitForALLNull(String text) {
	
	verifyTextByXpath(prop.getProperty(""), text);

	return this;
	}
public  ContactSalesPage checkSubmitForALLValid(String text) {
	
	verifyTextByXpath(prop.getProperty("ContactSalesPage.ErrorMessage.Xpath"), text);

	return this;
	}




}

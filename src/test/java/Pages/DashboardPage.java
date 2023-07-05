package Pages;

import Wrappers.DemoprojWrappers;

public class DashboardPage extends DemoprojWrappers{
	public DashboardPage ClickAdmin() {
		clickByXpath(prop.getProperty("DashboardPage.Admin.Xpath"));
		
		return this;
	}
	public DashboardPage ClickOrganization() {
		clickById(prop.getProperty("DashboardPage.Organization.Id"));
		
		return this;
	}
		public LocationsPage ClickLocations() {
		clickById(prop.getProperty("DashboardPage.Locations.Id"));
		
		return new LocationsPage();
	}

	public DashboardPage ClickAdminDropDown() {
		clickById(prop.getProperty("DashboardPage.AdminDropDown.Id"));
		
		return this;
	}
	public DashboardPage ClickLogout() {
		clickById(prop.getProperty("DashboardPage.Logout.Id"));
		
		return this;
	}
	public ChangePasswordPage ClickChangePassword() {
		
		clickByLink("Change Password");
		return new ChangePasswordPage() ;
	}
	
	public DashboardPage ClickPIM() {
		clickById(prop.getProperty("DashboardPage.PIM.Id"));
		
		return this;
	}
	public EmployeeListPage ClickAddEmployee() {
		clickById(prop.getProperty("DashboardPage.AddEmployee.Id"));
		
		return new EmployeeListPage() ;
	}
	public EmployeeListPage clickEmployeeList() {
		clickById(prop.getProperty("DashboardPage.EmployeeList.Id"));
		
		return new EmployeeListPage();
	}
	public DashboardPage checkProfilePage(String text) {
		
		verifyTextByXpath(prop.getProperty("DashboardPage.profilename.Xpath"), text);

		return this;
		}
public DashboardPage clickPerformance() {
		
		clickById(prop.getProperty("DashboardPage.performance.Id"));

		return this;
		}
public DashboardPage clickAppraisals() {
	
	clickById(prop.getProperty("DashboardPage.appraisals.Id"));

	return this;
	}
public DashboardPage clickAppraisalslist() {
	
	clickById(prop.getProperty("DashboardPage.appraisalslist.Id"));

	return this;
	}
public AppraisalsaddPage clickonAddAppraisals() {
	
	clickById(prop.getProperty("DashboardPage.addappraisals.Id"));

	return new AppraisalsaddPage();
	}
public DashboardPage checkSucessfullLogout() {
		String title="OrangeHRM";
	    verifyTitle(title);
		return this;
		}
}

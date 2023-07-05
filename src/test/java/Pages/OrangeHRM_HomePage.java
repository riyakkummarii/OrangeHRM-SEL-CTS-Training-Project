package Pages;

import Wrappers.DemoprojWrappers;

public class OrangeHRM_HomePage extends DemoprojWrappers  {
	
		
		public Free30DayTrialPage clickFree30DayTrial() {
			clickByXpath(prop.getProperty("HomePage.Free30DayTrial.Xpath"));
			
			return new Free30DayTrialPage();
		}
		public ContactSalesPage clickContactSalesButton() {
			clickByXpath(prop.getProperty("HomePage.ContactSales.Xpath"));
			
			return new ContactSalesPage();
		}

}

package Pages;

import Wrappers.DemoprojWrappers;

public class RetryLoginPage extends DemoprojWrappers {
	public RetryLoginPage checkErrorMessage(String text)
	{
		verifyTextByXpath(prop.getProperty("RetryLoginPage.InvalidUsername.Xpath"), text);
				
		return this;
			
		
		
	}
}

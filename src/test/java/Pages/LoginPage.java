package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Wrappers.DemoprojWrappers;

public class LoginPage extends DemoprojWrappers {
	public LoginPage enterUserName(String username)
	{enterById(prop.getProperty("LoginPage.username.id"),username);
	
	return this;
		
	}
	public LoginPage enterPasswqord(String pass)
	{enterById(prop.getProperty("LoginPage.password.id"),pass);
	
	return this;
		
	}
	public LoginPage checkPasswordIsMasked()
	{verifyPasswordMaskedorNotById(prop.getProperty("LoginPage.password.id"));
	
	
	return this;
		
	}
	public DashboardPage clickLogin()
	{clickByXpath(prop.getProperty("LoginPage.submit.Xpath"));
	
	return new DashboardPage();
		
	}
	public LoginPage checkNullCredentials(String text)
	{verifyTextByXpath(prop.getProperty("LoginPage.AllNullErrorMessage.Xpath"), text);
	
	return this;
		
	}

	


}

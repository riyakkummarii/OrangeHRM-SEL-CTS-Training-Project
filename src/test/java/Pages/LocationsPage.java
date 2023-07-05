package Pages;

import Wrappers.DemoprojWrappers;

public class LocationsPage extends DemoprojWrappers{
	public LocationsPage clickAddLocationIcon()
	{clickByXpath(prop.getProperty("LocationsPage.AddLocationIcon.Xpath"));
	
	return this;
		
	}
	public LocationsPage enterName(String name)
	{enterById(prop.getProperty("LocationsPage.Name.Id"),name);
	
	return this;
		
	}
	public LocationsPage enterState(String state)
	{enterById(prop.getProperty("LocationsPage.State.Id"),state);
	
	return this;
		
	}
	public LocationsPage selectCountry()
	{   
		clickByXpath(prop.getProperty("LocationsPage.CountryClick.Xpath"));
		clickByXpath(prop.getProperty("LocationsPage.CountrySelect.Xpath"));
		return this;
		
	}
	public LocationsPage selectTimeZone()
	{   clickByXpath(prop.getProperty("LocationsPage.TimeZoneClick.Xpath"));
	clickByXpath(prop.getProperty("LocationsPage.TimeZoneSelect.Xpath"));	
	
	return this;
		
	}
	public LocationsPage enterCity(String city)
	{enterById(prop.getProperty("LocationsPage.City.Id"),city);
	
	return this;
		
	}
	public LocationsPage enterPinCode(String pcode)
	{enterById(prop.getProperty("LocationsPage.PinCode.Id"),pcode);
	
	return this;
		
	}
	public LocationsPage enterPhone(String phone)
	{enterById(prop.getProperty("LocationsPage.Phone.Id"),phone);
	
	return this;
		
	}
	public LocationsPage enterFax(String fax)
	{enterById(prop.getProperty("LocationsPage.Fax.Id"),fax);
	
	return this;
		
	}
	public LocationsPage enterAddress(String address)
	{enterById(prop.getProperty("LocationsPage.Address.Id"),address);
	
	return this;
		
	}
	public LocationsPage enterNotes(String notes)
	{enterById(prop.getProperty("LocationsPage.Notes.Id"),notes);
	
	return this;
		
	}
	public LocationsPage clickSave()
	{clickByXpath(prop.getProperty("LocationsPage.Save.Xpath"));
	
	return this;
		
	}
	public LocationsPage clickCancel()
	{clickByXpath(prop.getProperty("LocationsPage.Cancel.Xpath"));
	
	return this;
		
	}


}

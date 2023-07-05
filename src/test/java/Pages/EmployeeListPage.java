package Pages;

import Wrappers.DemoprojWrappers;

public class EmployeeListPage extends DemoprojWrappers{
	
	public  EmployeeListPage clickCreateLoginDetails()
	{ 
		clickByXpath(prop.getProperty("AddEmployee.CreateLoginDetails.Xpath"));
	   
		return this;
		
	}
	
	public  EmployeeListPage enterFirstName(String name)
	{   clickById(prop.getProperty("AddEmployee.username.Id"));
		PageUp();
		 
		enterById(prop.getProperty("AddEmployee.FirstName.Id"),name);
	   
		return this;
		
	}
	public  EmployeeListPage enterLastName(String name)
	{ enterById(prop.getProperty("AddEmployee.LastName.Id"),name);
	   
		return this;
		
	}
	public  EmployeeListPage enterEmployeeId(String name)
	{ enterById(prop.getProperty("AddEmployee.EmployeeId.Id"),name);
	   
		return this;
		
	}
	public  EmployeeListPage enterMiddleName(String name)
	{ enterById(prop.getProperty("AddEmployee.MiddleName.Id"),name);
	   
		return this;
		
	}
	public  EmployeeListPage selectLocation() throws InterruptedException
	{ clickByXpath(prop.getProperty("AddEmployee.Location.Xpath"));
	clickByXpath(prop.getProperty("AddEmployee.SelectLocation.Xpath"));
		return this;
		
	}
	public  EmployeeListPage enterusername(String name)
	{ enterById(prop.getProperty("AddEmployee.username.Id"),name);
	   
		return this;
		
	}
	public  EmployeeListPage selectStatus() throws InterruptedException
	{ clickByXpath(prop.getProperty("AddEmployee.Status.Xpath"));
	clickByXpath(prop.getProperty("AddEmployee.SelectStatus.Xpath"));
		return this;
		
	}

	public  EmployeeListPage enterpassword(String name)
	{ enterById(prop.getProperty("AddEmployee.Password.Id"),name);
	   
		return this;
		
	}
	public  EmployeeListPage enterConfirmPassword(String name)
	{ enterById(prop.getProperty("AddEmployee.ConfirmPassword.Id"),name);
	   
		return this;
		
	}
	public  EmployeeListPage selectESSRole() throws InterruptedException
	{ clickByXpath(prop.getProperty("AddEmployee.ESSRole.Xpath"));
	//clickByXpath(prop.getProperty("AddEmployee.SelectESSRole.Xpath"));
		return this;
		
	}
	public  EmployeeListPage selectSupervisorRole() throws InterruptedException
	{ clickByXpath(prop.getProperty("AddEmployee.Supervisor.Xpath"));
	//clickByXpath(prop.getProperty("AddEmployee.SelectSupervisor.Xpath"));
		return this;
		
	}
	public  EmployeeListPage selectAdminRole() throws InterruptedException
	{// clickById(prop.getProperty("AddEmployee.ConfirmPassword.Id"));
		//PageDown();
		clickByXpath(prop.getProperty("AddEmployee.AdminRole.Xpath"));
	//clickByXpath(prop.getProperty("AddEmployee.SelectAdminRole.Xpath"));
		return this;
		
	}
	public  EmployeeListPage clickSave() throws InterruptedException
	{ clickById(prop.getProperty("AddEmployee.Save.Id"));
	
		return this;
		
	}
	public  EmployeeListPage clickCancel() throws InterruptedException
	{ 
		clickByXpath(prop.getProperty("AddEmployee.Cancel.Xpath"));
	
		return this;
		
	}
	public  EmployeeListPage clickanEmployeetoEdit() throws InterruptedException
	{ 
		clickByXpath(prop.getProperty("EmployeeList.clickEmployeetoEdit.Xpath"));
		//clickByLink("Valerie  Storm");
	
		return this;
		
	}
	public  EmployeeListPage clickonSalary() throws InterruptedException
	{ 
		clickByXpath(prop.getProperty("EmployeeList.clickSalary.Xpath"));
	
		return this;
		
	}
}

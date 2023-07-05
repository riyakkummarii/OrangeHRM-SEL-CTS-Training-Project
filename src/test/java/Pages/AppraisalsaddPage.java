package Pages;

import Wrappers.DemoprojWrappers;

public class AppraisalsaddPage extends DemoprojWrappers{
	
	public  AppraisalsaddPage enterEmployeeName(String name1)
	{ 
		enterByXpath(prop.getProperty("AppraisalsaddPage.enterempname.Xpath"),name1);
	   
		return this;
		
	}
	
	public  AppraisalsaddPage enterDescription(String name1)
	{   clickById(prop.getProperty("AddEmployee.username.Id"));
		PageUp();
		 
		enterById(prop.getProperty("AddEmployee.FirstName.Id"),name1);
	   
		return this;
		
	}
	public  AppraisalsaddPage Template(String name)
	{ enterById(prop.getProperty("AddEmployee.LastName.Id"),name);
	   
		return this;
		
	}
	public  AppraisalsaddPage FromDate(String name)
	{ enterById(prop.getProperty("AddEmployee.EmployeeId.Id"),name);
	   
		return this;
		
	}
	public  AppraisalsaddPage ToDate(String name)
	{ enterById(prop.getProperty("AddEmployee.MiddleName.Id"),name);
	   
		return this;
		
	}
	public  AppraisalsaddPage dueDate() throws InterruptedException
	{ clickByXpath(prop.getProperty("AddEmployee.Location.Xpath"));
	clickByXpath(prop.getProperty("AddEmployee.SelectLocation.Xpath"));
		return this;
		
	}
	public  AppraisalsaddPage clickNext(String name)
	{ enterById(prop.getProperty("AddEmployee.username.Id"),name);
	   
		return this;
		
	}
	/*public  AppraisalsaddPage selectStatus() throws InterruptedException
	{ clickByXpath(prop.getProperty("AddEmployee.Status.Xpath"));
	clickByXpath(prop.getProperty("AddEmployee.SelectStatus.Xpath"));
		return this;
		
	}

	public  AppraisalsaddPage enterpassword(String name)
	{ enterById(prop.getProperty("AddEmployee.Password.Id"),name);
	   
		return this;
		
	}
	public  AppraisalsaddPage enterConfirmPassword(String name)
	{ enterById(prop.getProperty("AddEmployee.ConfirmPassword.Id"),name);
	   
		return this;
		
	}
	public  AppraisalsaddPage selectESSRole() throws InterruptedException
	{ clickByXpath(prop.getProperty("AddEmployee.ESSRole.Xpath"));
	//clickByXpath(prop.getProperty("AddEmployee.SelectESSRole.Xpath"));
		return this;
		
	}
	public  AppraisalsaddPage selectSupervisorRole() throws InterruptedException
	{ clickByXpath(prop.getProperty("AddEmployee.Supervisor.Xpath"));
	//clickByXpath(prop.getProperty("AddEmployee.SelectSupervisor.Xpath"));
		return this;
		
	}
	public  AppraisalsaddPage selectAdminRole() throws InterruptedException
	{// clickById(prop.getProperty("AddEmployee.ConfirmPassword.Id"));
		//PageDown();
		clickByXpath(prop.getProperty("AddEmployee.AdminRole.Xpath"));
	//clickByXpath(prop.getProperty("AddEmployee.SelectAdminRole.Xpath"));
		return this;
		
	}
	public  AppraisalsaddPage clickSave() throws InterruptedException
	{ clickById(prop.getProperty("AddEmployee.Save.Id"));
	
		return this;
		
	}
	public  AppraisalsaddPage clickCancel() throws InterruptedException
	{ 
		clickByXpath(prop.getProperty("AddEmployee.Cancel.Xpath"));
	
		return this;
		
	}
	public  AppraisalsaddPage clickanEmployeetoEdit() throws InterruptedException
	{ 
		clickByXpath(prop.getProperty("EmployeeList.clickEmployeetoEdit.Xpath"));
		//clickByLink("Valerie  Storm");
	
		return this;
		
	}
	public  AppraisalsaddPage clickonSalary() throws InterruptedException
	{ 
		clickByXpath(prop.getProperty("EmployeeList.clickSalary.Xpath"));
	
		return this;
		
	}
	*/
}

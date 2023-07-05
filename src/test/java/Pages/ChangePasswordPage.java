package Pages;

import Wrappers.DemoprojWrappers;

public class ChangePasswordPage  extends DemoprojWrappers {
	
	public ChangePasswordPage  enterCurrentPassword(String cpass) {
		enterById(prop.getProperty("ChangePasswordPage.CurrentPassword.Id"),cpass);
		
		return this;
	}

	public ChangePasswordPage  enterNewPassword(String npass) {
		enterById(prop.getProperty("ChangePasswordPage.NewPassword.Id"),npass);
		
		return this;
	}
	public ChangePasswordPage  enterConfirmPassword(String cfpass) {
		enterById(prop.getProperty("ChangePasswordPage.ConfirmPassword.Id"),cfpass);
		
		return this;
	}
	public ChangePasswordPage  clickSave() {
		clickById(prop.getProperty("ChangePasswordPage.Save.Id"));
		
		return this;
	}
	public ChangePasswordPage  clickCancel() {
		clickByXpath(prop.getProperty("ChangePasswordPage.Cancel.Xpath"));
		
		return this;
	}

}

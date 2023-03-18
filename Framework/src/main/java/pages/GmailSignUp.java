package pages;

import baseFunctions.Base;
import baseFunctions.ConfigReader;
import pageObjects.GmailSignUpPO;

public class GmailSignUp extends Base{
	
		Base base = new Base();
		ConfigReader cr = new ConfigReader();
		
		public void init () {
		
		base.getLocalDriver();
		
		}
		
		public void SignUp (String firstName, String lastName, String userName, String password, String confirmPassword) {
		
		base.getUrl(cr.getApplicationURL());
		
		base.click(GmailSignUpPO.createAccountBtn);
		
		base.click(GmailSignUpPO.forMyPersonalUse);
		
		base.setValue(GmailSignUpPO.firstName, firstName);
		
		base.setValue(GmailSignUpPO.lastName, lastName);
		
		base.setValue(GmailSignUpPO.userName, userName);
		
		base.setValue(GmailSignUpPO.password, password);
		
		base.setValue(GmailSignUpPO.confirmPassword, confirmPassword);
		
		base.click(GmailSignUpPO.nextBtn);
		
		}
	
}

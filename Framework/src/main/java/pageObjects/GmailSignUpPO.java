package pageObjects;

import org.openqa.selenium.By;

public class GmailSignUpPO {

	public static By createAccountBtn = By.xpath("//span [text() = 'Create account']");
	
	public static By forMyPersonalUse = By.className("VfPpkd-StrnGf-rymPhb-b9t22c");
	
	public static By firstName = By.id("firstName");
	
	public static By lastName = By.id("lastName");
	
	public static By userName = By.id("username");
	
	public static By password = By.name("Passwd");
	
	public static By confirmPassword = By.name("ConfirmPasswd");
	
	public static By nextBtn = By.className("VfPpkd-vQzf8d");
}

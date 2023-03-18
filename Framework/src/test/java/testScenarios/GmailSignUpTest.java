package testScenarios;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSuite.BaseSuite;
import pages.GmailSignUp;

public class GmailSignUpTest extends BaseSuite {

	GmailSignUp gs = new GmailSignUp();

	@BeforeTest
	public void init() {

		gs.init();

	}

	@Test(dataProvider = "getValue", dataProviderClass = BaseSuite.class)
	public void signUp(String firstName, String lastName, String userName, String password, String confirmPassword) {

		gs.SignUp(firstName, lastName, userName, password, confirmPassword);

	}
}

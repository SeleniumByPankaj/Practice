package stepDefinations;

import org.openqa.selenium.By;

import commons.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginWithExampleKeyword_sd extends Base {

    @When("^enter username as (.+)$")
    public void enter_username_as(String username)  {
    	driver.findElement(By.id("email")).sendKeys(username);   
    }

    @And("^enter password as (.+)$")
    public void enter_password_as(String password) {
    	driver.findElement(By.id("pass")).sendKeys(password);
    }
}

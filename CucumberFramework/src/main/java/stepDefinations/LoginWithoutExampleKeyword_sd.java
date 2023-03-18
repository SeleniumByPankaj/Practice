package stepDefinations;

import org.openqa.selenium.By;

import commons.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginWithoutExampleKeyword_sd extends Base {

    @When("^enter username as \"([^\"]*)\"$")
    public void enter_username_as_something(String userName) {
    	driver.findElement(By.id("email")).sendKeys(userName);
    }

    @And("^enter password as \"([^\"]*)\"$")
    public void enter_password_as_something(String password)  {
    	driver.findElement(By.id("pass")).sendKeys(password);
    }
}

package stepDefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import commons.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginWithDataTableMap extends Base{

	List<Map<String, String>> map;
	
    @When("^enter UserName$")
    public void enter_username(DataTable creds)  {
        map = creds.asMaps(String.class, String.class);
        driver.findElement(By.id("email")).sendKeys(map.get(0).get("username"));
    }

    @And("^enter PassWord$")
    public void enter_password(DataTable creds)  {
    	 map = creds.asMaps(String.class, String.class);
    	 driver.findElement(By.id("pass")).sendKeys(map.get(0).get("password"));
    }
}

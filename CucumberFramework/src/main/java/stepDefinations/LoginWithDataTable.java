package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;

import commons.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginWithDataTable extends Base{

	List<List<String>> data;
	
    @When("^enter Username$")
    public void enter_username(DataTable creds)  {
        data = creds.asLists(String.class);
        driver.findElement(By.id("email")).sendKeys(data.get(0).get(0));
    }

    @And("^enter Password$")
    public void enter_password(DataTable creds)  {
    	 data = creds.asLists(String.class);
    	 driver.findElement(By.id("pass")).sendKeys(data.get(0).get(0));
    }
}

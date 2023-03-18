package stepDefinations;

import org.openqa.selenium.By;

import commons.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login_sd extends Base {

	@Given("^Launch browser and get URL$")
	public void launch_browser_and_get_url()  {
		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		driver.get("https://facebook.com");
	}

	@When("^enter username$")
	public void enter_username()  {
		driver.findElement(By.id("email")).sendKeys("Pankajbharambe");
	}

	@And("^enter password$")
	public void enter_password() {
		driver.findElement(By.id("pass")).sendKeys("PankajPassword");
	}
}

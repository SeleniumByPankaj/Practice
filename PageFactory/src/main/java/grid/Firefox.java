package grid;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Firefox {

	WebDriver driver;

	@Test
	public void testOne() {
		driver.get("https://gmail.com");
		System.out.println(driver.getTitle() + "from edge");

	}

	@BeforeMethod
	public void setup() throws MalformedURLException {
		driver = Base.LoadBrowser("edge");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}

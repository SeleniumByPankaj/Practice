package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverXpaths {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Xpath example with single parameter and multiple parameter

//		driver.get("https://gmail.com");
//
//		WebElement userName = driver.findElement(By.xpath("//input [@id = 'identifierId']"));

//		WebElement userName = driver.findElement(By.xpath("//input [@id = 'identifierId'][@name = 'identifier']"));
//
//		userName.sendKeys("Pankajbharambe101");

		// ------------------------------------------------------------------------------------------------------------------

		// index wise locating of element

		// driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		// driver.manage().window().maximize();

		// WebElement firstName = driver.findElement(By.xpath("(//input [@class =
		// 'bcTextBox'])[1]"));

		// locating with partial matches

		// WebElement firstName = driver.findElement(By.xpath("//input
		// [starts-with(@id,'first')]"));

		// WebElement firstName = driver.findElement(By.xpath("//input
		// [ends-with(@id,'Name')]"));

//		WebElement firstName = driver.findElement(By.xpath("//input [contains(@id,'rstNam')]"));
//		
//		firstName.sendKeys("Pankaj");

		// ------------------------------------------------------------------------------------------------------------

		// locating elements with text on the webelement

//		driver.get("https://facebook.com");
//
//		driver.manage().window().maximize();

		// WebElement createBtn = driver.findElement(By.xpath("//a[text() = 'Create New
		// Account']"));
//
//		WebElement createBtn = driver.findElement(By.xpath("//a[contains (text(), 'New Account')]"));
//
//		createBtn.click();

		// ---------------------------------------------------------------------------------------------------------------

		// locating checkbox and checking other methods of it
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		driver.manage().window().maximize();

		WebElement hindiCheckbox = driver.findElement(By.id("hindichbx"));
		
		System.out.println(hindiCheckbox.isDisplayed());
		
		System.out.println("check is enabled "+hindiCheckbox.isEnabled());
		
		System.out.println("checkbox is selected before click "+hindiCheckbox.isSelected());

		hindiCheckbox.click();
		
		System.out.println("checkbox is selected after click "+hindiCheckbox.isSelected());
		
	}

}

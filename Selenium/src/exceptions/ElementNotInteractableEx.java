package exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotInteractableEx {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		// with below xpath system shows exception. 
		
		WebElement IamfeelingLucky = driver.findElement(By.xpath("(//input [@class = 'RNmpXc'])[1]"));
		
		// below will run fine.
		
		// WebElement IamfeelingLucky = driver.findElement(By.xpath("(//input [@class = 'RNmpXc'])[2]"));
		
		IamfeelingLucky.click();
		
		
	}
}

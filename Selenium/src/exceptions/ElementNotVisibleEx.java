package exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotVisibleEx {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/");
		
		driver.manage().window().maximize();
		
		WebElement next = driver.findElement(By.linkText("Basic Controls"));
		
		next.click();
		
		
	}
}

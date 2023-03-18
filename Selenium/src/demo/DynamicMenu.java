package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicMenu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com");
		
		driver.manage().window().maximize();

		WebElement SeleniumPractice = driver.findElement(By.linkText("Selenium Practice"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(SeleniumPractice).build().perform();
		
		WebElement basicControls = driver.findElement(By.linkText("Basic Controls"));
		
		basicControls.click();
	}

}

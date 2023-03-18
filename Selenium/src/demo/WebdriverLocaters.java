package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverLocaters {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		driver.manage().window().maximize();
		
		//WebElement firstName = driver.findElement(By.className("bcTextBox"));
		
		//WebElement firstName = driver.findElement(By.id("firstName"));
		
		WebElement firstName = driver.findElement(By.name("fName"));
		
		firstName.sendKeys("Pankaj");
		
		//WebElement navigateLink = driver.findElement(By.linkText("Click here to navigate to the home page"));
		
		//WebElement navigateLink = driver.findElement(By.partialLinkText("Click here to navigate"));
		
		WebElement navigateLink = driver.findElement(By.tagName("a"));
		navigateLink.click();
	}

}

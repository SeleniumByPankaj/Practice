package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverCSSLocaters {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		driver.manage().window().maximize();
		
		//WebElement firstName = driver.findElement(By.cssSelector("#firstName"));
		
		//WebElement firstName = driver.findElement(By.cssSelector(".bcTextBox"));
		
		//WebElement firstName = driver.findElement(By.cssSelector("input[name='fName']"));
		
		//WebElement firstName = driver.findElement(By.cssSelector("input[name^='fNa']"));
		
//		WebElement firstName = driver.findElement(By.cssSelector("input[name$='Name']"));
		
		WebElement firstName = driver.findElement(By.cssSelector("input[name*='Nam']"));
		
		firstName.sendKeys("Pankaj");
		
		WebElement lastName = driver.findElement(By.cssSelector("input[class = 'bcTextBox'][name='lName']"));
		
		lastName.sendKeys("Bharambe");
	}

}

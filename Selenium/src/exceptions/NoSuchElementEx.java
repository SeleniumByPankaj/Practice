package exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementEx {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.pavantestingtools.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text() = 'Online Training']")).click();
	}
}

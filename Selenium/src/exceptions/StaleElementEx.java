package exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementEx {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.pavantestingtools.com/");

		driver.manage().window().maximize();

		WebElement onlineTraining = driver.findElement(By.xpath("//a[text() = 'Online Training']"));

		onlineTraining.click();

		driver.navigate().back();

		try {
			onlineTraining.click();
		} catch (StaleElementReferenceException e) {

			onlineTraining = driver.findElement(By.xpath("//a[text() = 'Online Training']"));
			onlineTraining.click();
		}
	}
}

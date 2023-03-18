package switchAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToDefaultContentAlerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		WebElement btn = driver.findElement(By.id("confirmBox"));

		btn.click();

		Alert alert = driver.switchTo().alert();

		alert.accept();

		//driver.switchTo().defaultContent();

		btn.click();

	}
}

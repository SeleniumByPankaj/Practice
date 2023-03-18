package exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeoutEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1300)");

		WebDriverWait wait = new WebDriverWait(driver, 20);

		By deletesuccess = By.id("deletesuccess");

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(deletesuccess));
		} catch (TimeoutException e) {

			Thread.sleep(10000);
		}

		driver.findElement(By.id("alert2")).click();
	}

}

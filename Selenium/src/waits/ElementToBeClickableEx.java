package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementToBeClickableEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		By checkbox = By.id("dte");
		
		By Btn = By.xpath("//button [text() = 'Check this']");
		
		driver.findElement(Btn).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(checkbox));
		
		driver.findElement(checkbox).click();
		
	}

}

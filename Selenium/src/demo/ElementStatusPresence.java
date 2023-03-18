package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementStatusPresence {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// -------------------- Demo for isDisplayed --------------------------

		/*driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 20);

		WebElement btn2 = driver.findElement(By.id("btn2"));

		btn2.click();
		
		By txt2 = By.id("txt2");
		
		wait.until(ExpectedConditions.elementToBeClickable(txt2));
		
		WebElement textBox = driver.findElement(txt2);
		
		System.out.println("text is displayed "+textBox.isDisplayed());
		
		driver.findElement(txt2).sendKeys("Pankaj Bharambe"); */

		
		// ------------------- Demo for isSelected ----------------------------------
		
		/*driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		driver.manage().window().maximize();
		
		WebElement hindichbx = driver.findElement(By.id("hindichbx"));

		System.out.println("Hindi checkbox is selected "+hindichbx.isSelected());
		
		hindichbx.click();
		
		System.out.println("Hindi checkbox is selected "+hindichbx.isSelected());*/
		
		
		// --------------------- Demo for isEnabled -------------------------------------
		
		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		WebElement enabledBtn = driver.findElement(By.id("but2"));
		
		System.out.println("is Button enabled "+enabledBtn.isEnabled());
		
		WebElement disabledBtn = driver.findElement(By.id("but1"));
		
		System.out.println("is Button enabled "+disabledBtn.isEnabled());
		
	}
}

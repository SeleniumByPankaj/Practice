package switchWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchMultipleWindows {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().window().maximize();
		
		WebElement parentTextBox = driver.findElement(By.id("name"));
		
		parentTextBox.sendKeys("This is parent textbox");
		
		WebElement newWindowsBtn = driver.findElement(By.id("newWindowsBtn"));
		
		newWindowsBtn.click();
		
		Set<String> windows = driver.getWindowHandles();
		
		switchToRightTab("XPath", windows);

	}

	public static boolean switchToRightTab(String title, Set<String> windows) {

		for (String windowId : windows) {
			String windowTitle = driver.switchTo().window(windowId).getTitle();

			// to check if correct tab is opened
			if (windowTitle.contains(title)) {
				System.out.println("correct window is opened");
				return true;
			}
		}
		return false;
	}
	
}

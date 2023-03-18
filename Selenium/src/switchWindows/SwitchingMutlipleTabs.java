package switchWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingMutlipleTabs {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().window().maximize();

		WebElement parentTextBox = driver.findElement(By.id("name"));

		parentTextBox.sendKeys("This is parent textbox");

		WebElement newTabsBtn = driver.findElement(By.id("newTabsBtn"));

		newTabsBtn.click();

		Set<String> tabs = driver.getWindowHandles();
		
		switchToRightTab("Basic Controls", tabs);

	}

	public static boolean switchToRightTab(String title, Set<String> tabs) {

		for (String tabId : tabs) {
			String tabTitle = driver.switchTo().window(tabId).getTitle();

			// to check if correct tab is opened
			if (tabTitle.contains(title)) {
				System.out.println("correct tab is opened");
				return true;
			}
		}
		return false;
	}
}

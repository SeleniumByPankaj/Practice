package switchWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingMutlipleTabs2 {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().window().maximize();

		WebElement newTabsBtn = driver.findElement(By.id("newTabsBtn"));
		
		newTabsBtn.click();
		
		Set<String> tabs = driver.getWindowHandles();
		
		switchToRightTab("AlertsDemo", tabs);
	}
	
	public static boolean switchToRightTab (String title, Set<String> tabList )
	{
		for (String tabId : tabList) {
			String tabTitle = driver.switchTo().window(tabId).getTitle();
			
			if (tabTitle.contains(title))
			{
				System.out.println("Correct tab is selected");
				return true;
			}
		}
		return false;
	}
	
}

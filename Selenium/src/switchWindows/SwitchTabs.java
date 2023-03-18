package switchWindows;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTabs {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().window().maximize();
		
		WebElement parentTextBox = driver.findElement(By.id("name"));
		
		parentTextBox.sendKeys("This is parent textbox");
		
		WebElement newTabBtn = driver.findElement(By.id("newTabBtn"));
		
		newTabBtn.click();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		// switch to new tab
		
		driver.switchTo().window(tabs.get(1));
		
		System.out.println("title of the new tab is "+driver.getTitle());
		
		// switch to parent tab
		
		driver.switchTo().window(tabs.get(0));
		
		System.out.println("title of the parent tab is "+ driver.getTitle());
	
	}
}

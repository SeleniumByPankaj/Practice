package switchWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().window().maximize();
		
		WebElement parentTextBox = driver.findElement(By.id("name"));
		
		parentTextBox.sendKeys("This is parent textbox");
		
		WebElement newWindowBtn = driver.findElement(By.id("newWindowBtn"));
		
		newWindowBtn.click();
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> getWindows = driver.getWindowHandles();
		
		for (String handles : getWindows) {
			
			if (!handles.equals(parentWindow))
				
			{
				driver.switchTo().window(handles);
				driver.manage().window().maximize();
				WebElement firstName = driver.findElement(By.id("firstName"));
				firstName.sendKeys("Pankaj");
			}
			
			Thread.sleep(10000);
			//driver.switchTo().window(parentWindow);
			
			driver.switchTo().window("");
			
		//	driver.switchTo().defaultContent();
			
			parentTextBox.clear();
			
			parentTextBox.sendKeys("switching back to parent window is success");
			
			//driver.quit();
		}
		
		
	}
}

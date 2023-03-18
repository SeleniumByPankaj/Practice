package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAPI {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		/*driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		WebElement srcElement = driver
				.findElement(By.cssSelector(".ui-widget-content.ui-draggable.ui-draggable-handle"));

		WebElement destElement = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);

		act.clickAndHold(srcElement).moveToElement(destElement).release().build().perform();
		
		act.clickAndHold(srcElement).moveByOffset(300, 0).build().perform();
		
		act.dragAndDrop(srcElement, destElement).build().perform();*/
		
		// -----------------------------------------------------------------------------------------------------------
		
		// Right click using action API example
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		WebElement rightClickBtn = driver.findElement(By.xpath("//span [text() = 'right click me']"));
		
		Actions act = new Actions(driver);
		
//		act.contextClick(rightClickBtn).build().perform();
		
		WebElement doubleClick = driver.findElement(By.xpath("//button [text() = 'Double-Click Me To See Alert']"));
		
		act.doubleClick(doubleClick).build().perform();
		
	}
}
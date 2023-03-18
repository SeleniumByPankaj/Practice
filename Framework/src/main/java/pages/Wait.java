package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import baseFunctions.Base;

public class Wait extends Base {

	public static void main(String[] args) {

		Base base = new Base();
		
		base.getLocalDriver();

		driver.get("http://omayo.blogspot.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1300)");

		By deletesuccess = By.id("deletesuccess");

		base.waitForElement(deletesuccess, 30, WaitType.InvisibilityOfElementLocated);

		driver.findElement(By.id("alert2")).click();
	}
}

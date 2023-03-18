package webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/sql/sql_select.asp");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebElement tableLocator = driver.findElement(By.xpath("//table [@class = 'ws-table-all notranslate']"));

		int rowCount = tableLocator.findElements(By.tagName("tr")).size();

		int colCount = tableLocator.findElements(By.tagName("th")).size();

		System.out.println(rowCount);

		// static way of getting specific table data
//		WebElement tableData = driver
//				.findElement(By.xpath("//table [@class ='ws-table-all notranslate']//tbody//tr[2]//td[2]"));
//
		// System.out.println(tableData.getText());

		for (int i = 2; i <= rowCount; i++) {
			for (int j = 1; j <= colCount; j++) {
				WebElement tableData = driver.findElement(
						By.xpath("//table [@class = 'ws-table-all notranslate']//tbody//tr[" + i + "]//td[" + j + "]"));
				System.out.println(tableData.getText());
			}

		}

	}

}

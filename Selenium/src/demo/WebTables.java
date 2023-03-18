package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/sql/sql_select.asp");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebElement tableLocator = driver.findElement(By.xpath("//table [@class = 'ws-table-all notranslate']"));

		int rowCount = tableLocator.findElements(By.tagName("tr")).size();

		System.out.println(rowCount);

		// WebElement tableData = driver.findElement(By.xpath("//table [@class =
		// 'ws-table-all notranslate']//tbody//tr[2]//td[2]"));

		// System.out.println(tableData.getText());

//		for (int i = 2; i <= 6; i++) {
//			for (int j = 1; j <= 7; j++) {
//				WebElement tableData = driver.findElement(
//						By.xpath("//table [@class = 'ws-table-all notranslate']//tbody//tr[" + i + "]//td[" + j + "]"));
//				System.out.print(tableData.getText());
//			}
//		}

		ArrayList<WebElement> rowList = WebTables.getRow(tableLocator);
		
		for (Iterator iterator = rowList.iterator(); iterator.hasNext();) {
			WebElement rowData = (WebElement) iterator.next();
			System.out.println(rowData.getText());
			
		}
	}

	public static ArrayList<WebElement> getRow(WebElement tableLocator) {
		
		By rowLocator = By.tagName("tr");
		
		List<WebElement> rows = tableLocator.findElements(rowLocator);
		
		return (ArrayList<WebElement>) rows;
	}

}

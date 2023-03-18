package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCellData {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/sql/sql_select.asp");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebElement tableLocator = driver.findElement(By.xpath("//table [@class = 'ws-table-all notranslate']"));

		GetCellData.getRow(tableLocator);
	}

	public static void getRow(WebElement tableLocator) {

		By rowLocator = By.tagName("tr");
		By colLocator = By.tagName("td");

		List<WebElement> rowsList = tableLocator.findElements(rowLocator);

		List<WebElement> columnsList = null;

		for (WebElement row : rowsList) {
			columnsList = row.findElements(colLocator);

			for (WebElement column : columnsList) {
				String col = column.getText();
				if (col.equalsIgnoreCase("Thomas Hardy"))
					System.out.println("It is true");
			}
		}
	}

}

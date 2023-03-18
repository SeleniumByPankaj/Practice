package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetData {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/sql/sql_select.asp");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		WebElement tableLocator = driver.findElement(By.xpath("//table [@class = 'ws-table-all notranslate']"));
		
		getData(tableLocator, "London");
	}
	
	public static void getData(WebElement tableLocator, String stringTOMatch)
	{
		By rowLocator = By.tagName("tr");
		By columnLocator = By.tagName("td");
		
		List<WebElement> rowsList = tableLocator.findElements(rowLocator);
		
		List<WebElement> columnList = null;
		
		for (WebElement row : rowsList) {
			columnList = row.findElements(columnLocator);
			
			for (WebElement column : columnList) {
			String columnData = column.getText();
				if (columnData.equals(stringTOMatch))
				{
					System.out.println("It is true");
				}
			}
		}
	}
}

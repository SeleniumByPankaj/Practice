package webTables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableHandle {
	static WebDriver driver;

	static WebElement tableLocator = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/sql/sql_select.asp");

		driver.manage().window().maximize();
		
		tableLocator = driver.findElement(By.xpath("//table [@class = 'ws-table-all notranslate']"));

		DynamicTableHandle DT = new DynamicTableHandle();
		
		DT.getCellData(tableLocator, "City");
	}

	public static int rowCount() {
		int rowCount = tableLocator.findElements(By.tagName("tr")).size();
		System.out.println("no of rows in the table are "+rowCount);
		return rowCount;
	}

	public static int colCount() {
		int colCount = tableLocator.findElements(By.tagName("th")).size();
		System.out.println("No of columns in the table are "+colCount);
		return colCount;
	}

	public static ArrayList<String> getRow(WebElement tableLocator, int rowNumber) {

		List<WebElement> rows = driver.findElements(By.xpath("//table [@class ='ws-table-all notranslate']//tbody//tr["+rowNumber+"]"));

		List<String> rowsAsString = new ArrayList<String>();

		for (WebElement row : rows) {
			rowsAsString.add(row.getText());
		}

		return (ArrayList<String>) rowsAsString;
	}

	public Map<String, Integer> getIndexOfColumns() {
		String colHead = null;

		Map<String, Integer> cols = new HashMap<String, Integer>();

		int totalColumns = DynamicTableHandle.colCount();

		for (int i = 1; i <= totalColumns; i++) {
			colHead = driver.findElement(By.xpath("//th[" + i + "]")).getText();

			cols.put(colHead, i);
			System.out.println("Printing map inside of for loop" + cols);
		}

		System.out.println("Printing map outside of for loop" + cols);
		return cols;
	}

	public Map<String, ArrayList<String>> rowList(WebElement tableLoc) {
		int totalRows = DynamicTableHandle.rowCount();

		Map<String, ArrayList<String>> rowData = new HashMap<>();

		ArrayList<String> ListOfRows = null;

		for (int i = 1; i <= totalRows; i++) {
			ListOfRows = getRow(tableLoc, i);

			System.out.println(ListOfRows);

			rowData.put(""+i, ListOfRows);
		}

		return rowData;
	}

	public void getCellData(WebElement tableLoc, String columnName) {
		String city = null;
		Map<String, ArrayList<String>> rows1 = rowList(tableLoc);
		Map<String, Integer> colSeq = getIndexOfColumns();

		for (ArrayList<String> row : rows1.values())
			city = row.get(colSeq.get(columnName));
		
	System.out.println("Name of the city is "+city);
	}
}

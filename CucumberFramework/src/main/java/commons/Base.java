package commons;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.RedBusSearchBusesPO;

public class Base {

	public static WebDriver driver;
	public static WebDriverWait wait;

	List<String> monthList = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sept", "Oct",
			"Nov", "Dec");

	String expDate = null;
	int expMonth;
	int expYear;

	boolean currentMonthDate;

	public WebDriver getLocalDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	public void closeDriver() {
		driver.close();
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public void getUrl(String URL) {
		driver.get(URL);
	}

	public void clearValue(By locator) {
		WebElement element = driver.findElement(locator);
		element.clear();
	}

	public ArrayList<WebElement> getList(By locator) {
		return (ArrayList<WebElement>) driver.findElements(locator);
	}

	public void setValue(By locator, String input) {
		driver.findElement(locator).sendKeys(input);
	}

	public WebElement getwebElement(By locator) {
		return driver.findElement(locator);
	}

	public String getCurrentDate() {

		Calendar cal = Calendar.getInstance();

		SimpleDateFormat dateOnly = new SimpleDateFormat("MMM/dd/yyyy");
		return dateOnly.format(cal.getTime());
	}

	public String getWebelementText(By Locator) {

		return driver.findElement(Locator).getText();
	}

	public enum WaitType {
		visibilityOfElementLocated, ElementToBeClickable, ElementToBeSelected, InvisibilityOfElementLocated,
		presenceOfElementLocated, FrameToBeAvailableAndSwitchToIt, StalenessOf, AlertIsPresent
	}

	public boolean waitForElement(By locator, int WaitTime, WaitType waitType) {
		wait = new WebDriverWait(driver, WaitTime);
		switch (waitType) {
		case visibilityOfElementLocated:
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return true;
		case ElementToBeClickable:
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			return true;
		case ElementToBeSelected:
			wait.until(ExpectedConditions.elementToBeSelected(locator));
			return true;
		case presenceOfElementLocated:
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return true;
		case InvisibilityOfElementLocated:
			wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
			return true;
		case FrameToBeAvailableAndSwitchToIt:
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
			return true;
		case AlertIsPresent:
			wait.until(ExpectedConditions.alertIsPresent());
			return true;
		case StalenessOf:
			wait.until(ExpectedConditions.stalenessOf(getwebElement(locator)));
			return true;
		default:
			System.out.println("Invalid wait type selected");
		}
		return false;
	}

	public void selectDay(String expDate) {

//		WebElement datePicker = driver.findElement(By.id("onward_cal"));
		//
//		datePicker.click();

		WebElement calender = getwebElement(RedBusSearchBusesPO.calender);

		List<WebElement> dates = calender.findElements(RedBusSearchBusesPO.tableData);

		for (WebElement desireDate : dates) {
			if (desireDate.getText().equals(expDate)) {
				desireDate.click();
				break;
			}
		}

	}

	public void selectDate(String date) { // 20/10/2023

		click(RedBusSearchBusesPO.datePicker);

		String[] dateSplits = date.split("/");
		expDate = dateSplits[0];
		expMonth = Integer.parseInt(dateSplits[1]);
		expYear = Integer.parseInt(dateSplits[2]);

		currentMonthDate = true;

		while (currentMonthDate) {

			String monthYearElement = getWebelementText(RedBusSearchBusesPO.monthYearElement);

			String[] monthYearArray = monthYearElement.split(" ");
			String currentMonth = monthYearArray[0];
			int currentYear = Integer.parseInt(monthYearArray[1]);

			// If current selected month and year are the same as expected month and year
			// then go inside this condition.
			if (monthList.indexOf(currentMonth) + 1 == expMonth && expYear == currentYear) {
				selectDay(expDate);
				currentMonthDate = false;
			}

			else if (monthList.indexOf(currentMonth) + 1 < expMonth && expYear == currentYear
					|| expYear > currentYear) {

				click(RedBusSearchBusesPO.nextBtn);
			}

			else if (monthList.indexOf(currentMonth) + 1 > expMonth && expYear == currentYear
					|| expYear < currentYear) {
				click(RedBusSearchBusesPO.prevBtn);
			}

		}

	}

}

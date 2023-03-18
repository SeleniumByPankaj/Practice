
package pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;

import baseFunctions.Base;
import baseFunctions.ConfigReader;
import pageObjects.RedBusSearchBusesPO;

public class RedbusSearch extends Base {

	Base base = new Base();
	ConfigReader cr = new ConfigReader();

	List<String> monthList = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sept", "Oct",
			"Nov", "Dec");

	String expDate = null;
	int expMonth;
	int expYear;

	boolean currentMonthDate;

	public void init() {
		base.getLocalDriver();
		base.getUrl(cr.getApplicationURL());
	}

	public void selectLocations(String source, String destination) {
		
		base.clearValue(RedBusSearchBusesPO.srcElement);

		base.setValue(RedBusSearchBusesPO.srcElement, source);

		List<WebElement> srcLocationsList = base.getList(RedBusSearchBusesPO.locations);

		int noOfSrcLocations = srcLocationsList.size();

		System.out.println("No of source locations in the list are " + noOfSrcLocations);

		for (int i = 0; i < noOfSrcLocations; i++) {
			String desiredLocation = srcLocationsList.get(i).getText();

			if (desiredLocation.contains(source)) {
				srcLocationsList.get(i).click();
				break;
			}
		}

		base.clearValue(RedBusSearchBusesPO.destElement);

		base.setValue(RedBusSearchBusesPO.destElement, destination);

		List<WebElement> destLocations = base.getList(RedBusSearchBusesPO.locations);

		int noOfDestLocations = destLocations.size();

		System.out.println("No of destination locations in the list are " + noOfDestLocations);

		for (int i = 0; i < noOfDestLocations; i++) {
			String desiredLocation = destLocations.get(i).getText();

			if (desiredLocation.contains(destination)) {
				destLocations.get(i).click();
				break;
			}
		}
	}

	public void selectDay(String expDate) {

//			WebElement datePicker = driver.findElement(By.id("onward_cal"));
		//
//			datePicker.click();

		WebElement calender = base.getwebElement(RedBusSearchBusesPO.calender);

		List<WebElement> dates = calender.findElements(RedBusSearchBusesPO.tableData);

		for (WebElement desireDate : dates) {
			if (desireDate.getText().equals(expDate)) {
				desireDate.click();
				break;
			}
		}

	}

	public void selectDate(String date) { // 20/10/2023

		base.click(RedBusSearchBusesPO.datePicker);

		String[] dateSplits = date.split("/");
		expDate = dateSplits[0];
		expMonth = Integer.parseInt(dateSplits[1]);
		expYear = Integer.parseInt(dateSplits[2]);

		currentMonthDate = true;

		while (currentMonthDate) {

			String monthYearElement = base.getWebelementText(RedBusSearchBusesPO.monthYearElement);

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

				base.click(RedBusSearchBusesPO.nextBtn);
			}

			else if (monthList.indexOf(currentMonth) + 1 > expMonth && expYear == currentYear
					|| expYear < currentYear) {
				base.click(RedBusSearchBusesPO.prevBtn);
			}

		}

	}

}

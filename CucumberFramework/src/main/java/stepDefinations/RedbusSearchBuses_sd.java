package stepDefinations;

import java.util.List;

import org.openqa.selenium.WebElement;

import commons.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RedBusSearchBusesPO;

public class RedbusSearchBuses_sd extends Base {

	Base base = new Base();

	@When("^enter source location as (.+)$")
	public void enter_source_location_as(String sourcelocation) {
		base.clearValue(RedBusSearchBusesPO.srcElement);

		base.setValue(RedBusSearchBusesPO.srcElement, sourcelocation);

		List<WebElement> srcLocationsList = base.getList(RedBusSearchBusesPO.locations);

		int noOfSrcLocations = srcLocationsList.size();

		System.out.println("No of source locations in the list are " + noOfSrcLocations);

		for (int i = 0; i < noOfSrcLocations; i++) {
			String desiredLocation = srcLocationsList.get(i).getText();

			if (desiredLocation.contains(sourcelocation)) {
				srcLocationsList.get(i).click();
				break;
			}
		}
	}

	@Then("^verify new page$")
	public void verify_new_page() {

	}

	@And("^enter destination location as (.+)$")
	public void enter_destination_location_as(String destlocation) {

		base.clearValue(RedBusSearchBusesPO.destElement);

		base.setValue(RedBusSearchBusesPO.destElement, destlocation);

		List<WebElement> destLocations = base.getList(RedBusSearchBusesPO.locations);

		int noOfDestLocations = destLocations.size();

		System.out.println("No of destination locations in the list are " + noOfDestLocations);

		for (int i = 0; i < noOfDestLocations; i++) {
			String desiredLocation = destLocations.get(i).getText();

			if (desiredLocation.contains(destlocation)) {
				destLocations.get(i).click();
				break;
			}
		}

	}

	@And("^select date as (.+)$")
	public void select_date_as(String date) {

		base.selectDate(date);
	}

	@And("^click on search button$")
	public void click_on_search_button() {
		base.click(RedBusSearchBusesPO.searchBtn);
	}
}

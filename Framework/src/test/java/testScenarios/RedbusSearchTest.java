package testScenarios;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSuite.BaseSuite;
import pages.RedbusSearch;

public class RedbusSearchTest {

	RedbusSearch rs = new RedbusSearch();

	@BeforeTest
	public void init() {
		rs.init();
	}

	@Test (dataProvider = "getValue", dataProviderClass = BaseSuite.class)
	public void searchBuses(String source, String destination, String date ) {
		rs.selectLocations(source, destination);
		rs.selectDate(date);
	}
}

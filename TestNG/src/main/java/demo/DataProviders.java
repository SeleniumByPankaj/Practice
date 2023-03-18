package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	@DataProvider (name = "getValue")
	public Object[][] DataSupplier() {
		return new Object[][] { { "Pankaj" }, { "Bharambe" } };
	}
	
	@Test (dataProvider = "getValue")
	public void login (String value) {
		System.out.println("Passed parameter is "+value);
	}
	
// If user doesn't provide name explicitely to the data provider method then testNG will consider name of the method as data provider name.	
	@DataProvider
	public Object[][] Data() {
		return new Object[][] { { "Deepti" }, { "Patil" } };
	}
	
	@Test (dataProvider = "Data")
	public void myTest (String Input) {
		System.out.println("Passed parameter is "+Input);
	}
}

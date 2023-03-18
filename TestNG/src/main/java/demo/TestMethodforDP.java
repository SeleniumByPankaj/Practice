package demo;

import org.testng.annotations.Test;

public class TestMethodforDP {

	@Test(dataProvider = "getValue" ,  dataProviderClass = DataProviders.class)
	public void login(String value) {
		System.out.println("Passed parameter is " + value);
	}
}

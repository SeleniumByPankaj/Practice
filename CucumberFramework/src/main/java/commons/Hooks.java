package commons;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {

	ConfigReader cg = new ConfigReader();
	@Before
	public void setUp() {
		System.out.println("This will print before scenario");
		getLocalDriver();
		driver.get(cg.getApplicationURL());
	}

	@After
	public void tearDown() {
		System.out.println("This will print after scenario");
	}
}

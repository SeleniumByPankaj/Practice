package demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {

	@Test
	@Parameters ({"val1", "val2"})
	public void sum(int v1, int v2) {
		int finalSum = v1 + v2;
		System.out.println("final sum of the two numbers is " + finalSum);
	}
}


/*<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
	<test thread-count="5" name="Test">
		<parameter name="val1" value="5" />
		<parameter name="val2" value="3" />
		<classes>
			<class name="demo.ParametersDemo" />
		</classes>
	</test> <!-- Test -->
</suite> <!-- Suite --> */

package demo;

import org.testng.annotations.Test;

public class Groups {

	@Test (groups = "Sanity")
	public void A() {
		System.out.println("This is test case A");
	}

	@Test (groups = "Sanity")
	public void B() {
		System.out.println("This is test case B");
	}

	@Test (groups = "Regression")
	public void C() {
		System.out.println("This is test case C");
	}

	@Test (groups = "Regression")
	public void D() {
		System.out.println("This is test case D");
	}

}

/*<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
	<test thread-count="5" name="Test">
		<groups>
			<run>
				<include name="Sanity"></include>
				<exclude name="Regression"></exclude>
			</run>
		</groups>
		<classes>
			<class name="demo.Groups" />
		</classes>
	</test> <!-- Test -->
</suite> <!-- Suite --> */

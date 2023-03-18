package demo;

import org.testng.annotations.Test;

public class Priority {

	// start of -- demo of no priority to any methods
	@Test
	public void B() {
		System.out.println("This is test case B");
	}

	@Test
	public void A() {
		System.out.println("This is test case A");
	}

	// end of -- demo of no priority to any methods

	// start of -- demo of same priority to all methods
	@Test(priority = 1)
	public void C() {
		System.out.println("This is test case C");
	}

	@Test(priority = 1)
	public void D() {
		System.out.println("This is test case D");
	}

	// end of -- demo of same priority to all methods

	// start of -- demo of different priority to all methods
	@Test(priority = 2)
	public void E() {
		System.out.println("This is test case E");
	}

	@Test(priority = 1)
	public void F() {
		System.out.println("This is test case F");
	}

	// end of -- demo of different priority to all methods

	// start of -- demo of priority to one method
	@Test(priority = 1)
	public void G() {
		System.out.println("This is test case G");
	}

	@Test
	public void H() {
		System.out.println("This is test case H");
	}

	// end of -- demo of priority to one method
}

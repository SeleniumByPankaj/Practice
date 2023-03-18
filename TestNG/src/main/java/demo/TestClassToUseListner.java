package demo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (demo.Listeners.class)
public class TestClassToUseListner {

	@Test
	public void print () {
		System.out.println("Print Hello World");
	}
	
	@Test
	public void TestToFail ()
	{
		Assert.assertTrue(false);
	}
}

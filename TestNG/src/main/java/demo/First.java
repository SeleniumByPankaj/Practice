package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class First {

	@Test
	public void checkSearch ()
	{
		System.out.println("search test");
	}
	
	
	@BeforeClass
	public void beforeClass1 ()
	{
		System.out.println("This is before class method from first class");
	}
	
	@AfterClass
	public void afterClass ()
	{
		System.out.println("This is after class method from First class");
	}
	
	@AfterTest
	public void afterTest ()
	{
		System.out.println("this is after test from first class");
	}
	
	@AfterSuite
	public void tearDown ()
	{
		System.out.println("closing webdriver instance");
	}
}

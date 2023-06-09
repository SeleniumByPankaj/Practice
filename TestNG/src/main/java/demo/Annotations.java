package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@Test
	public void checkLogin ()
	{
		System.out.println("Login test");
	}
	
	@Test 
	public void checkSignUp ()
	{
		System.out.println("SignUp Test");
	}
	
	@BeforeMethod
	public void openDBConnection ()
	{
		System.out.println("opening DB Connection");
	}
	
	@AfterMethod
	public void closeDBConnection ()
	{
		System.out.println("Closing DB connection");
	}
	
	@BeforeClass
	public void beforeClass ()
	{
		System.out.println("This is before class method");
	}
	
	@AfterClass
	public void afterClass1 ()
	{
		System.out.println("This is after class method from annoations class");
	}
	
	@BeforeTest
	public void beforeTest ()
	{
		System.out.println("this is before test from annotations class");
	}
	
	@BeforeSuite
	public void setUp()
	{
		System.out.println("Webdriver is setting up");
	}
}

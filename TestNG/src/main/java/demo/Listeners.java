package demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listeners implements ITestListener{

	public void onStart (ITestContext Result)
	{
		
	}
	
	public void onFinish (ITestContext Result)
	{
		
	}
	
	public void onTestStart (ITestResult Result)
	{
		System.out.println("The name of the started method is "+Result.getName());
	}
	
	public void onTestSuccess (ITestResult Result)
	{
		System.out.println("The name of the passed method is "+Result.getName());
	}
	
	public void onTestFailure (ITestResult Result)
	{
		System.out.println("The name of the failed method is "+Result.getName());
	}
	
	@Test 
	public void print () {
		System.out.println("Print Hello World");
	}
}

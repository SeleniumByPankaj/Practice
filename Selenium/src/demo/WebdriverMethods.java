package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "E:\\Pankaj\\Automation\\01SeptSeleniumDemo\\Drivers\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// used to launch url
		driver.get("https://gmail.com");
		
		// used to get title of the webpage open
		System.out.println(driver.getTitle());
		
		// used to get page source of opened webpage
		System.out.println(driver.getPageSource());

		// used to get current url of opened webpage
		System.out.println(driver.getCurrentUrl());
				
		// used to maximize the webpage
		driver.manage().window().maximize();
		
		// used to refresh the current webpage
		driver.navigate().refresh();
		
		// used to navigate forword on webpage
		driver.navigate().forward();
		
		// used to navigate back on webpage
		driver.navigate().back();
		
		// used to close current instance of browser
		driver.close();
		
		
	}

}

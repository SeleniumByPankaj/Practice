package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		driver.manage().window().maximize();

		// -------------------------- Single value selection dropdown handle
		// -------------------------------

//		WebElement dropdown = driver.findElement(By.id("course"));
//
//		Select sel = new Select(dropdown);

//		sel.selectByIndex(2);
//
//		sel.selectByValue("js");
//
//		sel.selectByVisibleText("Dot Net");

//		List<WebElement> DropDownOptions = sel.getOptions();
//		
//		int noOfOptions = DropDownOptions.size();
//
//		for (Iterator iterator = DropDownOptions.iterator(); iterator.hasNext();) {
//			WebElement DropDownValue = (WebElement) iterator.next();
//			System.out.println(DropDownValue.getText());
		// }

		// -------------------------- End of Single value selection dropdown handle
		// -------------------------------

		// -------------------------- Start of Multiple value selection dropdown handle
		// -------------------------------

		WebElement dropdown = driver.findElement(By.id("ide"));

		Select sel = new Select(dropdown);

		sel.selectByIndex(0);

		sel.selectByValue("nb");

		sel.selectByVisibleText("Visual Studio");

		// sel.deselectAll();

		// sel.deselectByIndex(2);

		// sel.deselectByValue("ec");

		// sel.deselectByVisibleText("Visual Studio");

//		List<WebElement> dropdownOptions = sel.getOptions();
//
//		for (Iterator iterator = dropdownOptions.iterator(); iterator.hasNext();) {
//			WebElement dropdownValue = (WebElement) iterator.next();
//			System.out.println(dropdownValue.getText());
//		}
		
//		List<WebElement> selectedOptions = sel.getAllSelectedOptions();
//		
//		for (Iterator iterator = selectedOptions.iterator(); iterator.hasNext();) {
//			WebElement optionValue = (WebElement) iterator.next();
//			System.out.println(optionValue.getText());
//		}
		
		System.out.println(sel.getFirstSelectedOption().getText());
	}

}

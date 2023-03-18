package pageObjects;

import org.openqa.selenium.By;

public class RedBusSearchBusesPO {

	public static By srcElement = By.id("src");
	
	public static By locations = By.xpath("//ul [@class = 'autoFill homeSearch']//li");
	
	public static By destElement = By.id("dest");
	
	public static By calender = By.id("rb-calendar_onward_cal");
	
	public static By tableData = By.tagName("td");
	
	public static By datePicker = By.id("onward_cal");
	
	public static By monthYearElement = By.className("monthTitle");
	
	public static By nextBtn = By.className("next");
	
	public static By prevBtn = By.className("prev");
	
	public static By searchBtn = By.id("search_btn");
	
	
	
}

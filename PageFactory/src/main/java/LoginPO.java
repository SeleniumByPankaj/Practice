import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPO {

	WebDriver driver;

	public LoginPO(WebDriver driver) {
		this.driver = driver;
	}

	// locaters
//	@FindBy(xpath = "(//span [@class = 'VfPpkd-vQzf8d'])[3]")
//	WebElement createBtn;

	@FindBy(how = How.XPATH, using = "// span [text() = 'For myself']")
	WebElement forMySelf;

	@FindBy(name = "firstName")
	WebElement f_Name;

	// --------------------------------------------

	// @FindBys will work on AND logic... if we are giving multiple locater then if
	// all of the locaters gets matched then only selenium will perform further
	// action.
//	@FindBys({ @FindBy(xpath = "(//div[@class = 'VfPpkd-RLmnJb'])[3]"),
//			@FindBy(xpath = "(//span[@class = 'VfPpkd-vQzf8d'])[3]") })
//	WebElement createBtn2;

	// ----------------------------------------------
//@FindAll will work on OR logic... if we are giving multiple locaters thenif one of the locaters if matches then also seleniumm will locate element and perform next action
	@FindAll({ @FindBy(xpath = "(//div[@class = 'VfPpkd2222-RLmnJb'])[3]"),
			@FindBy(xpath = "(//span[@class = 'VfPpkd-vQzf8d'])[3]") })
	WebElement createBtn3;

	public void loginGmail() {
		createBtn3.click();
		forMySelf.click();
		f_Name.sendKeys("Pankaj");
	}

}

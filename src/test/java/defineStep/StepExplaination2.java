package defineStep;
import org.openqa.selenium.WebDriver;

import coreAction.OpenAndCloseBrowser;
import cucumber.api.java.en.Given;

public class StepExplaination2 {
	WebDriver driver;
	OpenAndCloseBrowser ocb = new OpenAndCloseBrowser();
	
	
	@Given("^users login page Test$")
	public void users_login_page_Test() throws Throwable {
		 ocb.openUrl("http://www.google.com");
		 ocb.closeBrowser();
	}
}

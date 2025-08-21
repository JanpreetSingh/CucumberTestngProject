package testngRunner;

import org.openqa.selenium.support.PageFactory;

import coreAction.OpenAndCloseBrowser;
import pageFunctions.LoginTestPF;


public class Initialize extends OpenAndCloseBrowser{
	
	protected LoginTestPF lpf = new LoginTestPF(driver);
	
	/*@BeforeMethod
	public void initialize() {
		lpf = PageFactory.initElements(driver, LoginTestPF.class);;
		//lpf = new LoginTestPF(driver);
		//pageFunctions.LoginTestPF@64b70919
	}*/
	 
	
}

package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTestPE2 {
	

	public LoginTestPE2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//span[text()='Hello, Sign in']")
	public WebElement yourOrders ;
	
	@FindBy(xpath="//span[text()='Your Orders']")
	public WebElement yourOrders1 ;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement userName ;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password ;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submit ;
	
	/*
	 * public void clickYourOrders() { try {
	 * System.out.println("Click on your order button"); Thread.sleep(5000);
	 * yourOrders.click(); } catch (Exception e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); }
	 * 
	 * }
	 */

}

package coreAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionDriver{
protected WebDriver driver;
	
	public ActionDriver(WebDriver driver) {
		this.driver = driver;
		}
	public void mouseHover(WebElement element) {
		
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

}

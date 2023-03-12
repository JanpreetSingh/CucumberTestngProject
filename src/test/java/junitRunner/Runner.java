package junitRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import coreAction.Initialize;
import coreAction.OpenAndCloseBrowser;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;



@CucumberOptions( 
	features = ".//src//test//resources//featureFile",
	glue = "defineStep"
	)

public class Runner extends OpenAndCloseBrowser{
	
	private TestNGCucumberRunner testRunner;
	
	@BeforeClass
	public void setup() throws InterruptedException{
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\kamlesh.maurya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Opening chrome browser");
		driver = new ChromeDriver();*/
		
		testRunner = new TestNGCucumberRunner(Runner.class);
		openUrl("https://www.amazon.in/");
	}
	
	@Test(description="login", dataProvider = "features")
	public void login(CucumberFeatureWrapper cFeature)
	{
		testRunner.runCucumber(cFeature.getCucumberFeature());
	}
	
	@DataProvider(name="features")
	public Object[][] getFeatures()
	{
		return testRunner.provideFeatures();
	}
	
	@AfterClass
	public void tearDown()
	{
		testRunner.finish();
	}

}

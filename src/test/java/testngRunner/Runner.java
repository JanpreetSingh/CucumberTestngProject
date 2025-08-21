package testngRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;



@CucumberOptions( 
	features = ".//src//test//resources//featureFile",
	glue = "defineStep",
	plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	)

public class Runner extends AbstractTestNGCucumberTests{
	
	private TestNGCucumberRunner testRunner;
	
	@BeforeClass
	public void setup() throws InterruptedException{
		
		testRunner = new TestNGCucumberRunner(Runner.class);
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

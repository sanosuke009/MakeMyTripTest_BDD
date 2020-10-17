package StepDefinitions;

import org.testng.Assert;

import TestManagers.ConfigManager;
import TestManagers.DriverManager;
import TestManagers.ReportingManager;
import TestMethods.PageActions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsMakeMyTrip {
	
	@Before
	public void initialize(Scenario scenario)
	{
		ReportingManager.initScenario(scenario);
	}
	
	@Given("^Make My Trip Home Page is Open in Browser$")
	public void openurl()
	{
		Assert.assertTrue(DriverManager.launchBrowser(ConfigManager.configGet("URL")));
	}
    
	@And("^Search Button is visible$")
	public void waitforsearchbutton()
	{
		Assert.assertTrue(PageActions.waitforSearchElement());
	}
	
	@When("^Select Destination City$")
	public void clickondestination()
	{
		Assert.assertTrue(PageActions.ClickOnDestination());
	}
	
	@And("^Select A Date In Calendar$")
	public void clickondate()
	{
		Assert.assertTrue(PageActions.ClickOnFutureDate());
	}
	
	@Then("^Validate Heading Review your booking$")
	public void validatereviewbookingheader()
	{
		Assert.assertTrue(PageActions.validateReviewYourBooking());
		DriverManager.closeBrowser();
	}
	
	@And("^Click on \"([^\"]*)\" Button$")
	public void clickonButton(String buttonName)
	{
		Assert.assertTrue(PageActions.ClickOnButton(buttonName));
	}
	
	@And("^Validate \"([^\"]*)\" Button$")
	public void validateelement(String elementName)
	{
		Assert.assertTrue(PageActions.validateButton(elementName));
	}
	
}

package StepDefinitions;

import org.testng.Assert;

import TestManagers.ConfigManager;
import TestManagers.DriverManager;
import TestMethods.PageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsMakeMyTrip{
	
	@Given("^Make My Trip Home Page is Open in \"([^\"]*)\" Browser$")
	public void openurl(String browserName)
	{
		Assert.assertTrue(DriverManager.launchBrowser(ConfigManager.configGet("URL"), browserName));
	}
    
	@And("Search Button is visible")
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
		//DriverManager.closeBrowser();
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

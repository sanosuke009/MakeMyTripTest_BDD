package StepDefinitions;

import org.testng.Assert;

import TestBaseClass.BaseC;
import TestManagers.ConfigManager;
import TestManagers.DriverManager;
import TestMethods.PageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsGoogleSearch{
		
	@Given("Google Home Page is Open in Browser")
	public void openurl()
	{
		Assert.assertTrue(DriverManager.launchBrowser(ConfigManager.configGet("googleURL")));
	}

    @Given("Click on \"([^\"]*)\" Link")
    public void Click_on_Button(String elementName) {
        // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(PageActions.ClickOnButton(elementName));
    }

    @Then("Validate \"([^\"]*)\" Link")
    public void Validate_Button(String elementName) {
        // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(PageActions.validateButton(elementName));
    }

    @When("Click on \"([^\"]*)\" Field")
    public void Click_on_Field(String s) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(PageActions.ClickOnButton(s));
    }

    @When("Type \"([^\"]*)\" on \"([^\"]*)\" Field")
    public void Type_on_Field(String s, String s2) {
        // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(PageActions.typeInField(BaseC.config.getProperty(s), s2));
    }

    @Given("Validate \"([^\"]*)\" Field")
    public void Validate_Field(String s) {
        // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(PageActions.validateButton(s));
    }

    @When("Type Enter on \"([^\"]*)\" Field")
    public void Type_Enter_on_Field(String s) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(PageActions.typeENTERInField(s));
    }
	
}

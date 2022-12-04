package StepDefinitions;

import org.testng.Assert;

import TestBaseClass.BaseC;
import TestManagers.ConfigManager;
import TestManagers.DriverManager;
import TestMethods.PageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsGoogleSearch{
		
	@Given("Google Home Page is Open in {string} Browser")
	public void openurl(String browserName)
	{
		Assert.assertTrue(DriverManager.launchBrowser(ConfigManager.configGet("googleURL"), browserName));
	}

    @Given("Validate {string} Field")
    public void Validate_Field(String s) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(PageActions.validateButton(s));
    }

    @When("Click on {string} Field")
    public void Click_on_Field(String s) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(PageActions.ClickOnButton(s));
    }

    @When("Type {string} on {string} Field")
    public void Type_on_Field(String s, String s2) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(PageActions.typeInField(BaseC.config.getProperty(s), s2));
    }

    @When("Type Enter on {string} Field")
    public void Type_Enter_on_Field(String s) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(PageActions.typeENTERInField(s));
    }

    @Then("Validate {string} Link")
    public void Validate_Link(String s) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(PageActions.validateButton(s));
    }

    @Given("Click on \"([^\"]*)\" Link")
    public void Click_on_Button(String elementName) {
        // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(PageActions.ClickOnButton(elementName));
    }
}

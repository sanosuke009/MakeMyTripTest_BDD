package StepDefinitions;

import TestManagers.DriverManager;
import TestManagers.ReportingManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepsBase {
    @Before
	public void initialize(Scenario scenario)
	{
		ReportingManager.initScenario(scenario);
	}

    @After
    public void close(Scenario scenario)
	{
		DriverManager.closeBrowser();
	}
}

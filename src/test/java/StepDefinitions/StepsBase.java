package StepDefinitions;

import TestManagers.DriverManager;
import TestManagers.ReportingManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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

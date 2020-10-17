package TestManagers;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import TestBaseClass.BaseC;
import cucumber.api.Scenario;

public class ReportingManager {
	
	public static void initScenario(Scenario scenario)
	{
		ConfigManager.loadconfig();
		BaseC.scenario=scenario;
	}
	
	public static void takeScreenShot()
	{
		byte[] sc = ((TakesScreenshot)BaseC.driver).getScreenshotAs(OutputType.BYTES);
		BaseC.scenario.embed(sc, "image/png");
	}

	public static void printInReport(String message)
	{
		BaseC.scenario.write(message);
		System.out.println(message);
	}
}

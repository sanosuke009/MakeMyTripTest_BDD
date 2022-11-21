package TestManagers;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import TestBaseClass.BaseC;
import io.cucumber.java.Scenario;

public class ReportingManager {
	
	public static void initScenario(Scenario scenario)
	{
		ConfigManager.loadconfig();
		BaseC.scenario=scenario;
	}
	
	public static void takeScreenShot()
	{
		byte[] sc = ((TakesScreenshot)BaseC.driver).getScreenshotAs(OutputType.BYTES);
		BaseC.scenario.attach(sc, "image/png", null);
	}

	public static void takeScreenShot(String name)
	{
		byte[] sc = ((TakesScreenshot)BaseC.driver).getScreenshotAs(OutputType.BYTES);
		BaseC.scenario.attach(sc, "image/png", name);
	}

	public static void printInReport(String message)
	{
		BaseC.scenario.log(message);
		System.out.println(message);
	}
}

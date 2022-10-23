package TestBaseClass;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;

public class BaseC {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties config = new Properties();
	public static Scenario scenario;

}

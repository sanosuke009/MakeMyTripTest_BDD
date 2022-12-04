package TestBaseClass;

import java.util.Properties;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class BaseC {
	
	public static WebDriver driver;
	public static Capabilities browserOpts;
	public static WebDriverWait wait;
	public static Properties config = new Properties();
	public static Scenario scenario;

}

package TestManagers;

import java.net.URL;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBaseClass.BaseC;

public class DriverManager {
	
	public static boolean launchBrowser(String url)
	{
		boolean res = false;
		try {
			ChromeOptions chromeOpts = getChromeOptions(Boolean.valueOf(BaseC.config.getProperty("headless")));
			BaseC.driver = BaseC.config.getProperty("docker.host.execution").equals("true")?
			new RemoteWebDriver(new URL(BaseC.config.getProperty("docker.host.URL")), 
			chromeOpts): new ChromeDriver(chromeOpts);

			BaseC.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.valueOf(
				BaseC.config.getProperty("implicitwait"))));
			BaseC.wait = new WebDriverWait(BaseC.driver, Duration.ofSeconds(Integer.valueOf(
				BaseC.config.getProperty("explicitwait"))));
			BaseC.driver.get(url);
			BaseC.driver.manage().window().maximize();
			res = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			res = false;
		}
			return res;
	}
	
	public static void closeBrowser()
	{
		BaseC.driver.quit();
	}

	/**
     * Method getChromeOptions.
     *
     * @return the chrome options.
     */

	public static ChromeOptions getChromeOptions(boolean headless) {
        final ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        //chromeOptions.setExperimentalOption("useAutomationExtension", false);

        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        //chromeOptions.addArguments("--headless");
		chromeOptions.setHeadless(headless);
        //chromeOptions.addArguments("--window-size=1580,1280");

        final HashMap<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        chromeOptions.setExperimentalOption("prefs", prefs);

        return chromeOptions;
    }

}

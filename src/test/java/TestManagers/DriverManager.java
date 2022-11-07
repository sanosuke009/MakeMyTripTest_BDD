package TestManagers;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBaseClass.BaseC;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	//@SuppressWarnings("deprecation")
	public static boolean launchBrowser(String url)
	{
		boolean res = false;
		try {
			WebDriverManager.chromedriver().setup();
			BaseC.driver = BaseC.config.getProperty("headless").equals("true")?
			new ChromeDriver(getChromeOptions()):new ChromeDriver();
			BaseC.driver.manage().timeouts().implicitlyWait(Integer.valueOf(BaseC.config.getProperty("implicitwait")), TimeUnit.MILLISECONDS);
			BaseC.wait = new WebDriverWait(BaseC.driver, Integer.valueOf(BaseC.config.getProperty("explicitwait")));
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
    public static ChromeOptions getChromeOptions() {
        final ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        //chromeOptions.setExperimentalOption("useAutomationExtension", false);

        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        //chromeOptions.addArguments("--headless");
		chromeOptions.setHeadless(true);
        //chromeOptions.addArguments("--window-size=1580,1280");

        final HashMap<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        chromeOptions.setExperimentalOption("prefs", prefs);

        return chromeOptions;
    }

}

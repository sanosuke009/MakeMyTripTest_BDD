package TestManagers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBaseClass.BaseC;

public class DriverManager {
	
	//@SuppressWarnings("deprecation")
	public static boolean launchBrowser(String url)
	{
		boolean res = false;
		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
			BaseC.driver = new ChromeDriver();
			BaseC.driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			BaseC.wait = new WebDriverWait(BaseC.driver, 30);
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

}

package TestManagers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import TestBaseClass.BaseC;

public class ConfigManager {
	
	public static void loadconfig()
	{
		InputStream inp = null;
		try {
			inp = new FileInputStream(System.getProperty("user.dir")+"\\Configurations\\config.properties");
			BaseC.config.load(inp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String configGet(String key)
	{
		return BaseC.config.getProperty(key);
	}

}

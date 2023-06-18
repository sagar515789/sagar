package util;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigReader 
{
	public static Properties intilazeproperties()
	{
		Properties prope = new Properties();
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
		 
		try {
			FileInputStream fis = new FileInputStream(file);
			prope.load(fis);
		} 
		catch (  Throwable e) 
		{
			
			e.printStackTrace();
		}
		return prope;
		
		
	}

}

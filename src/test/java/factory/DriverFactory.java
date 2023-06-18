package factory;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import util.ConfigReader;

public class DriverFactory 
{
	 static WebDriver driver;
	public static WebDriver intialize_browser(String browser)
	{
		Properties prop = ConfigReader.intilazeproperties();
		 
		if(browser.equals("chrome"))
		{
			ChromeOptions co = new ChromeOptions();
		      co.addArguments("--remote-allow-origins=*");
		       driver = new ChromeDriver(co);
		}
		else if(browser.equals("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver =new EdgeDriver();
		}
		
		
		driver.manage().deleteAllCookies();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.manage().window().maximize();
	      driver.get(prop.getProperty("url"));
	      
	      return driver;
		
		
		
	}
	public static WebDriver getDriver()
	{
		return driver;
	}

}

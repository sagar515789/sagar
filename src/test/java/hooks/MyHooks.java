package hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;


import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.ConfigReader;

public class MyHooks
{
	   WebDriver driver;
	@Before
	public void setup()
	{
		  Properties prop = ConfigReader.intilazeproperties();
		
		driver =DriverFactory.intialize_browser(prop.getProperty("browser"));
		driver=DriverFactory.getDriver();
		driver.manage().deleteAllCookies();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.manage().window().maximize();
	      driver.get(prop.getProperty("url"));
	}
	@After
	public void teardown()
	{
		driver.quit();
	}

}

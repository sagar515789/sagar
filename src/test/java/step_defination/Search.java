package step_defination;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.*;

public class Search 
{
	WebDriver driver;
	@Given("User enters the url of application")
	public void user_enters_the_url_of_application() 
	{
	    driver = DriverFactory.getDriver();
	}

	@When("User enters the {string} into search textfield")
	public void user_enters_the_into_search_textfield(String validproduct) 
	{
	    driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("HP");
	}

	@When("User clicks on search icon for next")
	public void user_clicks_on_search_icon_for_next() 
	{
	 driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	}

	@Then("User should get displayed on search results page")
	public void user_should_get_displayed_on_search_results_page() 
	{
	  boolean laptop = driver.findElement(By.xpath("//a[normalize-space()='HP LP3065']")).isDisplayed();
	  Assert.assertTrue(laptop);
	}
	
	@When("User enters the {string} into search textfield for inavlid product")
	public void user_enters_the_into_search_textfield_for_inavlid_product(String inalidproduct) 
	{
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("honda");
	}

	@When("User clicks on search icon for next step")
	public void user_clicks_on_search_icon_for_next_step() 
	{
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	}

	@Then("User should get displayed proper error message for inalid product")
	public void user_should_get_displayed_proper_error_message_for_inalid_product() 
	{
	    boolean invalid = driver.findElement(By.xpath("//h2[normalize-space()='Products meeting the search criteria']")).isDisplayed();
		Assert.assertTrue(invalid);
		
	}
	
	

	@When("User  does not enter the  into search textfield")
	public void user_does_not_enter_the_into_search_textfield() 
	{
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("");
	}

	@When("User clicks on search icon for execution")
	public void user_clicks_on_search_icon_for_execution() 
	{
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	}

	@Then("User should get displayed proper error message for empty search textfield")
	public void user_should_get_displayed_proper_error_message_for_empty_search_textfield() 
	{
		boolean product = driver.findElement(By.xpath("//h2[normalize-space()='Products meeting the search criteria']")).isDisplayed();
		Assert.assertTrue(product);
	}


}

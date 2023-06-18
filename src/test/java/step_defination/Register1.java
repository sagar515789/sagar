package step_defination;


import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.HomePage;

public class Register1 
{
	 WebDriver driver;
		
		 
	@Given("User navigates into register page")
	public void user_navigates_into_register_page() 
	{
		driver=DriverFactory.getDriver();
		      HomePage homepage = new HomePage(driver);
		      homepage.ClickOnMyAccount();
		      homepage.RegisterClick();
		
	}

	@When("User enters the details into below mentioned text field")
	public void user_enters_the_details_into_below_mentioned_text_field(io.cucumber.datatable.DataTable dataTable) 
	{
	         Map<String, String> datamap = dataTable.asMap(String.class,String.class);
	         driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(datamap.get("firstname"));
	         driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(datamap.get("lastname"));
	         driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(datamap.get("email"));
	         driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(datamap.get("telephone"));
	         driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(datamap.get("password"));
	         driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(datamap.get("password"));
	}

	@When("User selects on privacy policy")
	public void user_selects_on_privacy_policy() 
	{
	    driver.findElement(By.xpath("//input[@name='agree']")).click();
	}

	@When("User clicks on continue button for execution")
	public void user_clicks_on_continue_button_for_execution() 
	{
	    driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() 
	{
	  boolean textmessage = driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']")).getText().contains("Congratulations! Your new account has been successfully created!");
	  Assert.assertTrue(textmessage);
	}

	@When("User selects yes for news letter")
	public void user_selects_yes_for_news_letter() 
	{
	    driver.findElement(By.xpath("//label[normalize-space()='Yes']//input[@name='newsletter']")).click();
	}

	@When("User clicks on continue button for next step execution")
	public void user_clicks_on_continue_button_for_next_step_execution() 
	{
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@When("User clicks on continue button for next step")
	public void user_clicks_on_continue_button_for_next_step() 
	{
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("User account should get proper error message of dupliacte email")
	public void user_account_should_get_proper_error_message_of_dupliacte_email() 
	{
	 boolean text5 = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText().contains("alert alert-danger alert-dismissible");
	  Assert.assertTrue(text5);
	}

	@When("User does not enter into any fields")
	public void user_does_not_enter_into_any_fields() 
	{
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("");
	}

	@Then("User clicks on continue button")
	public void user_clicks_on_continue_button() 
	{
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("User should get proper error message of reqired fields")
	public void user_should_get_proper_error_message_of_reqired_fields() 
	{
	 boolean text8 = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText().contains("Warning: You must agree to the Privacy Policy!");
	 Assert.assertTrue(text8);
	 
	}

	
}

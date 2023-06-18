package step_defination;



import org.junit.Assert;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;

import io.cucumber.java.en.*;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class Login
{
	  WebDriver driver;
	  LoginPage loginpage;
	AccountPage accountpage;
		
		@Given("User navigates to login page")
		public void user_navigates_to_login_page() 
		{
			 driver= DriverFactory.getDriver();
			 HomePage homepage = new HomePage(driver);
			 homepage .ClickOnMyAccount();
			homepage.SelectLoginOption();
		     
		}

		@When("User enters valid email id {string} into email textfield")
		public void user_enters_valid_email_id_into_email_textfield(String validemailtext) 
		{
			 loginpage = new LoginPage(driver);
			 loginpage.EmailTextField(validemailtext);

		}

		@When("User enters the password {string} into password textfield")
		public void user_enters_the_password_into_password_textfield(String validpasswordtext) 
		{
			  loginpage = new LoginPage(driver);
			 loginpage.PasswordField(validpasswordtext);
		}

		@When("User cliks on login button")
		public void user_cliks_on_login_button() 
		{
			 loginpage = new LoginPage(driver);
			loginpage.LoginButton();
		}

		@Then("User should get successfully logged in")
		public void user_should_get_successfully_logged_in() 
		{
			 accountpage = new AccountPage(driver);
			Assert.assertTrue(accountpage.AccountConfirmation());
			
		}

		@When("User enters invalid email id {string} into email textfield")
		public void user_enters_invalid_email_id_into_email_textfield(String invalidemailtext) 
		{
			 loginpage = new LoginPage(driver);
			 loginpage.InvalidEmailTextField(invalidemailtext);
		}

		@When("User enters the in correct password {string} into password textfield")
		public void user_enters_the_in_correct_password_into_password_textfield(String validpasswordtext) 
		{
			loginpage = new LoginPage(driver);
			 loginpage.PasswordField(validpasswordtext);
			
		}

		@Then("User should get warning messgae")
		public void user_should_get_warning_messgae() 
		{
			
			Assert.assertTrue(loginpage.WarningMessage().contains("Warning: No match for E-Mail Address and/or Password."));
			 
		}

		@When("User does not enter valid email id  into email textfield")
		public void user_does_not_enter_valid_email_id_into_email_textfield() 
		{
			loginpage.EmptyEmailTextField();
			
		}

		@When("User  does not enter the password  into password textfield")
		public void user_does_not_enter_the_password_into_password_textfield() 
		{
			loginpage.EmptyPasswordField();
			
		}


	}
	
	 
	
	
	


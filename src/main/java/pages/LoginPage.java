package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement EmailField;
	public void EmailTextField(String validemailtext)
	{
		EmailField.sendKeys(validemailtext);
	}
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement PasswordField;
	public void PasswordField(String validpasswordtext)
	{
		PasswordField.sendKeys(validpasswordtext);
	}
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginclick;
	public void LoginButton()
	{
		loginclick.click();
	}
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement InvalidEmailField;
	public void InvalidEmailTextField(String invalidemailtext)
	{
		InvalidEmailField.sendKeys(invalidemailtext);
	}
	
	@FindBy(css = ".alert.alert-danger.alert-dismissible")
	private WebElement MessageWarning;
	public String WarningMessage() 
	{
		return MessageWarning.getText();
	}
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement EmptyEmailField;
	public void EmptyEmailTextField()
	{
		EmptyEmailField.sendKeys();
	}
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement EmptyPasswordField;
	public void EmptyPasswordField()
	{
		EmptyPasswordField.sendKeys();
	}
	
	
}

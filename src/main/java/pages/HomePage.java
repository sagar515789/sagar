package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	
	public HomePage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "a[title='My Account'] span[class='hidden-xs hidden-sm hidden-md']")
	private WebElement MyAccountDropMenu;
	
	@FindBy(css = "li[class='dropdown open'] li:nth-child(2) a:nth-child(1)")
	private WebElement LoginOption;
	
	public void ClickOnMyAccount()
	{
		MyAccountDropMenu.click();
	}
	

	public void SelectLoginOption() 
	{
		LoginOption.click();
		
	}
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	private WebElement Register;
	public void RegisterClick() 
	{
		Register.click();
		
	}


	
	

	

}

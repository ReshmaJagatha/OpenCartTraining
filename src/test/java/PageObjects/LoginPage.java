package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Basepage
{
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
	}

	//Elements
	@FindBy(xpath="//input[@id='input-email']")WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-password']")WebElement txtpassword;
	
	@FindBy(xpath="//input[@value='Login']")WebElement btnlogin;
	
	
	//Action
	public void setemail(String email) 
	{
		txtemail.sendKeys(email);
	}
	
	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		btnlogin.click();
	}

}

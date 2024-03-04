package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Basepage
{
  public RegistrationPage(WebDriver driver)
  {
	  super(driver);
  }
  //finding web elements
  @FindBy(name="firstname") WebElement firstname;
  @FindBy(name="lastname") WebElement lastname;
  @FindBy(name="email") WebElement email;
  @FindBy(name="telephone") WebElement phone;
  @FindBy(name="password") WebElement password;
  @FindBy(name="confirm") WebElement confirm;
  @FindBy(name="agree") WebElement checked;
  @FindBy(xpath="//input[@value='Continue']") WebElement btncontinue;
  @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement confirmation;
  
  public void setFirstName(String fname)
  {
	  firstname.sendKeys(fname);
  }
  public void setLastName(String lname) 
	{
	  lastname.sendKeys(lname);
	}
	public void setEmail(String Email)
	{
		email.sendKeys(Email);
	}
	
	
	public void setTelephone(String tel) 
	{
		phone.sendKeys(tel);
	}
	
	public void setPassword(String psw) 
	{
		password.sendKeys(psw);
	}
	
	public void setConfirmPassword(String conpsw) 
	{
		confirm.sendKeys(conpsw);
	}
	
	public void setPrivatePolicy() 
	{
		checked.click();
	}
	
	public void clickcontinue()
	{
		
		btncontinue.click();
	}
	public String getconfirmationmsg()
	{
		try {
		return(confirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
}


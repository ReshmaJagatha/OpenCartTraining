package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage
{
public Homepage(WebDriver driver)
{
	super(driver);
}
//Elements locating
 By lnkmyaccount=By.xpath("//span[normalize-space()='My Account']");
 
 
 @FindBy(xpath="//a[normalize-space()='Register']")WebElement lnkregister;
 @FindBy(xpath="//a[normalize-space()='Login']") WebElement lnklogin;
 
 //Action methods
 public void clickmyaccount()
 {
   driver.findElement(lnkmyaccount).click();	 
   
 }
 
 public void clickregister() 
 {
	 lnkregister.click();
 }
 public void clicklogin() 
 {
	 lnklogin.click(); 	 
 }
}
 
 
 

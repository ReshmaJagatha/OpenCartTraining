package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import PageObjects.Homepage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;

public class TC_002_LoginTest extends BaseClass
{
	@Test(groups= {"sanity"})
	public void logintest()
	{
		try
		{
		Homepage hp=new Homepage(driver);
		hp.clickmyaccount();
		hp.clicklogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setemail(rb.getString("email"));
		lp.setpassword(rb.getString("password"));
		lp.clicklogin();
		
		
		MyAccountPage mac=new MyAccountPage(driver);
		boolean status=mac.isMyAccountPageExists();
		
		Assert.assertEquals(status, true);
		}
		catch(Exception e) 
		{
			Assert.assertTrue(false);
		}
	}
}

package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.Homepage;
import PageObjects.LoginPage;
import TestBase.BaseClass;
import Utilities.DataProviders;
import PageObjects.MyAccountPage;

public class TC_003_loginDDT extends BaseClass
{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void test_loginddt(String email,String pwd,String exp)
	{
		logger.info("Starting TC_003_LoginDataDrivenTest  ...");
		try
		{
		Homepage hp=new Homepage(driver);
		
		hp.clickmyaccount();
		hp.clicklogin();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setemail(email);
		lp.setpassword(pwd);
		lp.clicklogin();
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage=macc.isMyAccountPageExists();
		
		if(exp.equals("Valid")) 
		{
			if(targetpage==true)
			{
				macc.clicklogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			
		}
		if(exp.equals("Invalid")) 
		{
			if(targetpage==true)
			{
				macc.clicklogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
			}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("Starting TC_003_LoginDataDrivenTest  ...");
	}
}

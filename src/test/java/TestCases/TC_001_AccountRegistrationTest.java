package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.Homepage;
import PageObjects.RegistrationPage;
import TestBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass
{
	@Test(groups= {"regression","master"})
	public void test_account_registration() 
	{
		
	logger.info("starting Tc_001_AccountRegistration ");
	logger.debug("capturing debug logs");
	logger.trace("capturing trace logs.......");
			
	Homepage hp=new Homepage(driver);
	
	logger.info("clicking on my account");
	hp.clickmyaccount();
	
	logger.info("clicking on registration");
	hp.clickregister();
	
	RegistrationPage accreg=new RegistrationPage(driver);
	
	
	logger.info("passing user details");
	accreg.setFirstName(randomString());
	accreg.setLastName(randomString());
	accreg.setEmail(randomString()+"@gmail.com");
	accreg.setTelephone(randomnumber());
	
	String pwd=randomAlphaNumeric();
	accreg.setPassword(pwd);
	accreg.setConfirmPassword(pwd);
	
	accreg.setPrivatePolicy();
	
	logger.info("clicking on continue");
	accreg.clickcontinue();
	
	
	
	String confirmmsg=accreg.getconfirmationmsg();
	if(confirmmsg.equals("Your Account Has Been Created!")) 
	{
		Assert.assertTrue(true);
	}
	else 
	{
		Assert.fail();
	}
	
	
	}
}

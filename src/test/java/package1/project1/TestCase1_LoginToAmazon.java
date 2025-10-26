package package1.project1;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;

@Listeners(ListenersLogic.class)

public class TestCase1_LoginToAmazon extends BaseClass{
	
	@Test(retryAnalyzer=RetryLogic.class)
	public void withValidCrede()
	{
		AmazonHomePage homepage=new AmazonHomePage(driver);
		homepage.hoveroveronAccountAndList(driver);
		homepage.SignIn();
		Reporter.log("From Home Page-Hoverover on Accounts and List->Click on SignIn");
		
		AmazonLoginPage loginpage = new AmazonLoginPage(driver);
		loginpage.validUsername();
		loginpage.clickContinue();
		loginpage.validPassword();
		loginpage.SignInContinue();
		
		Reporter.log("Login was successful with valid username and vailid password");
		
		
	}


}

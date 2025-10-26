package package1.project1;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class TestCase3_LoginToAmazonSearchLogout extends BaseClass{
	
	@Test(retryAnalyzer=RetryLogic.class)
	public void withValidCrede() throws InterruptedException
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
		
		
		homepage.searchingProduct();
		Reporter.log("Searching the product on Amazon");		
		homepage.hoveroveronAccountAndList(driver);
		Reporter.log("Trying logout -> Hoverover on Account an List");
		homepage.SignOut();
		Reporter.log("Click on SignOut-> Logout is completed");
		
		
	}


}

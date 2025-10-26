package package1.project1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonLoginPage {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
	//Step1
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(id="continue")
	private WebElement clickContinue;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(id="auth-signin-button")
	private WebElement SignInbutton;
	
	//Step2
	public void validUsername()
	{
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("cherrycharitha.jaddu@gmail.com");
	}
	
	public void clickContinue()
	{
		wait.until(ExpectedConditions.elementToBeClickable(clickContinue));
		clickContinue.click();
	}
	
	public void validPassword()
	{
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("Vizag@2025");
	}
	
	public void SignInContinue()
	{
		wait.until(ExpectedConditions.elementToBeClickable(SignInbutton));
		SignInbutton.click();
	}

	//Step3
	public AmazonLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

package package1.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//step1
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginbutton;
	
	
	
	//step2
	
	public void username_valid()
	{
		username.sendKeys("cherrycharitha.jaddu@gmail.com");
	}
	
	public void password_valid()
	{
		username.sendKeys("12345");
	}
	
	public void loginwithCorrectcred()
	{
		loginbutton.click();
	}
	
	
	//step3
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);}

}

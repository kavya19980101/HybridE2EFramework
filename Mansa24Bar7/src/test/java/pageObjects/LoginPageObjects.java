package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	//Declaration
	@FindBy(name="username")
	private WebElement Usn_TF;
	
	@FindBy(name="password")
	private WebElement Pwd_TF;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement Login_BTN;
	
	@FindBy(xpath="//h5[.='Login']")
	private WebElement logintxt;
	
	
	
	
	
	//Initilization
	public LoginPageObjects(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	
	//Utilization
	public WebElement Usn_TF()
	{
		return Usn_TF;
	}
	
	public WebElement Pwd_TF()
	{
		return Pwd_TF;
	}
	
	public WebElement Login_BTN()
	{
		return Login_BTN;
	}
	
	public WebElement logintxt()
	{
		return logintxt;
	}
	
	
	
}

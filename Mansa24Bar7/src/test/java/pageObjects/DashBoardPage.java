package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	//Declaration
		@FindBy(xpath ="//button[@type='button' and @size='large']")
		private WebElement Upgrade_Btn;
		
		@FindBy(xpath ="(//img[@alt='profile picture'])[1]")
		private WebElement ProfilePicture;
		
		@FindBy(xpath ="//a[.='Logout']")
		private WebElement LogoutOptions;
		
		@FindBy(xpath="(//span[.='PIM'])[1]")
		private WebElement PIM_BTN;
		
		//Initilization
		public DashBoardPage(WebDriver driver)
		{
		PageFactory.initElements(driver, this);	
		}
		
		//Utilization
		public WebElement Upgrade_Btn()
		{
			return Upgrade_Btn;
		}
		
		public WebElement ProfilePicture()
		{
			return ProfilePicture;
		}
		
		public WebElement LogoutOptions()
		{
			return LogoutOptions;
		}
		
		public WebElement PIM_BTN()
		{
			return PIM_BTN;
		}
}

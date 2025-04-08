package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPageObjects {

	//Declaration
			@FindBy(xpath ="//a[.='Add Employee']")
			private WebElement Add_Employee_BTN;
			
			@FindBy(name="firstName")
			private WebElement FN_tf;
			
			@FindBy(name="lastName")
			private WebElement LN_tf;
			
			@FindBy(xpath = "//button[@type='submit']")
			private WebElement save_btn;
			
			//Initilization
			public PimPageObjects(WebDriver driver)
			{
			PageFactory.initElements(driver, this);	
			}
			
			//Utilization
			public WebElement Add_Employee_BTN()
			{
				return Add_Employee_BTN;
			}
			
			public WebElement FN_tf()
			{
				return FN_tf;
			}
			
			public WebElement LN_tf()
			{
				return LN_tf;
			}
			
			public WebElement save_btn()
			{
				return save_btn;
			}
}


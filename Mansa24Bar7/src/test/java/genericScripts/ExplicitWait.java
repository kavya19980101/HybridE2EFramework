package genericScripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait extends BasePage{

	public static WebDriverWait wait;

	public static WebElement waitUntilElementLoad(WebDriver driver,WebElement element)
	{
		
		wait=new WebDriverWait(driver, 60);
		
		return wait.until(ExpectedConditions.visibilityOf(element));		
		
	}
}

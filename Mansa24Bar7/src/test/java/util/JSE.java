package util;

import org.openqa.selenium.WebElement;

import genericScripts.BasePage;

public class JSE extends BasePage {

	public static void passvalue(String value,WebElement element)
	{
		Objects.javaScriptExe(driver).executeScript("argument[0].value='"+value+"'", element);
	}
	
	public static void clearValue(WebElement element)
	{
		Objects.javaScriptExe(driver).executeScript("argument[0].clear()",element);
	}
	
	public static void scrollTillElement(WebElement element)
	{
		Objects.javaScriptExe(driver).executeScript("argument[0].scrollIntoView()",element);
	}
}

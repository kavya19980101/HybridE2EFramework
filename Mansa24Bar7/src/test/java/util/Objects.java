package util;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Objects {

	public static Actions MouseActions(WebDriver driver)
	{
		Actions act=new Actions(driver);
		return act;
	}
	
	public static Select dropDown(WebElement element)
	{
		Select s=new Select(element);
		return s;
	}
	
	public static JavascriptExecutor javaScriptExe(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		return jse;
	}
	
	public static Robot keyBoardActions() throws AWTException
	{
		Robot r=new Robot();
		return r;
	}
}

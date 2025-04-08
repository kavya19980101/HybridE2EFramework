package util;

import org.openqa.selenium.WebElement;

import genericScripts.BasePage;

public class MouseActions extends BasePage {

	public static void rightClick(WebElement element)
	{
		Objects.MouseActions(driver).contextClick(element).perform();
	}
	public static void doubleClick(WebElement element)
	{
		Objects.MouseActions(driver).doubleClick(element).perform();
	}
	public static void mouseHovering(WebElement element)
	{
		Objects.MouseActions(driver).moveToElement(element).perform();
	}
	public static void DragAndDrop(WebElement srcElement,WebElement destElement)
	{
		Objects.MouseActions(driver).dragAndDrop(srcElement,destElement).perform();
	}
	public static void clickandHold(WebElement element)
	{
		Objects.MouseActions(driver).clickAndHold(element).perform();
	}
	
}

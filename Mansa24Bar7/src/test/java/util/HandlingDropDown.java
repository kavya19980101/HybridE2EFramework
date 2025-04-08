package util;

import org.openqa.selenium.WebElement;

import genericScripts.BasePage;

public class HandlingDropDown extends BasePage{

	public static void selectOptions(WebElement element,Object value)
	{
		if(value instanceof Integer)
		{
			Objects.dropDown(element).selectByIndex((int) value);
		}
		else if (value instanceof String) {
			try {
				Objects.dropDown(element).selectByValue((String) value);
			} catch (Exception e) {
				Objects.dropDown(element).selectByVisibleText((String) value);
			}
		}
	}
	public static void deSelectOptions(WebElement element,Object value)
	{
		if(value instanceof Integer)
		{
			Objects.dropDown(element).deselectByIndex((int) value);
		}
		else if (value instanceof String) {
			try {
				Objects.dropDown(element).deselectByValue((String) value);
			} catch (Exception e) {
				Objects.dropDown(element).deselectByVisibleText((String) value);
			}
			
		}
	}
}

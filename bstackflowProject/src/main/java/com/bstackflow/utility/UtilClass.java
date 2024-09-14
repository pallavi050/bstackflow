package com.bstackflow.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.bstackflow.testbase.Testbase;

public class UtilClass extends Testbase{

	
	//-----------------------drop down------------------
	
	public static void selectOptionFromDropdownWithVisibleText(WebElement element,String text)
	{
		Select s=new Select(element);
	  s.selectByVisibleText(text);
	}
	
	public static void moveToElement(WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
		element.click();
	}
}

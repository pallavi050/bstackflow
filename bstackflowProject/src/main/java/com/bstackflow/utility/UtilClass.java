package com.bstackflow.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.bstackflow.testbase.Testbase;

public class UtilClass extends Testbase{

	
	//-----------------------drop down------------------
	
		public static void selectOptionFromDropdownWithIndex(WebElement element,int index)
		{
			Select s=new Select(element);
		  s.selectByIndex(index);
		}
}

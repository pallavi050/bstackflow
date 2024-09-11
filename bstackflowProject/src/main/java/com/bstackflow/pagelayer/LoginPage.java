package com.bstackflow.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bstackflow.utility.UtilClass;

public class LoginPage {

	
private WebDriver driver;
public LoginPage(WebDriver driver)
{
	this.driver=driver;
}
	
	private By username_dropdown=(By.xpath("//div[text()=\"Select Username\"]"));
	
	
	private By password_drodown=(By.xpath("//div[text()=\"Select Password\"]"));
	
	
	
	public void enterUsername(String username)
	{
	       driver.findElement(username_dropdown).sendKeys(username);
	}
	
	public void enterPass(String password)
	{
		  driver.findElement(password_drodown).sendKeys(password);
	}
	
	
}

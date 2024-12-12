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
	
	
	private By click_login_Btn=(By.xpath("//button[@id=\"login-btn\"]"));
	
	
	public void enterUsername()     //String username
	{
	       driver.findElement(username_dropdown).click(); //sendKeys(username);
	    
	      UtilClass.moveToElement(driver.findElement((By.xpath("//*[ contains (text(),'demouser')]"))));
	}
	
	public void enterPass()    //String password
	{
		  driver.findElement(password_drodown).click();   //sendKeys(password);
		  UtilClass.moveToElement(driver.findElement(By.xpath("//*[contains(text(),\"testingisfun99\")]")));
	}
	
	public void clickOnLoginBtn()
	{
		driver.findElement(click_login_Btn).click();
	}

	
	
}

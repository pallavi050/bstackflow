package com.bstackflow.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bstackflow.testbase.Testbase;

public class Homepage extends Testbase {

	private WebDriver driver;

	public Homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By signuplink=(By.xpath("(//nav[contains(@class,\"UserNav_root\")])"));
	
	
	public void SignUp()
	{
		driver.findElement(signuplink).click();
	}
	
}

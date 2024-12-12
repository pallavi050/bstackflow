package com.bstackflow.testlayer;

import org.testng.annotations.Test;

import com.bstackflow.pagelayer.Homepage;
import com.bstackflow.pagelayer.LoginPage;
import com.bstackflow.testbase.Testbase;

public class LoginTest extends Testbase{

	@Test
	public void VerifyRegisterWithValidDetails() throws InterruptedException
	{
		Homepage homepage_obj=new Homepage(driver);
		
		homepage_obj.SignUp();
		Thread.sleep(2000);
		LoginPage loginpage_obj=new LoginPage(driver);
		Thread.sleep(2000);
		loginpage_obj.enterUsername();   //"demouser"
		loginpage_obj.enterPass();      //"testingisfun99"
		loginpage_obj.clickOnLoginBtn();
		
	}
}

package com.bstackflow.testbase;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testbase {
	
	public static WebDriver driver; 
	
	@BeforeMethod
	
	public void setUp()
	{
		String browser_name="chrome";
		
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		
		else if(browser_name.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(browser_name.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Provide valid browser name");
		}
		
		driver.get("https://bstackdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
		//logger.info("browser execution finish");
	}

}

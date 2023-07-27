package com.ecommerce.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public String baseURL="https://demo.nopcommerce.com/";
	public String username="sampletesting2424@gmail.com";
	public String password="password@369";
	
	public String txtsearch="Apple iCam";
	public String u_qty="4";
	

	public String signin;
	public static WebDriver driver;

	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//to perform Scroll on application using Selenium

		JavascriptExecutor js=(JavascriptExecutor) driver;
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}


package com.ecommerce.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	WebDriver ldriver;
	public Logout(WebDriver ndriver)
	 {
		 ldriver=ndriver;
		 PageFactory.initElements(ldriver,this);
	 }
	
	@FindBy(linkText = "Log out")
	 WebElement linklogout;
	 
	public void logout() 
	 {
		 linklogout.click();
		 System.out.println("logout successfully......");
	 }
	
}

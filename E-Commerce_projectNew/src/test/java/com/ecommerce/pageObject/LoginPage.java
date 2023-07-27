package com.ecommerce.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver ndriver)
	 {
		 ldriver=ndriver;
		 PageFactory.initElements(ldriver,this);
	 }
	@FindBy(linkText = "Log in")
	 WebElement linklogin;

	 @FindBy(name="Email")
	 WebElement userName;
	 
     @FindBy(name="Password")
	 WebElement userPassword;
	 
     @FindBy(linkText = "Log in")
     WebElement userbtnclick; 
     
	public void lnklogin() 
	 {
		 linklogin.click();	 
	 }
	 
	public void setUserName(String uname) 
	 {
		 userName.sendKeys(uname); 
	 }
	public void setpassword(String pwd) 
	 {
		userPassword.sendKeys(pwd); 
	 }
		
		  public void btnclick() 
		  { 
			  userbtnclick.click(); 
			  System.out.println("Login successful...");
		 }
		 

}

package com.ecommerce.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addproduct {
	WebDriver Adriver;
	public Addproduct(WebDriver ndriver)
	 {
		 Adriver=ndriver;
		 PageFactory.initElements(Adriver,this);
	 }
	
	
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[1]")
	 WebElement item;
	 
	
	public void Addnewitem()
	{
		item.click();
		System.out.println("product added successfully..");
	}
}

package com.ecommerce.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProduct {
	WebDriver ddriver;
	public DeleteProduct(WebDriver ndriver)
	 {
		 ddriver=ndriver;
		 PageFactory.initElements(ddriver,this);
	 }
	
	
	
	@FindBy(className = "remove-btn")
	 WebElement item;
	
	@FindBy(className = "cart-label")
	 WebElement cart;
	
	public void clickoncart()
	{
		cart.click();
	}
	
	public void delete_item()
	{
		item.click();
		System.out.println("item Removed successfully..");
	}
}


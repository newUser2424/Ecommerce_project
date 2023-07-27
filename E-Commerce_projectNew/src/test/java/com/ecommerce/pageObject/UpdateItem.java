package com.ecommerce.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateItem {
	WebDriver udriver;
	public UpdateItem(WebDriver ndriver)
	 {
		 udriver=ndriver;
		 PageFactory.initElements(udriver,this);
	 }
	
	
	
	@FindBy(className = "cart-label")
	 WebElement cart;
	 

	@FindBy(className = "qty-input")
	 WebElement qty;

	//updatecart
	@FindBy(className = "updatecart")
	 WebElement clkupdate;

	
	public void clickoncart()
	{
		cart.click();
	}
	
	public void Update_qty(String u_qty)
	{
		WebElement itemadded=udriver.findElement(By.className("qty-input"));	
	    String itm=itemadded.getText();	
	 
		System.out.println("total item present in cart ::" +itm);
		
	//qty.sendKeys(u_qty);
	}
	public void clickonUpdate()
	{
		clkupdate.click();
		System.out.println("item updated successfully....");
	}
}

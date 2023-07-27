package com.ecommerce.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintPage {
WebDriver pdriver;

public PrintPage(WebDriver ndriver)
{
	 pdriver=ndriver;
	 PageFactory.initElements(pdriver,this);
}

public void itemslist()
{
 List<WebElement> allitems=pdriver.findElements(By.xpath("//div[@class='product-item']"));
 System.out.println("All items size :: "+allitems.size());
 
 System.out.println("All items are as ::");
 for(int i=0;i<allitems.size();i++)
 {
	 String litem=allitems.get(i).getText();
	 System.out.println(litem);
 }
 
}
}

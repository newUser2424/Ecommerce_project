package com.ecommerce.pageObject;

import java.sql.Time;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
WebDriver sdriver;

public SearchPage(WebDriver ndriver)
{
	 sdriver=ndriver;
	 PageFactory.initElements(sdriver,this);
}

@FindBy(name="q")
WebElement txtsearch;

//@FindBy(linkText = "Search")
//WebElement clksearchbtn;


public void searchTextbox(String sname) throws Exception 
{
	
	//List<WebElement>list=sdriver.findElements(By.xpath("//*[@id=\"small-searchterms\"]"));
	 
	 
	/*
	 * code gives list of matching search text
	 * List<WebElement>list=sdriver.findElements(By.xpath(
	 * "//li[@role='option']/@query"));
	 * System.out.println("size of Auto suggestion "+list.size()); for(WebElement
	 * listele:list) { if(listele.getText().equals(sname))
	 * System.out.println("size of Auto suggestion "+listele.getSize()); }
	 */ 
	WebElement list=sdriver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
	txtsearch.sendKeys(sname);	 
	
	list.click();
	
	Thread.sleep(1000);
	
}

public void searchbtn() 
{
	
	WebElement clksearchbtn=sdriver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button"));
	//*[@id="small-search-box-form"]/button
	clksearchbtn.click();;	
	System.out.println("search successful...");
}
}

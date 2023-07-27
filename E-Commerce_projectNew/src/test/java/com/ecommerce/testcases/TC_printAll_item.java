package com.ecommerce.testcases;

import org.testng.annotations.Test;

import com.ecommerce.pageObject.PrintPage;

public class TC_printAll_item extends Baseclass {

	@Test
	public void PrintItem()
	{
		driver.get(baseURL);
		PrintPage prtitem=new PrintPage(driver);
		
		prtitem.itemslist();
		
}
}

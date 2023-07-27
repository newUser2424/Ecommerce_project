package com.ecommerce.testcases;

import org.testng.annotations.Test;

import com.ecommerce.pageObject.Addproduct;

public class TC_AddProduct_001 extends Baseclass{

	@Test
	public void additem()
	{
		driver.get(baseURL);
		Addproduct ap=new Addproduct(driver);
		
		ap.Addnewitem();
		
	}
}

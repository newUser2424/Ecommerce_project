package com.ecommerce.testcases;

import org.testng.annotations.Test;

import com.ecommerce.pageObject.Addproduct;
import com.ecommerce.pageObject.DeleteProduct;

public class TC_delete_001 extends Baseclass{
	@Test
	public void deleteitem()
	{
		driver.get(baseURL);
		Addproduct ap=new Addproduct(driver);
		DeleteProduct dp=new DeleteProduct(driver);
		
		ap.Addnewitem();
		
		dp.clickoncart();
		dp.delete_item();
		
	}

}

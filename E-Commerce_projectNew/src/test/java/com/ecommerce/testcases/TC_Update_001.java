package com.ecommerce.testcases;

import org.testng.annotations.Test;

import com.ecommerce.pageObject.Addproduct;
import com.ecommerce.pageObject.UpdateItem;

public class TC_Update_001 extends Baseclass{
	@Test
	public void UpdateQuantity()
	{
		driver.get(baseURL);
		UpdateItem ui=new UpdateItem(driver);
		Addproduct ap=new Addproduct(driver);
		
		ap.Addnewitem();
		
		ui.clickoncart();
		
		ui.Update_qty(u_qty);
	
		//ui.clickonUpdate();
	}
}

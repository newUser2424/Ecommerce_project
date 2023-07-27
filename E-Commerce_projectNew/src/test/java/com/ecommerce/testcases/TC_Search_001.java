package com.ecommerce.testcases;

import org.testng.annotations.Test;

import com.ecommerce.pageObject.SearchPage;

public class TC_Search_001 extends Baseclass {

	@Test
	public void searchtest() throws Exception
	{
		driver.get(baseURL);
		SearchPage sp=new SearchPage(driver);
		
		
		sp.searchTextbox(txtsearch);
		
		
		Thread.sleep(1000);
		
		sp.searchbtn();
	}
	
}

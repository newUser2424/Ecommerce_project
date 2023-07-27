package com.ecommerce.testcases;

import org.testng.annotations.Test;

import com.ecommerce.pageObject.LoginPage;

public class TC_login_001 extends Baseclass{

	
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		
		lp.lnklogin();
		
		lp.setUserName(username);
		
		lp.setpassword(password);
		
		lp.btnclick();
		
	}
}

package com.ecommerce.testcases;

import org.testng.annotations.Test;

import com.ecommerce.pageObject.LoginPage;
import com.ecommerce.pageObject.Logout;

public class TC_Logout_001 extends Baseclass{
	
		
		@Test
		public void logoutTest()
		{
			driver.get(baseURL);
			LoginPage lp=new LoginPage(driver);
			
			lp.lnklogin();
			
			lp.setUserName(username);
			
			lp.setpassword(password);
			
			lp.btnclick();
			
			Logout lo=new Logout(driver);
			lo.logout();
			
			
		}

}

package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utitlity.BaseClass;

public class TC101 {

	@Test
	public static void tc101() throws Exception{
		BaseClass.openApplication();
		VerifyPage.verifyTitle("HRMS");
		LoginPage.login("nareshit", "nareshit");
		VerifyPage.verifyTitle("OrangeHRM");
		LogoutPage.logout();
		BaseClass.closeApplication();
	}
}

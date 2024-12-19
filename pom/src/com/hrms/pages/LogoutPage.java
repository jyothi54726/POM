package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utitlity.BaseClass;

public class LogoutPage extends BaseClass{

	static By link_logout=By.linkText("Logout");
	public static void logout() {
		driver.findElement(link_logout).click();
		Reporter.log("Logout completed");
	}
}

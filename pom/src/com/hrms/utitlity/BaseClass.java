package com.hrms.utitlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BaseClass {

	public static WebDriver driver;
	public static void openApplication() {
		driver=new FirefoxDriver();
		driver.navigate().to("http://183.82.125.5/nareshit/login.php");
		Reporter.log("Application Opened");
	}
	public static void closeApplication() {
		driver.quit();
		Reporter.log("Application closed");
	}
}

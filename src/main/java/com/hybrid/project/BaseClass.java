package com.hybrid.project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Util.Classes.Utility;


public class BaseClass {
	
	public static WebDriver driver;
	
	public void launchWebsite() {
		 driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		 
//		 driver.get("https://www.google.co.in/");
		
//		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
						
		Utility.setImpicitWait(5000);
		
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		//https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers
		
	}
}

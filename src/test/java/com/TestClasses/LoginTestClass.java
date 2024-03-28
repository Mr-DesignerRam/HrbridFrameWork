package com.TestClasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.PomClassPack.LogicPageClass;
import com.hybrid.project.BaseClass;

public class LoginTestClass extends BaseClass{
	
	
	BaseClass baseClassObj= new BaseClass();
//	LogicPageClass loginPageObj = new LogicPageClass();
	
	
	@BeforeClass
	public void setup() {
		
	baseClassObj.launchWebsite();
// or 	super.launchWebsite();
		
	}
	
	@AfterClass
	public void teardown() {
//		driver.close();
	}
	
	
	@Test
	public void testTitle() {
		
	String titleOfPage = driver.getTitle();
	System.out.println(titleOfPage);
	Assert.assertEquals(titleOfPage, "OrangeHRM");
	}
	
	@Test
	public void adminLogin() {
		
		// creating obj of soft assert
		
		SoftAssert assert1 = new SoftAssert();
		
		LogicPageClass loginPageObj = new LogicPageClass();
		String UName = loginPageObj.getUserName();
		String pass= loginPageObj.getPassword();
		
		assert1.assertEquals(UName, "Admin");
		assert1.assertEquals(pass,"admin123");
		
		
		loginPageObj.setUserName(UName);
		loginPageObj.setPassword(pass);
		loginPageObj.login();
		
		assert1.assertAll();
//		  Assert.assertEquals(UName, "Admin");
//		 Assert.assertEquals(pass, "admin123");

		
	}

}

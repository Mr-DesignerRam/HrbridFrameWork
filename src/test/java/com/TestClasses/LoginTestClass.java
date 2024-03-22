package com.TestClasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PomClassPack.LogicPageClass;
import com.hybrid.project.BaseClass;

public class LoginTestClass extends BaseClass{
	
	
	BaseClass baseClassObj= new BaseClass();
	LogicPageClass loginPageObj = new LogicPageClass();
	
	
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
//		LogicPageClass loginPageObj = new LogicPageClass();
		String UName = loginPageObj.getUserName();
		String pass= loginPageObj.getPassword();
		
		loginPageObj.setUserName(UName);
		loginPageObj.setPassword(pass);
		loginPageObj.login();
	}

}

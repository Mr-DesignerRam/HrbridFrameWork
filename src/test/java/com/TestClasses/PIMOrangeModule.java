package com.TestClasses;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Util.Classes.Utility;
import com.hybrid.project.BaseClass;

public class PIMOrangeModule extends BaseClass {

	BaseClass baseclass = new BaseClass();
	
	@BeforeClass
	public void setup() {
	baseclass.launchWebsite();	
	
	
	
	}
	
	@AfterClass
	public void teardown() {
	//	driver.close();
	}
	
	@Test
	public void test() throws IOException {
		
		Utility.setImpicitWait(5);
		
		Utility.takeScreenshot("NewPIM");
				
	}
	

}

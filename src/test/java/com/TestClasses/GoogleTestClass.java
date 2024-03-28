package com.TestClasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PomClassPack.GooglePagePOM;
import com.Util.Classes.Utility;
import com.hybrid.project.BaseClass;

public class GoogleTestClass extends BaseClass {
	BaseClass baseclass = new BaseClass();

	@BeforeClass
	public void setup() {
		baseclass.launchWebsite();

	}

	@BeforeClass
	public void teardown() {
//		driver.close();

	}

	@Test
	public void searchSend() {
		GooglePagePOM pom = new GooglePagePOM();
		pom.googlevalueSend();
		
		Utility.setImpicitWait(5000);
		pom.getAllSuggestions();
	}

	
}

package com.Util.Classes;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.hybrid.project.BaseClass;

public class Utility extends BaseClass{

	public static void setText(String text,WebElement ele) {
		ele.sendKeys(text);
		
	}
	 
	public static void eleClick(WebElement ele) {
		ele.click();
		
	}
	public static void printValue(String str) {
		System.out.println(str);
		
	}
	
	public static void setImpicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	
		public static void takeScreenshot(String filename) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d= new Date();
		String date= d.toString().replace(":", "_"); //
		
		String des = ExcelReaderUtility.projectPath + "\\Screenshot\\"+filename+date+".png";
		File destiFile = new File(des);
		FileUtils.copyFile(src, destiFile);
	
		
		
	}
	
}
	


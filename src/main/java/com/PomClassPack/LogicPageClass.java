package com.PomClassPack;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Util.Classes.Utility;

import com.hybrid.project.BaseClass;

public class LogicPageClass extends BaseClass {

	public LogicPageClass() {
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath="//p[text()='Username : Admin']")
	private WebElement userNameId ;

	@FindBy(xpath="//p[text()='Password : admin123']")
	private WebElement passGet;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userName;
	
	

	@FindBy(xpath="//input[@name='password']")
	private WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement LogIn;

	@FindBy(xpath="//a[text()='OrangeHRM, Inc']")
	private WebElement linkClick;
	
	
	public String getUserName() {
		String original = userNameId.getText();
		String UName= original.substring(original.indexOf('A'));
		System.out.println(UName);
		return UName;
	}
	
	public String getPassword() {
		
		String original = passGet.getText();
		String pass= original.substring(original.lastIndexOf('a'));
		System.out.println(pass);
		return pass;
	}	
	
	
	
	public void setUserName(String UName) {
		
		Utility.setText(UName, userName); 
//		userName.sendKeys(UName);
		
	}
	public void setPassword(String pass) {
		
		Utility.setText(pass,password );
		
//		password.sendKeys(pass);
		
	}
	
	
	public void login() {
		
		Utility.eleClick(LogIn);
//		LogIn.click();
	}
	
	public void homePageLink() {
		
		Utility.eleClick(linkClick);
//		linkClick.click();
	}

}




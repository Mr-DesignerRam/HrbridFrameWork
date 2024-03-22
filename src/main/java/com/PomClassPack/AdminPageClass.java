package com.PomClassPack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hybrid.project.BaseClass;

public class AdminPageClass extends BaseClass{
	
	AdminPageClass(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement userRole;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement empName;
		
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement status;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement userName;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement password;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement confirmPass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveCLick;
	
	@FindBy(xpath="//button[text()=' Cancel ']")
	private WebElement cancelClick;
	
	@FindBy(xpath="//input[@placeholder=\"Search\"]")
	private WebElement search;
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement Admin;
	
	@FindBy(xpath="//button[@class='oxd-icon-button oxd-main-menu-button']")
	private WebElement arrowClick;

	
	
	
}

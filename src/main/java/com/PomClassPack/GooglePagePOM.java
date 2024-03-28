package com.PomClassPack;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Util.Classes.Utility;
import com.hybrid.project.BaseClass;

public class GooglePagePOM extends BaseClass {

	public GooglePagePOM() {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//ul[@class='G43f7e']//li")
	private List<WebElement>  suggestions;
	
	@FindBy(xpath="//textarea[@name='q']")
	private WebElement googleSearch;
	
	public void googlevalueSend() {
		Utility.setText("selenium", googleSearch); 
	}
	
	public void getAllSuggestions() {
		System.out.println(suggestions);
	}

	
}

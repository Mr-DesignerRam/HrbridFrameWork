package com.PomClassPack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Util.Classes.Utility;

public class PIMModulePOM {

	
		
		
		// Employee Name (//input[@placeholder='Type for hints...'])[1]
		@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")
		private WebElement emp_Name;
		
		// Supervisior Name 
		@FindBy(xpath="(//input[@placeholder='Type for hints...'])[2]")
		private WebElement sup_Name;
		
		// emp id (//input[@class='oxd-input oxd-input--active'])[2]
		@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
		private WebElement emp_Id; 
		
		// emp details (//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]
		@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
		private WebElement emp_Details;
		
		//include (//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]
		@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
		private WebElement include;
		
		// job title (//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]
		@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]")
		private WebElement job_Title;

		
		// Sub Unit 
		@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]")
		private WebElement Sub_Unit;

		
		// search //button[@type='submit']
		@FindBy(xpath="//button[@type='submit']")
		private WebElement search_Button;

		
		// reset  button[@type='reset']
		@FindBy(xpath="button[@type='reset']")
		private WebElement reset_Button;

		
		public void empName() {
			Utility.setText("Ravi M D", emp_Name);
		}
		
		public void supName() {
			Utility.setText("Prakash", sup_Name);
		}
		
		public void sendEmp_Id(){
			Utility.setText("121", emp_Id);
		}		
		
		public void click_Search() {
			Utility.eleClick(search_Button);
		}
		
		public void click_Reset() {
			Utility.eleClick(reset_Button);
		}
		
		 
		
	

}

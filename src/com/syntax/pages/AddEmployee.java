package com.syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class AddEmployee {
	
	@FindBy(id="firstName")
	public WebElement firstName;
	 
	@FindBy(id="lastName")
	public WebElement lastName;

	@FindBy(id="employeeId")
	public WebElement empId;
	
	@FindBy(id="photofile")
	public WebElement photo;
	
	@FindBy(id="btnSave")
	public WebElement save;
	
	public AddEmployee() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
}




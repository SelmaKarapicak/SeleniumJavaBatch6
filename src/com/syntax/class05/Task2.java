package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

//TC 2: Select and Deselect values
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Input Forms” links
//Click on “Select Dropdown List” links
//Select value from “Select List Demo” section
//Verify value has been selected
//Select 4 options from “Multi Select List Demo”
//Deselect 1 of the option from the dd
//Quit browser

public class Task2 extends BaseClass{

	public static void main(String[] args) {
		
		setUp();
		
		WebElement inputForm=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		inputForm.click();
		WebElement dropDown=driver.findElement(By.xpath("//a[@href='basic-select-dropdown-demo.html']"));
		dropDown.click();
		wait(2);
		WebElement selectList=driver.findElement(By.xpath("//select[@class='form-control']"));
		selectList.click();
		Select select=new Select(selectList);
		List<WebElement> day=select.getOptions();
		for(WebElement days:day) {
			String text=days.getText();
			
			if(text.contentEquals("Wednesday")) {
				select.selectByValue("Wednesday");
				if(days.isSelected()) {
					System.out.println("Wednesday is selected");
				}
			}
		}
		
		WebElement multiSelect=driver.findElement(By.xpath("//select[@name='States']"));
		multiSelect.click();
		Select select2=new Select(multiSelect);
		select2.selectByIndex(0);
		select2.selectByIndex(1);
		select2.selectByIndex(3);
		wait(2);
		select2.deselectByIndex(3);
		
		
		

	}

}

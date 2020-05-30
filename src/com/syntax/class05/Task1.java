package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

//TC 1: Amazon Department List Verification
//Open chrome browser
//Go to “http://amazon.com/”
//Verify how many department options available.
//Print each department 
//Select Computers
//Quit browser

public class Task1 extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		WebElement category=driver.findElement(By.id("searchDropdownBox"));
		category.click();
		
		Select select=new Select(category);
		List<WebElement> options=select.getOptions();
		int size=options.size();
		System.out.println("Department size is "+size);
		for(WebElement option:options) {
			String text=option.getText();
			System.out.println("Department options: "+text);
			wait(2);
			select.selectByValue("search-alias=computers");
			
			if(text.contentEquals("Computers")) {
				option.click();
		
				if(option.isSelected()) {
					System.out.println("Test Case Successful ");
				}else {
					System.out.println("Test Case is failed");
				}
			}
			
			
		}
		
		
		
		
		
		driver.quit();
		
		
		

	}

}

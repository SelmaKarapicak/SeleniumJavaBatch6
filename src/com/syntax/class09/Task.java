package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

//TC 1: Table headers and rows verification
//Open chrome browser
//Go to “https://www.aa.com/homePage.do”
//Enter From and To
//Select departure as May 14 of 2020
//Select arrival as November 8 of 2020
//Click on search
//Close browser

public class Task extends CommonMethods{

	public static void main(String[] args) {
		setUp();
		
	   driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		wait(3);
		String monthText=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']")).getText();
		while(!monthText.equals("July 2020")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			wait(2);
			monthText=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']")).getText();
		}
		
		List<WebElement>cells=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td"));
		for (WebElement cell : cells) {
			String allCell=cell.getText();
			if(allCell.equals("18")) {
				cell.click();
				wait(2);
				break;
			}
		}
		driver.findElement(By.xpath("//input[@id='aa-returningFrom']")).click();
		wait(3);
		String returndate=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']")).getText();
		while(!returndate.equals("November 2020")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			wait(3);
		  returndate= driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']")).getText();
		}
		
		List<WebElement>returnCell=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td"));
		for (WebElement returnDate : returnCell) {
			String returnText=returnDate.getText();
			if(returnText.equals("8")) {
				returnDate.click();
				wait(2);
				break;	
			}
		}
		
		driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']")).click();
		
		

	}

}

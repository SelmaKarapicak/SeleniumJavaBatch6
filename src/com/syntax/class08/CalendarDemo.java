package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class CalendarDemo extends CommonMethods {
	
	public static void main(String[] args) {
		
		setUp();
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Leave List")).click();
		
		//step 1: click on calendar
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		
		//step2: get all cells
		List<WebElement>cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement cell : cells) {
			if(cell.getText().equals("16")) {
				cell.click();
				break;
			}
			
		}
		
		wait(3);
		//driver.quit();
	}
	
	
	

}

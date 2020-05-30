package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class DeltaCalendarDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		//click on the depart/to calendar
		driver.findElement(By.xpath("//span[@id='calDepartLabelCont']")).click();
		
		String dMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		while(!dMonth.equals("August")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			wait(2);
			dMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}
		
		//loop through td and grab the text
		List<WebElement> cells=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));
		
		for (WebElement cell : cells) {
			String cellText=cell.getText();
			if(cellText.equals("15")) {
				cell.click();
				break;
			}
		}
		
		//grab the text of return month and check if it equals to October
		
		String returnMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();
		while(!returnMonth.equals("October")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			wait(2);
			returnMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();	
		}
		
		List<WebElement> departCells = driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));
		// loop through td of depart calendar and grab the text and validate
		for (WebElement departCell : departCells) {
			String departText=departCell.getText();
			if(departText.equals("15")) {
				departCell.click();
				break;
			}
		}
		
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@value='done']")).click();
				Thread.sleep(5000);
				tearDown();
		

	}

}

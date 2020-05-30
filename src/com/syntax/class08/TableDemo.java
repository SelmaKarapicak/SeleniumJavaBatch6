package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.CommonMethods;

public class TableDemo extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		
		//find how many rows of data table has
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		System.out.println("Number of rows in the table is= "+rows.size());
		
		System.out.println("=====Printing row data======");
		
		for (WebElement row : rows) {
			String allrow=row.getText();
			System.out.println(allrow);
		}
		
		//Number of columns
		List<WebElement> columns=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		System.out.println("Number of columns in the table is "+columns.size());
		System.out.println("=======Printing columns headers --------------");
		
		for (WebElement cols : columns) {
			String header=cols.getText();
			System.out.println(header);
		}
}
}
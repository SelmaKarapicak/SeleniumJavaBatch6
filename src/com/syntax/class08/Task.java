package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class Task extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		System.out.println("Number of Rows: "+rows.size());
		System.out.println("====ROWS===");
		for (WebElement row : rows) {
			String allRow=row.getText();
			System.out.println(allRow);
		}
		
		List<WebElement> columns=driver.findElements(By.xpath("//table[@class='table']/thead[2]/tr/th"));
		System.out.println("Number of cols: "+columns.size());
		System.out.println("===COLS===");
		for (WebElement cols : columns) {
			String col=cols.getText();
			System.out.println(col);
		}
		
		System.out.println("===PRINTING DATA CELL BY CELL USING ADVANCED FOR LOOP=====");
		
		List<WebElement> cells=driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td"));
		for (WebElement cell : cells) {
			String celldata=cell.getText();
			System.out.println(celldata);
		}
		
		System.out.println("===PRINTING DATA CELL BY CELL USING FOR LOOP=====");
		
		for(int i=1; i<rows.size(); i++) { //controlling rows
			for(int y=1; y<columns.size(); y++) { //controlling cols
				String cellText=driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]/td["+y+"]")).getText();
				System.out.println(cellText);
			}
		}

	}

}

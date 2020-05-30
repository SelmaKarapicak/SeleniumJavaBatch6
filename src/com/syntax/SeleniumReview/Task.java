package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

//Go to amazon.com
//* select books from the search dropdown
//* type Harry potter
//* and click on Search
//* check Unofficial CookBook checkbox on the left under Book Series

public class Task extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement search=driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']"));
		Select select=new Select(search);
		List<WebElement>books=select.getOptions();
		for(WebElement book:books) {
			String text=book.getText();
			
			if(text.contentEquals("Books")) {
				book.click();
			}
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		driver.findElement(By.xpath("//input[@class='nav-input']")).click();
		
		List<WebElement> bookSeriesCheckboxes = driver.findElements(By.className("a-spacing-micro"));
		for(WebElement bookSeriesCheckbox: bookSeriesCheckboxes) {
			String checkboxText = bookSeriesCheckbox.getText();
			
			if(!bookSeriesCheckbox.isSelected() && checkboxText.equals("Unofficial Cookbook")) {
				Thread.sleep(2000);
				bookSeriesCheckbox.click();
				break;
			}
		}		
		
		
		
		
		

	}

}

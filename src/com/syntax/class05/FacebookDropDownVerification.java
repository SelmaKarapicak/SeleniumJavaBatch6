package com.syntax.class05;

import java.util.List;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

//Open chrome browser
//Go to “https://www.facebook.com”
//Verify:
//month dd has 12 month options
//day dd has 31 day options
//year dd has 115 year options
//Select your date of birth	
//Quit browse

public class FacebookDropDownVerification extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		WebElement month=driver.findElement(By.id("month"));
		Select select=new Select(month);
		
		List<WebElement> listM=select.getOptions();
		
		for(WebElement m:listM) {
			
			String text=m.getText();
			System.out.println(text);
			
			if(text.equals("Jun")) {
				m.click();
	     	}	
		}
		
		WebElement day=driver.findElement(By.id("day"));
		Select select2=new Select(day);
		
		List<WebElement> listd=select2.getOptions();
		
		for(WebElement d:listd) {
			
			String text2=d.getText();
			System.out.println(text2);
			
			if(text2.equals("7")) {
				d.click();
	     	}	
		}
		
		WebElement year=driver.findElement(By.id("year"));
		Select select3=new Select(year);
		
		List<WebElement> listy=select3.getOptions();
		
		for(WebElement y:listy) {
			
			String text3=y.getText();
			System.out.println(text3);
			
			if(text3.equals("1991")) {
				y.click();
	     	}	
		}
		
		
		
		
		
	}

}

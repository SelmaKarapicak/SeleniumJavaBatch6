package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask {
//	
//	TC 1: Amazon link count: 
//		Open chrome browser
//		Go to “https://www.amazon.com/”
//		Get all links
//		Get number of links that has text
//		Print to console only the links that has text
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		List <WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Size: "+allLinks.size());
		
		int count=0;
		
		for (WebElement webElement : allLinks) {
			String text=webElement.getText();
			if(!text.isEmpty()) {
				System.out.println(text);
				count++;
			}
		}
		System.out.println("Number of links with text: " +count);
		driver.quit();
	}

}

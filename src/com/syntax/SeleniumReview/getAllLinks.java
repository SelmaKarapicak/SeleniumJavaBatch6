package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class getAllLinks extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		int numOfLinks=allLinks.size();
		System.out.println(numOfLinks);
		
		for(WebElement link:allLinks) {
			String text=link.getText();  //linklerin isimlerini cikariyor
			String links=link.getAttribute("href"); // retrieve urls linkleride aliyor
			System.out.println(text+" "+links);
		}

	}

}

package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 1: Amazon Page Title Verification: 
//Open chrome browser
//Go to “https://www.amazon.com/”
//Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed

public class AmazonPageTitleVerifaction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		String actualUrl=driver.getCurrentUrl();	
		String expectedUrl="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		if(actualUrl.equalsIgnoreCase(expectedUrl)) {
			String title=driver.getTitle();
		}else {
			System.out.println("Wrong url entered");
		}
	
		

	}

}

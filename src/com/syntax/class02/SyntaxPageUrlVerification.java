package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 2: Syntax Page URL Verification: 
//Open chrome browser
//Navigate to “https://www.zillow.com/”
//Navigate to “https://www.google.com/”
//Navigate back to Zillow Page
//Refresh current page
//Verify url contains “Zillow”

public class SyntaxPageUrlVerification {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.zillow.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		
		String actual=driver.getCurrentUrl();
		if(actual.contains("Zillow")) {
			System.out.println("Url contains Zillow");
		}else {
			System.out.println("Wrong url entered");
		}

	}

}

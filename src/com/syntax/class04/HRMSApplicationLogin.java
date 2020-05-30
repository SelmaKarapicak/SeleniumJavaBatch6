package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 1: HRMS Application Login: 
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//Enter valid username and password
//Click on login button
//Then verify Syntax Logo is displayed.

public class HRMSApplicationLogin {

	public static void main(String[] args) {
		
		String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.cssSelector("#txtPassword"));
		password.sendKeys("Hum@nhrm123");
	
	    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		
		WebElement isDisplayed=driver.findElement(By.xpath("//a[@target='_blank']//img"));
		
		if(isDisplayed.isDisplayed()) {
			System.out.println("Logo is displayed, Test Case passed");
		}else {
			System.out.println("Logo is not displayed, Test Case failed");
		}

	}

}

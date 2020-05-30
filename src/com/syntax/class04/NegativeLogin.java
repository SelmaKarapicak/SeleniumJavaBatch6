package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 2: HRMS Application Negative Login: 
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//Enter valid username
//Leave password field empty
//Verify error message with text “Password cannot be empty” is displayed.

public class NegativeLogin {

	public static void main(String[] args) {
		
		String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		WebElement error=driver.findElement(By.xpath("//span[@id='spanMessage']"));
		
		if(error.isDisplayed()) {
			System.out.println("Password cannot be empty");
		}
		
		
		

	}

}

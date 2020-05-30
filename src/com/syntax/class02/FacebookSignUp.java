package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 1: Facebook sign up: 
//Open chrome browser
//Go to “https://www.facebook.com/”
//Enter first name
//Enter last name
//Enter mobile number
//Click on sign up button

public class FacebookSignUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("firstname")).sendKeys("Selma");
		driver.findElement(By.name("lastname")).sendKeys("Karapicak");
		driver.findElement(By.id("u_0_r")).sendKeys("4849765634");
		
		driver.findElement(By.name("websubmit")).click();
		

	}

}

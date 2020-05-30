package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	
		public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";
		
		public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'panel')]")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Log')]")).click();
		Thread.sleep(2000);
		// a[contains(@class'Text')]
		// a[ends-with(@class'Text')]
		//input[@class='formInputText'and]
		
		
		
		
		
		

	}

}

package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TourRegistration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
		
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.cssSelector("//input[@name='firstName']")).sendKeys("Selma");
		driver.findElement(By.cssSelector("//input[@name='lastName']")).sendKeys("Kara");
		driver.findElement(By.cssSelector("//input[@name='phone']")).sendKeys("4845697815");
		driver.findElement(By.cssSelector("//input[@id='userName']")).sendKeys("selma@gmail.com");
		driver.findElement(By.cssSelector("//input[@name='address1']")).sendKeys("Sunset Bluff Dr");
		driver.findElement(By.cssSelector("//input[@name='city']")).sendKeys("Jacksonville");
		driver.findElement(By.cssSelector("//input[@name='state']")).sendKeys("FL");
		driver.findElement(By.cssSelector("//input[@name='postalCode']")).sendKeys("32216");
		driver.findElement(By.cssSelector("//select[@name='country']")).sendKeys("UNITED STATES");
		driver.findElement(By.cssSelector("//input[@id='email']")).sendKeys("selmak");
		driver.findElement(By.cssSelector("//input[@name='password']")).sendKeys("123456789");
		driver.findElement(By.cssSelector("//input[@name='confirmPassword']")).sendKeys("123456789");
		driver.findElement(By.cssSelector("//input[@name='register']")).click();
		
		

	}

}

package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryToursRegistration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("Register here")).click(); //tiklamali butonlari linktextle yapiyoruz
		
		driver.findElement(By.name("firstName")).sendKeys("Selma");
		driver.findElement(By.name("lastName")).sendKeys("Karapicak");
		driver.findElement(By.name("phone")).sendKeys("4849563452");
		driver.findElement(By.id("userName")).sendKeys("selma@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Sunset Bluff dr");
		driver.findElement(By.name("city")).sendKeys("Jacksonville");
		driver.findElement(By.name("state")).sendKeys("Florida");
		driver.findElement(By.name("postalCode")).sendKeys("32216");
		driver.findElement(By.name("country")).sendKeys("United States");
		
	}

}

package com.syntax.class08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class WaitDemo extends BaseClass{

	public static void main(String[] args) {
		
		setUp();
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.cssSelector("div#checkbox")).click();
		driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
		
		

	}

}

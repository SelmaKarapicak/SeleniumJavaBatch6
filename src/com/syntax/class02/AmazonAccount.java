package com.syntax.class02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonAccount {
//	//Store configuration in property file to create an Amazon account:
//     browser
//	    url
//		name
//		email
//		password

	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\karap\\eclipse-workspace\\JavaBasics1\\configs\\Amazon.properties";
		
		FileInputStream fis=new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		WebDriver driver=null;
		
		if(browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}else {
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			 driver=new FirefoxDriver();		
		}
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/span[1]")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.name("customerName")).sendKeys(prop.getProperty("name"));
		driver.findElement(By.id("ap_email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.name("passwordCheck")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		

	}

}

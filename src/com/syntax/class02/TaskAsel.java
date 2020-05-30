package com.syntax.class02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskAsel {
	
	    ////CREATE A PROPERTY FILE TO STORE following configurations:
		//browser=
		//url=
		//username=
		//password=
		//
		//In your Selenum code use values from properties file to open specifified browser, navigate to specified url and enter username and password


			public static void main(String[] args) throws IOException {
				
				String filePath="C:\\Users\\karap\\eclipse-workspace\\JavaBasics1\\configs\\homework.properties";
				
		        FileInputStream fStream=new FileInputStream(filePath);
				
				Properties prop=new Properties();
				prop.load(fStream);
				
				System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get(prop.getProperty("url"));
				
				driver.findElement(By.id("email")).sendKeys("Selma");
				
				
	}
		}



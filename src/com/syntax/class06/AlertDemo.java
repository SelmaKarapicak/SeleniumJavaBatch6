package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class AlertDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
			setUp();  //Below code is our UItestPractice.com
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//button[@id='alert']")).click();
			
			//handling simple alert/PopUps
			Alert simpleAlert=driver.switchTo().alert();
	 
			String simpleAText=simpleAlert.getText();
			System.out.println("This is a simple alert text: "+simpleAText);
			simpleAlert.accept();  //able to handle the alert
			
			//Handling confirmation Alert
			driver.findElement(By.id("confirm")).click();
			Alert confirmAlert = driver.switchTo().alert();
			Thread.sleep(1000);
			String confirmAText=confirmAlert.getText();
			System.out.println("This is confirm alert text: "+confirmAText);
			Thread.sleep(1000);
			confirmAlert.dismiss();
			
			//Handling Prompt alerts/confirmation alerts by providing some confirmation message
			String name="Alex";
			driver.findElement(By.id("prompt")).click();
			Alert promptAlert=driver.switchTo().alert();
			System.out.println("This is prompt alert text: "+promptAlert.getText());
			promptAlert.sendKeys(name);
			promptAlert.accept();
			String text=driver.findElement(By.xpath("//div[@id='demo']")).getText();
			System.out.println("Text added to alert box: "+text);
			
			
			if(text.contains(name)) {
				System.out.println("Text was succesfully added");
			}else {
				System.err.println("Text was not entered");
			}
			
			
			
			
			
			
			
			
			BaseClass.tearDown();

	}

}

package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

//TC 1: JavaScript alert text verification
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Alerts & Modals” links
//Click on “Javascript Alerts” links
//Click on button in “Java Script Alert Box” section
//Verify alert box with text “I am an alert box!” is present
//Click on button in “Java Script Confirm Box” section
//Verify alert box with text “Press a button!” is present
//Click on button in “Java Script Alert Box” section
//Enter text in the alert box
//Quit browser

public class TC1 extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		WebElement alertsModals=driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Alerts & Modals')]"));
		alertsModals.click();
		WebElement javaScript=driver.findElement(By.xpath("//a[@href='javascript-alert-box-demo.html']"));
		javaScript.click();
		wait(2);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		wait(2);
		System.out.println("Alert text is: "+text);
		alert.accept();
		wait(2);
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]")).click();
		Alert alert2=driver.switchTo().alert();
		wait(2);
		String confirmText=alert2.getText();
		System.out.println("Confirm text is displayed:"+confirmText);
			alert2.accept();
			
			wait(3);
			String name="Selma";
			driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
			Alert pAlert=driver.switchTo().alert();
			wait(2);
			String promptText=pAlert.getText();
			System.out.println("Prompt text is: "+promptText);
			pAlert.sendKeys(name);
			pAlert.accept();
			wait(2);
			
			String textp=driver.findElement(By.id("prompt-demo")).getText();
			System.out.println("Text added to alert box: "+textp);
			
			
			
			
		
		

	}

}

package com.syntax.SeleniumReview;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.CommonMethods;

public class HandlingAlerts extends CommonMethods{

	public static void main(String[] args) {
	
		setUp();
		
		WebElement alertButton=driver.findElement(By.id("alert"));
		alertButton.click();
		wait(2);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement timingAlertButton=driver.findElement(By.xpath("//button[text()='Timing Alert']"));
		timingAlertButton.click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.alertIsPresent());
		
		

	}

}

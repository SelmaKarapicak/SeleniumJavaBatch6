package com.syntax.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class FacebookSignUp extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
	
		setUp();
		
		WebElement username=driver.findElement(By.name("firstname"));
		sendText(username, "Selma");
		
		WebElement lastname=driver.findElement(By.name("lastname"));
		sendText(lastname, "Kara");
	
		WebElement email=driver.findElement(By.name("reg_email__"));
		sendText(email,"selma@gmail.com");
		
		WebElement confirmation=driver.findElement(By.name("reg_email_confirmation__"));
		sendText(confirmation,"selma@gmail.com");
		
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		sendText(password,"12345678");
		wait(2);
		
		WebElement monthDD=driver.findElement(By.id("month"));
		selectDdValue(monthDD,"Jun");
	
		WebElement day=driver.findElement(By.id("day"));
		selectDdValue(day,7);
		
		WebElement year=driver.findElement(By.id("year"));
		selectDdValue(year,"1991");
		
		List<WebElement> radioB=driver.findElements(By.xpath("//input[@value='1']"));
		clickRadioOrCheckBox(radioB,"1");
		
		driver.findElement(By.name("websubmit")).click();
		
	
		
		Thread.sleep(1000);
		//tearDown();
		

	}

}

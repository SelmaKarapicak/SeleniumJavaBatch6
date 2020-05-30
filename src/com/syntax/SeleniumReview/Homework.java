package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

//Go to facebook.com
//Verify “Create a new account” is Displayed
//Fill out First name, lastname, email, new password
//Select your birthday from given dropdowns
//Select gender
//Click sign up

public class Homework extends BaseClass {

	public static void main(String[] args) {
		setUp();
		
		driver.findElement(By.id("email")).sendKeys("Selma");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		wait(3);
		
		WebElement account=driver.findElement(By.linkText("Create New Account"));
		account.click();
		//System.out.println("It is displayed "+account.isDisplayed());
		wait(2);
		
		driver.findElement(By.id("u_0_n")).sendKeys("Selma");
		driver.findElement(By.name("lastname")).sendKeys("Kara");
		driver.findElement(By.name("reg_email__")).sendKeys("selma@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("selma@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("ssssssss");
		
		WebElement months=driver.findElement(By.xpath("//select[@id='month']"));
		Select select=new Select(months);
		select.selectByIndex(6);
		
		WebElement days=driver.findElement(By.id("day"));
		Select select2=new Select(days);
		select2.selectByIndex(7);
		
		WebElement years=driver.findElement(By.id("year"));
		Select select3=new Select(years);
		select3.selectByValue("1991");
		
		driver.findElement(By.id("u_0_6")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
		
		

	}

}

package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

//Automate following user stories:
//US 89647: User should be able to login using valid credentials
//US 89876: As an admin user should be able to add an employee

public class HMW2 extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		sendText(username,"Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		sendText(password,"Hum@nhrm123");
		
		WebElement submit=driver.findElement(By.name("Submit"));
		waitForClickability(submit);
		submit.click();
		
		WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
		waitForClickability(pim);
		pim.click();
		
		WebElement list=driver.findElement(By.id("menu_pim_viewEmployeeList"));
		waitForClickability(list);
		list.click();
		
		WebElement add=driver.findElement(By.name("btnAdd"));
		waitForClickability(add);
		add.click();
		
		WebElement firstname=driver.findElement(By.name("firstName"));
		sendText(firstname,"Selma");
		
		WebElement lastname=driver.findElement(By.name("lastName"));
		sendText(lastname,"Kara");
		
		WebElement id=driver.findElement(By.name("employeeId"));
		sendText(id,"US 89765");
		
//		WebElement check=driver.findElement(By.name("chkLogin"));
//		check.click();
		
		WebElement save=driver.findElement(By.id("btnSave"));
		save.click();
		
		
		
		
		
		
		
	}

}

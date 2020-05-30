package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

//TC 2: Delete Employee
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//Login into the application
//Add Employee
//Verify Employee has been added
//Go to Employee List
//Delete added Employee
//Quit the browser

public class Hmw2 extends CommonMethods {

	public static void main(String[] args) {
		setUp();
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		sendText(username,"Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		sendText(password,"Hum@nhrm123");
		
		WebElement login=driver.findElement(By.id("btnLogin"));
		waitForClickability(login);
		login.click();
		
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		wait(2);
		WebElement firstname=driver.findElement(By.name("firstName"));
		sendText(firstname,"Selma");
		
		WebElement lastname=driver.findElement(By.name("lastName"));
		sendText(lastname,"Kara");
		wait(2);
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		wait(2);
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		for(int i=1; i<rows.size(); i++) {
			wait(2);
			String rowText=rows.get(i-1).getText();
			
			if(rowText.contains("Selma Kara")) {
				System.out.println("Selma Kara is added to the employee list");
			}
		
			wait(2);
		driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+ i +"]/td[1]")).click();
		driver.findElement(By.id("btnDelete")).click();
		
		wait(2);
		driver.quit();
		
		
		}
	}

}

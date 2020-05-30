package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.CommonMethods;

public class ActionClassDemo extends CommonMethods{
	
	//navigate to HRMS application
	//enter iud and pwd
	//click on login using mouse

	public static void main(String[] args) {
		setUp();
		
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
		
		//to perform mouse or keyboard operation we need to have an object of the Actions class
		Actions act=new Actions(driver);
		//identify an element on which to perform mouse click
		WebElement loginBtn=driver.findElement(By.cssSelector("input#btnLogin"));
		//clicking on the mouse and to complete the action we need to call perform();
		//do right click
		act.moveToElement(loginBtn).contextClick().perform();
		act.moveToElement(loginBtn).click().perform();
		//to perform double click
		act.moveToElement(loginBtn).doubleClick().perform();
		//hover over the element
		WebElement pimLink=driver.findElement(By.linkText("PIM"));
		act.moveToElement(pimLink).perform();
		//click on the Add Employee link using actions class
		WebElement addEmp=driver.findElement(By.linkText("Add Employee"));
		act.click(addEmp).perform();
		//act.keyUp(Keys.SHIFT).sendKeys("hello"); ---> if you perform this on txt box it will hold shift key and type hello in upper case
		
		//act.dragAndDrop(source, target)
		
		
		
		
		wait(5);
		driver.quit();
		
		

	}

}

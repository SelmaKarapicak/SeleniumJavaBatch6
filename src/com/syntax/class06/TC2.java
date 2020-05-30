package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

//TC 2: Syntax Frame verification
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Others” link
//Click on “Iframe” link
//Click on the “Home” link inside the first frame
//Verify “Syntax logo” is displayed in second frame
//Quit browser

public class TC2 extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		WebElement others=driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Others')]"));
		others.click();
		WebElement iframe=driver.findElement(By.xpath("//a[@href='bootstrap-iframe.html']"));
		iframe.click();
		
		driver.switchTo().frame("FrameOne");
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("FrameTwo");
		wait(2);
		WebElement logo=driver.findElement(By.xpath("//img[@class='custom-logo']"));
		if(logo.isDisplayed()) {
			System.out.println("Logo is displayed");
		}else {
			System.err.println("Logo is not displayed");
		}
		wait(2);
		driver.switchTo().defaultContent();
		
		//driver.quit();
		
		
		

	}

}

package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class SimpleWindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		
		String signUpTitle=driver.getTitle();
		System.out.println("Main page Title is: "+signUpTitle);
		
		driver.findElement(By.linkText("Help")).click();
		
		/*how to get window handles?
		 * In selenium we have 2 methods to get the hand of window
		 * getWindowHandle();
		 * getWindowHandles();
		 */
		
		Set<String> allWindowHandles=driver.getWindowHandles(); //returns set of string IDs of all windows currently opened by current instance
		System.out.println("Number of windows opened are: "+allWindowHandles.size()); //get size of set
		
		Iterator<String>it=allWindowHandles.iterator();
		String mainWindowHandle=it.next(); //returns the id of mine window
		System.out.println("Id of main Window: "+mainWindowHandle);
		
		String childWindowHandle=it.next();  //returns the id of Child Window
		System.out.println("Id of child window: "+childWindowHandle);
		
		driver.switchTo().window(childWindowHandle);
		String childWindowTitle=driver.getTitle();
		System.out.println("Child Window Title is: "+childWindowTitle);
		

	}

}

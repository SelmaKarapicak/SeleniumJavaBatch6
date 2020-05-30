package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 3: Syntax Demo input boxes count: 
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Input Forms” links
//Click on “Simple Form Demo” links
//Get all input boxes from the page
//Enter “Hello” to each text box
//Close browser

public class BoxesCount {

	public static void main(String[] args) {
		
		String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//li[@class='tree-branch']//a[contains(text(),'Input Forms')]")).click();
		driver.findElement(By.xpath("//li[@class='tree-branch']//ul//li//a[contains(text(),'Simple Form Demo')]")).click();
		
		List<WebElement> allLinks=driver.findElements(By.cssSelector("input[type='text']"));
		
		for(WebElement all:allLinks) {
			all.sendKeys("Hello");
		}
		

	}

}

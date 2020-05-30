package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 4: Radio Buttons Practice  
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Input Forms” links
//Click on “Radio Buttons Demo” links
//Click on any radio button in “Radio Button Demo” section.
//Verify correct radio is clicked
//Click on any radio button in “Group Radio Buttons Demo” section.
//Verify correct checkbox is clicked
//Quit browser

public class RadioButtonsPractice {

	public static void main(String[] args) throws InterruptedException {
	
		String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//li[@class='tree-branch']//a[contains(text(),'Input Forms')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='tree-branch']//ul//li//a[contains(text(),'Radio Buttons Demo')]")).click();
		Thread.sleep(2000);
		WebElement button=driver.findElement(By.xpath("//input[@value='Male']"));
		button.click();
		System.out.println("Radio button is selected "+button.isSelected());
		
		Thread.sleep(2000);
		WebElement button2=driver.findElement(By.xpath("//input[@type='radio']"));
		button2.click();
		System.out.println("Radio button2 is selected "+button2.isSelected());
		
		
		
		
		
		

	}

}

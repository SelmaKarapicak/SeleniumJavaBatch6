package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//TC 2: Opening Page on Firefox Browser
//Open Firefox browser
//Navigate to “https://www.redfin.com/”
//Verify that you have navigated to (https://www.redfin.com/)
//End the Session (close the browser).

public class OpeningPageonFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.Firefox.com");
		driver.navigate().to("https://www.redfin.com/");
		driver.navigate().back();
		
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.redfin.com/";
		
		if(actualUrl.equalsIgnoreCase(expectedUrl)) {
			String title=driver.getTitle();
		}else {
			System.out.println("Wrong url entered");
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		

	}

}

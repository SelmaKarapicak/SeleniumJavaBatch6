package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.BaseClass;

public class SyntaxPracticeSiteFrameDemo extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		driver.switchTo().frame("FrameOne");
		boolean logIsDis=driver.findElement(By.id("hide")).isDisplayed();
		System.out.println("Logo inside frame is displayed: "+logIsDis);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("FrameTwo");
		boolean enrolBtnIsEnabled=driver.findElement(By.className("enroll-btn")).isEnabled();
		System.out.println("Enroll button inside frame two is enabled: "+enrolBtnIsEnabled);
		
		tearDown();

	}

}

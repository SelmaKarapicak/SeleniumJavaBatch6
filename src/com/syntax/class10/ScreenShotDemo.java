package com.syntax.class10;
//verify user is able to login with valid credentials
//

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.utils.CommonMethods;

public class ScreenShotDemo extends CommonMethods {

	public static void main(String[] args){
		setUp();
		//login
		String username="Admin";
		String password="Hum@nhrm123";
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		//validation that admin is logged in
		
		String welcomeText=driver.findElement(By.id("welcome")).getText();
		if(welcomeText.contains(username)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File("screenshot/HRMS/AdminLogin.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		driver.quit();

	}

}

package com.syntax.class07;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class FrameRecap extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		boolean isHomeDis=driver.findElement(By.xpath("//a[@href='./index.html']")).isDisplayed();
		System.out.println(isHomeDis);
		
	}

}

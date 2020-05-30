package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class HMW extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
		sendText(username,"Tester");
		WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
		sendText(password,"test");
		WebElement login=driver.findElement(By.id("ctl00_MainContent_login_button"));
		waitForClickability(login);
		login.click();
		
		String expectedValue="Susan McLaren";
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		for (WebElement row : rows) {
			if(row.getText().contains(expectedValue)) {
				System.out.println("Susan McLaren is present in the table");
			}
		}
		
		driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[13]")).click();
		
		String updatename="Susan Castle";
		String cardNo="1234567890";
		
		WebElement update=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
		sendText(update,"Susan Castle");
		
		WebElement updateCard=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
		sendText(updateCard,"1234567890");
		
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
		
		List<WebElement>updateRows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		for (WebElement uprow : updateRows) {
			String uptext=uprow.getText();
			if(uptext.contains(updatename)&& uptext.contains(cardNo)) {
				System.out.println("LastName and CardNumber is Updated");
			}else {
				System.err.println("Test failed");
			}
		}
		

	}

}

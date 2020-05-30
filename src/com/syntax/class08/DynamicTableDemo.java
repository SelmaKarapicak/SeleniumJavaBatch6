package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

/*navigate to the web orders
 * login into WebOrders
 * click checkbox next to Bob Feather
 */
public class DynamicTableDemo extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		String expectedValue="Bob Feather";
		
			List<WebElement>rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tbody/tr"));
			for(int i=1; i<rows.size(); i++) {
				String rowText=rows.get(i-1).getText();
				//System.out.println(rowText);
				if(rowText.contains(expectedValue)) {
					driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[1]")).click();
				}
			}
			wait(4);
			driver.quit();	
				
		
	}

	}



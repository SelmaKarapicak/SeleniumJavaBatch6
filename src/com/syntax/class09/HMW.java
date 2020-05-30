package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class HMW {

		public static void main(String[] args) throws InterruptedException {
	        // open chrome browser
	        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
	        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.aa.com/homePage.do");
//	      driver.manage().
	        //enter inputs from - to boxes
	        driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear(); //sendKeys("AID");//.sendKeys("AID", Keys.ADD)
	        driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("AID");
	        driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).clear();
	        driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys("JFK");      
	        //click on the calendar and select month and year
	        driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).click();
	        
	        //String dayOfMonth = driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]/div")).getText();
	        
	        boolean flag = false;
	        while(!flag) {//flag will always be true
	            String dayOfMonth = driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]/div")).getText();
	            if(dayOfMonth.equals("July 2020")) { 
	                //logic - loop thru //div[contains(@class,'ui-corner-left')]/following-sibling::table/tbody/tr/td --> this one gives the first cell
	                // //div[contains(@class,'ui-corner-left')]/following-sibling::table
	                List<WebElement> depCells = driver.findElements(By.xpath("//div[contains(@class,'ui-corner-left')]/following-sibling::table/tbody/tr/td"));
	                for (WebElement cell : depCells) {
	                    String cellText=cell.getText();
	                    if(cellText.equals("14")) {
	                        cell.click();
	                        flag=true;//it will never go back
	                        break;
	                    }
	                }
	                
	            }else {
	                //logic  click on the next symbol "  >  " 
	                driver.findElement(By.xpath("//a[@title='Next']"));
	            }
	        }
	        
	        
	        flag = false;
	        //going back with symbol  " < " 
	        while(!flag) {
	            String rMonth = driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]/div")).getText();
	            if(rMonth.equals("November 2020")) {
	                List<WebElement> returnCells = driver.findElements(By.xpath("//div[contains(@class,'ui-corner-left')]/following-sibling::table/tbody/tr/td"));
	                for (WebElement returnCell : returnCells) {
	                    String returnText = returnCell.getText();
	                    if(returnText.equals("8")) {
	                        returnCell.click();
	                        flag=true;
	                        break;
	                    }
	                }
	            }else {
	                driver.findElement(By.xpath("//a[@title='Next'")).click();
	            }
	            Thread.sleep(2000);
	        }
	        
	        Thread.sleep(2000);
	        driver.quit();
	    }

	}


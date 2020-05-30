package GroupWorks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class ToolqaTest extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		WebElement linkt=driver.findElement(By.xpath("//a[@title='Automation Practice Table']"));
		linkt.click();
		driver.navigate().back();
		wait(1);
		driver.manage().window().maximize();
		
		WebElement nameBox=driver.findElement(By.xpath("//input[@name='firstname']"));
		nameBox.sendKeys(ConfigsReader.getProperty("username"));
		
		WebElement lastnameBox=driver.findElement(By.id("lastname"));
		lastnameBox.sendKeys(ConfigsReader.getProperty("lastname"));
		wait(1);
		
//		WebElement radioButton=driver.findElement(By.xpath("//input[@type='radio']"));
//		radioButton.click();
//		boolean isSelected=radioButton.isSelected();
//		System.out.println(isSelected);
		
		List<WebElement> radioButtons=driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(WebElement radioB:radioButtons) { //for each-> ctrl+shift
			if(radioB.isEnabled()) {
				String value=radioB.getAttribute("value");
				if(value.equals("Female")) {
					radioB.click();
					System.out.println("Female can be selected: "+radioB.isSelected());
				}else if(value.equalsIgnoreCase("5")) {
					radioB.click();
				}
			}
	}
		List<WebElement> checkBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement box : checkBox) {
			
		}
		
		
		
	}

}

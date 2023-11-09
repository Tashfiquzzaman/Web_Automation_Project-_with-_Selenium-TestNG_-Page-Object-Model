
package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.BaseDriver.DriverSetting;
import com.BaseDriver.PagesSetting;


public class Class2_MouseHover_WritterSelect extends DriverSetting  {
	WebDriver driver;
	
		public Class2_MouseHover_WritterSelect(WebDriver driver) {
			this.driver=driver;
			 PageFactory .initElements(PagesSetting.getCurrentDriver(), this);	
		}
		
		public void hovering() throws InterruptedException {

			Actions action = new Actions(driver);

			WebElement lifestile = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/ul[1]/li[2]/a[1]"));
			action.moveToElement(lifestile).perform();
			//TimeUnit.SECONDS.sleep(4);
			
			WebElement writter= driver.findElement(By.xpath("//span[contains(text(),'হুমায়ূন আহমেদ')]"));
			writter.click();
			TimeUnit.SECONDS.sleep(4);		

	}
	
}





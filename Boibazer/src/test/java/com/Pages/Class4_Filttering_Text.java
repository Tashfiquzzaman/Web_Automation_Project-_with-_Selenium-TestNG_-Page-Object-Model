package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.BaseDriver.DriverSetting;
import com.BaseDriver.PagesSetting;

public class Class4_Filttering_Text extends DriverSetting {
      WebDriver driver;
	
	 public Class4_Filttering_Text(WebDriver driver) {
		this.driver=driver;	
		 PageFactory .initElements(PagesSetting.getCurrentDriver(), this);	
	}
	
	public void selectedbookcheck() throws InterruptedException {

		WebElement book=driver.findElement(By.xpath("//div[@class='details-images-area']"));
		book.click();
		TimeUnit.SECONDS.sleep(3);
		
		
  
		
	}
	
	
	
	

}

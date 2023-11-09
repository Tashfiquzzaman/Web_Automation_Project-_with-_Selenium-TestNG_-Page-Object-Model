package com.Pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.BaseDriver.PagesSetting;

public class Class7_ShoppingCart_NextButton_Click {
	WebDriver driver;
	
	public Class7_ShoppingCart_NextButton_Click(WebDriver driver) {
		this.driver=driver;
		PageFactory .initElements(PagesSetting.getCurrentDriver(), this);
		}
	
	
	
	
	public void nextbuttonclick() throws InterruptedException 
	{ 
	   JavascriptExecutor object=(JavascriptExecutor) driver;
		      WebElement location1=driver.findElement(By.xpath("//div[@class='col-md-6']//div[@class='row']")); 
		      object.executeScript("arguments[0].scrollIntoView(true)",location1);
		      TimeUnit.SECONDS.sleep(4);
	          object.executeScript("window.scrollTo(0,0)");
		      Thread.sleep(3000);
		
		  WebElement nextbutton=driver.findElement(By.xpath("//button[@id='checkout-btn']"));
		  nextbutton.click();
		  TimeUnit.SECONDS.sleep(2);
		  
		  
		
	}

}

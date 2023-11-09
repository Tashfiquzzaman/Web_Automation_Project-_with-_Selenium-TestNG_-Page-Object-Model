package com.Pages; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.BaseDriver.DriverSetting;
import com.BaseDriver.PagesSetting;

public class Class1_Scrolling extends DriverSetting{
	WebDriver driver;
	
	
	public Class1_Scrolling(WebDriver driver) {
		this.driver=driver;
		PageFactory .initElements(PagesSetting.getCurrentDriver(), this);
		}	
	
	public void Scroll() throws InterruptedException {
					 
		  JavascriptExecutor object=(JavascriptExecutor) driver;
		  
		  
	     WebElement location=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[13]/div[1]")); 
	     object.executeScript("arguments[0].scrollIntoView(true)",location);		 
              TimeUnit.SECONDS.sleep(1);
		
	     WebElement location1=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/article[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[10]/div[1]")); 
	     object.executeScript("arguments[0].scrollIntoView(true)",location1);
	     TimeUnit.SECONDS.sleep(1);
	     
	     WebElement location2=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/article[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[10]/div[1]"));
	     object.executeScript("arguments[0].scrollIntoView(true)",location2);
	     TimeUnit.SECONDS.sleep(1);
	       
	     WebElement location3=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/article[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[10]/div[1]"));
	     object.executeScript("arguments[0].scrollIntoView(true)",location3);
	     TimeUnit.SECONDS.sleep(1);
	     
	     WebElement location4=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/article[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]"));
	     object.executeScript("arguments[0].scrollIntoView(true)",location4);
	     TimeUnit.SECONDS.sleep(1);
	     
	     WebElement location5=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/article[1]/div[1]/div[6]/div[2]/div[2]/div[1]/div[1]/div[10]/div[1]"));
	     object.executeScript("arguments[0].scrollIntoView(true)",location5);
	     TimeUnit.SECONDS.sleep(1);
	     
	     WebElement location6=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/article[1]/div[1]/div[6]/div[4]/div[2]/div[1]/div[1]/div[10]/div[1]"));
	     object.executeScript("arguments[0].scrollIntoView(true)",location6);
	     TimeUnit.SECONDS.sleep(1);
	     
	     WebElement location7=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/article[1]/div[1]/div[6]/div[3]/div[2]/div[1]/div[1]/div[12]/div[1]"));
	     object.executeScript("arguments[0].scrollIntoView(true)",location7);
	     TimeUnit.SECONDS.sleep(1);
	     
	     WebElement location8=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/article[1]/div[1]/div[6]/div[4]/div[2]/div[1]/div[1]/div[12]/div[1]"));
	     object.executeScript("arguments[0].scrollIntoView(true)",location8);
	     TimeUnit.SECONDS.sleep(1);
	     
	     WebElement location9=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/article[1]/div[1]/div[7]/div[1]/div[2]/div[1]/div[1]/div[10]/div[1]"));
	     object.executeScript("arguments[0].scrollIntoView(true)",location9);
	     TimeUnit.SECONDS.sleep(1);
	     
	     WebElement location10=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/article[1]/div[1]/div[6]/div[5]"));
	     object.executeScript("arguments[0].scrollIntoView(true)",location10);
	     TimeUnit.SECONDS.sleep(1);
	     
	     WebElement location11=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/article[1]/div[1]/div[7]/div[2]"));
	     object.executeScript("arguments[0].scrollIntoView(true)",location11);
	     TimeUnit.SECONDS.sleep(1);
	     
	     WebElement location12=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/img[1]"));
	     object.executeScript("arguments[0].scrollIntoView(true)",location12);
	     TimeUnit.SECONDS.sleep(1);
	     
	     WebElement location13=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[4]/footer[1]/div[1]"));
	     object.executeScript("arguments[0].scrollIntoView(true)",location13);
	     TimeUnit.SECONDS.sleep(1);
	     
	      object.executeScript("window.scrollBy(0,document.body.scrollHeight)");	 
		  Thread.sleep(3000);
		  
		  object.executeScript("window.scrollTo(0,0)");
		  Thread.sleep(3000);
	     
	     
		
	}
	

}

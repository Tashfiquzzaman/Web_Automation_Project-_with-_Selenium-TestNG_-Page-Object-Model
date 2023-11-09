package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BaseDriver.DriverSetting;
import com.BaseDriver.PagesSetting;

public class Class9_Create_Account extends DriverSetting{
	WebDriver driver;
	public Class9_Create_Account(WebDriver driver) {
		this.driver=driver;
		 PageFactory .initElements(PagesSetting.getCurrentDriver(), this);
		
	}
	
	public void accout_create() throws InterruptedException {
		WebElement name= driver.findElement(By.xpath("//input[@id='ca-name-input']"));
		name.sendKeys("Tashfiq");
		TimeUnit.SECONDS.sleep(2);
		
		
		WebElement email= driver.findElement(By.xpath("//input[@id='ca-email-input']"));
		email.sendKeys("teat@gmail.com");
		TimeUnit.SECONDS.sleep(2);
		
		
		WebElement password= driver.findElement(By.xpath("//input[@id='password-input-signup']"));
		password.sendKeys("abc123");
		TimeUnit.SECONDS.sleep(2);
		
	
		WebElement distric= driver.findElement(By.xpath("//select[@id='make']"));
		distric.click();
		TimeUnit.SECONDS.sleep(2); 
		
		WebElement ddwon= driver.findElement(By.id("make"));
		Select select=new Select (ddwon);
		select.selectByVisibleText("Dhaka");
		TimeUnit.SECONDS.sleep(2); 
		
		
		WebElement thanaselect= driver.findElement(By.xpath("//select[@id='thana']"));
	    thanaselect.click();;
	    TimeUnit.SECONDS.sleep(2);
	    
	    WebElement ddwon1= driver.findElement(By.id("thana"));
		Select select1=new Select (ddwon1);
		select1.selectByVisibleText("Khilgaon Thana");
		TimeUnit.SECONDS.sleep(2);
	    
			
		WebElement address= driver.findElement(By.xpath("//textarea[@id='receiver-address-input']"));
		address.sendKeys("XYZ");
		TimeUnit.SECONDS.sleep(2);
		
		WebElement nextbutton=driver.findElement(By.xpath("//button[@id='next-btn-shipping']"));
		nextbutton.click();
		TimeUnit.SECONDS.sleep(3);
		
		driver.navigate().to("https://www.boibazar.com/payment/order");
		TimeUnit.SECONDS.sleep(6);
		
	}

}

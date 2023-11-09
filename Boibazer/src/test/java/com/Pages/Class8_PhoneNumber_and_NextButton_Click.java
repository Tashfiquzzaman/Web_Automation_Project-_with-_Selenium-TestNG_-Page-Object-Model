package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.BaseDriver.DriverSetting;
import com.BaseDriver.PagesSetting;

public class Class8_PhoneNumber_and_NextButton_Click extends DriverSetting  {
	WebDriver driver;
	public Class8_PhoneNumber_and_NextButton_Click(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(PagesSetting.getCurrentDriver(), this);
	}

	public void sendphonenumber() throws InterruptedException {
		
		WebElement phonenumber=driver.findElement(By.xpath("//input[@id='mobile-no-input']"));
		phonenumber.sendKeys("0193486389810");
		TimeUnit.SECONDS.sleep(3);
		
		phonenumber.sendKeys(Keys.ENTER);	
		TimeUnit.SECONDS.sleep(1);
		
		Actions actions = new Actions(driver);
		actions.keyUp(phonenumber, Keys.ENTER).build().perform();
		TimeUnit.SECONDS.sleep(4);
		
		
		WebElement nextbuttonclick=driver.findElement(By.xpath("//button[@id='next-btn-shipping']"));
		nextbuttonclick.click();
		TimeUnit.SECONDS.sleep(2);
	}

}

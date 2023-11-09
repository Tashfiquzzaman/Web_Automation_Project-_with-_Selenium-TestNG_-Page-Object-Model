package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.BaseDriver.DriverSetting;
import com.BaseDriver.PagesSetting;

public class Class6_ClickCart_icon extends DriverSetting {
	WebDriver driver;
	
	public Class6_ClickCart_icon(WebDriver driver) {
		this.driver=driver;
		 PageFactory .initElements(PagesSetting.getCurrentDriver(), this);		
	}
	
	public void clickcart() throws InterruptedException {
		 WebElement cart= driver.findElement( By.xpath("//div[@class='f2-f2 float-cart visible-desktop']//div//a"));
		cart.click();
		TimeUnit.SECONDS.sleep(3);
	}
	

}

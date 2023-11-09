package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.BaseDriver.DriverSetting;
import com.BaseDriver.PagesSetting;

public class Class10_Lastpage extends DriverSetting {
	WebDriver driver;
	
	public Class10_Lastpage(WebDriver driver) {
		this .driver=driver;
		PageFactory .initElements(PagesSetting.getCurrentDriver(), this);
	
	}
   public void lastpage() throws InterruptedException {
		driver.navigate().to("https://www.boibazar.com/payment/order");
		TimeUnit.SECONDS.sleep(6);
		
		
	}

}

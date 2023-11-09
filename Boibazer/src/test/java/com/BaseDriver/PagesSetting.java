package com.BaseDriver;

import org.openqa.selenium.WebDriver;

public class PagesSetting {
	       
	
	public static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	private static PagesSetting instance = null;
	
	private PagesSetting() {
		
	}
	
	public static PagesSetting getInstance() {
		if(instance == null) {
			instance = new PagesSetting();
		}
		return instance;
	}
	
	public WebDriver getDriver() {
		return webDriver.get();
	}
	
	public void setDriver(WebDriver driver) {
		webDriver.set(driver);
	}
	
	public static WebDriver getCurrentDriver() {
		return getInstance().getDriver();
	}
}

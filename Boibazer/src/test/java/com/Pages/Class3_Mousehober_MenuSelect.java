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

public class Class3_Mousehober_MenuSelect extends DriverSetting {
	
	WebDriver driver;
	
	public Class3_Mousehober_MenuSelect(WebDriver driver) {
		this.driver=driver;
		 PageFactory .initElements(PagesSetting.getCurrentDriver(), this);	
	}
	
	public void hovering() throws InterruptedException {
		/*
		JavascriptExecutor object=(JavascriptExecutor) driver;
		WebElement location1=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/section[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]")); 
	    object.executeScript("arguments[0].scrollIntoView(true)",location1);
	    TimeUnit.SECONDS.sleep(1);
	     */

		Actions action = new Actions(driver);

		WebElement subjecthover = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]"));
		action.moveToElement(subjecthover).perform();
		TimeUnit.SECONDS.sleep(2);
		
		
		WebElement All= driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/div[1]/div[1]/li[1]"));
		All.click();
		TimeUnit.SECONDS.sleep(2);	
	
		WebElement selecteditem=driver.findElement(By.xpath("//input[@id='category4']"));
		selecteditem.click();
		TimeUnit.SECONDS.sleep(2);
		
		
		WebElement bookname1=driver.findElement(By.xpath("//input[@id='internal_search']"));
		bookname1.click();
		TimeUnit.SECONDS.sleep(3);
		
		
//		WebElement bookname=driver.findElement(By.xpath("//input[@id='internal_search']"));
//		bookname.sendKeys("শ্রেষ্ঠ প্রেমের উপন্যাস");
		
		WebElement inputElement= driver.findElement(By.xpath("//input[@id='internal_search']"));
		inputElement.sendKeys("শ্রেষ্ঠ প্রেমের উপন্যাস");
		TimeUnit.SECONDS.sleep(3);
		inputElement.sendKeys(Keys.ENTER);	
		TimeUnit.SECONDS.sleep(1);
		
		Actions actions = new Actions(driver);
		actions.keyUp(inputElement, Keys.ENTER).build().perform();
		TimeUnit.SECONDS.sleep(4);
		
		
		WebElement bookClick= driver.findElement(By.xpath("//a[@href='https://www.boibazar.com/book/sheshtho-premer-uponnas']"));
		bookClick.click();
		TimeUnit.SECONDS.sleep(3);
		

}

	
	
}

package com.Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.BaseDriver.DriverSetting;
import com.BaseDriver.PagesSetting;

public class Class5_Selected_Book_Overview extends DriverSetting  {
	WebDriver driver;
	public Class5_Selected_Book_Overview(WebDriver driver) {
		this.driver=driver;	
		 PageFactory .initElements(PagesSetting.getCurrentDriver(), this);	
	}

	public void bookOverview() throws InterruptedException {
		 /*
		WebElement book=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]"));
		book.click();
		TimeUnit.SECONDS.sleep(3);
		
		WebElement cancleclick= driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"));
	    cancleclick.click();
	    TimeUnit.SECONDS.sleep(2);
	    
	    WebElement slectedbookclick= driver.findElement(By.xpath("//img[@class='cart-zoom']"));
		slectedbookclick.click();
		TimeUnit.SECONDS.sleep(4);
		
         
        JavascriptExecutor object=(JavascriptExecutor) driver;
		
		WebElement location1=driver.findElement(By.xpath("//div[@id='lookInsideModal']//div[@class='login-header']//div[1]//img[1]")); 
	    object.executeScript("arguments[0].scrollIntoView(true)",location1);
	    TimeUnit.SECONDS.sleep(4);
		
	    
	    WebElement location2=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/img[1]")); 
	    object.executeScript("arguments[0].scrollIntoView(true)",location2);
	    TimeUnit.SECONDS.sleep(3);
	    
	    WebElement location3=driver.findElement(By.xpath("//div[@id='lookInsideModal']//div[6]//img[1]")); 
	    object.executeScript("arguments[0].scrollIntoView(true)",location3);
	    TimeUnit.SECONDS.sleep(2);
	   
	    
	    object.executeScript("window.scrollTo(0,0)");
	    TimeUnit.SECONDS.sleep(1);
	    */
	    
	    
		WebElement cancleclick= driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"));
	    cancleclick.click();
	    TimeUnit.SECONDS.sleep(2);
	    
	    WebElement addtocartbuttonclick= driver.findElement(By.xpath("//img[@class='cart-zoom']"));
	    addtocartbuttonclick.click();
		TimeUnit.SECONDS.sleep(4);
         
		
	}
	
	

}


package com.BaseDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetting {
 
	protected static String url="https://www.boibazar.com/";
	
	protected WebDriver driver;
	
	@BeforeSuite
	
	public void startbrowser() {
     String browserName = System.getProperty("browser", "Chrome");
	
	if (browserName.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	} 
	
	else 
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
		
	PagesSetting.getInstance().setDriver(driver);
	
	}
			
@AfterSuite

public void close () {
	driver.close();

}
	}
	
	



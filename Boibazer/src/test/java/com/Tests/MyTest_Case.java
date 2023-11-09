package com.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.BaseDriver.DriverSetting;
import com.BaseDriver.PagesSetting;
import com.Pages.Class1_Scrolling;
import com.Pages.Class2_MouseHover_WritterSelect;
import com.Pages.Class3_Mousehober_MenuSelect;
import com.Pages.Class4_Filttering_Text;
import com.Pages.Class5_Selected_Book_Overview;
import com.Pages.Class6_ClickCart_icon;
import com.Pages.Class7_ShoppingCart_NextButton_Click;
import com.Pages.Class8_PhoneNumber_and_NextButton_Click;
import com.Pages.Class9_Create_Account;

public class MyTest_Case extends DriverSetting {
		@BeforeClass		
	@ Test (priority = 0)
	public void Test_Start() throws InterruptedException {
		PagesSetting.getCurrentDriver().get(url);
		Thread.sleep(2000);			  
	}
		
     @Test (priority = 1)
	public void test_2() throws InterruptedException {
		Class1_Scrolling Scrolling = new Class1_Scrolling(driver);
		Scrolling.Scroll();
		//Thread.sleep(2000);
	}
	
   
      @Test (priority = 2)
      public void test_3() throws InterruptedException {
           Class2_MouseHover_WritterSelect object1 =new Class2_MouseHover_WritterSelect(driver);
           object1.hovering();
    
         }
        
         @Test (priority = 3)
         public void test_4() throws InterruptedException {
    	      Class3_Mousehober_MenuSelect object1 =new Class3_Mousehober_MenuSelect(driver);
     	      object1.hovering();	
     	 }
         
         @Test (priority = 4)
         public void test_5() throws InterruptedException { 
        	 Class4_Filttering_Text object3=new Class4_Filttering_Text(driver);
        	 object3 .selectedbookcheck();
         }

         @Test (priority = 5)
        	public void test_6() throws InterruptedException {
        	  Class5_Selected_Book_Overview object6= new Class5_Selected_Book_Overview(driver);
        	  object6.bookOverview();
        		
        	}
         @Test (priority = 6)
         public void test_7() throws InterruptedException{
        	 Class6_ClickCart_icon object= new Class6_ClickCart_icon(driver);
        	 object.clickcart();
        	 
         }
         @Test (priority = 7)
         public void test_8() throws InterruptedException {
        	 Class7_ShoppingCart_NextButton_Click object= new Class7_ShoppingCart_NextButton_Click(driver);
        	 object.nextbuttonclick();
        	 
        	 
         }
         @Test (priority = 8)
        public void test_9() throws InterruptedException {
        	Class8_PhoneNumber_and_NextButton_Click object= new Class8_PhoneNumber_and_NextButton_Click(driver);
        	object.sendphonenumber();
        	
        }
         @Test (priority = 9)
         public void test_10() throws InterruptedException {
        	 
        	 Class9_Create_Account object=new Class9_Create_Account(driver);
        	 object.accout_create();
         }

}

package  Pages;
//import MercuryDemoTours;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import HTMLReport.*;

public class Jobs
{
	
	
	// ALl object started for Login Page
	String username_sendkey="//input[@id='txtUsername']";
	String password_sendkey="//input[@id='txtPassword']";
	String login_click="//input[@id='btnLogin']";
	String uid="txtUsername";
	// ALl object ended for Login Page
	
	
	
	
	//public  static 	String UserName, Password ;
	 WebDriver driver;


	 Reporter1 R1;

	
    

  public void Jobs(WebDriver driver,Reporter1 R1 )throws Exception
	{  
		this.driver=driver;
		
		this.R1=R1;
		
	}
	
	
	
	// Draws a red border around the found element. Does not set it back anyhow.
	public  WebElement findElement(By by) throws Exception {
		
	    WebElement elem = driver.findElement(by);
	    	    
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	        
	  //  TH3.HTMLScreenShot("Screen Shot","Click Here","Pass", HtmlOutputFileName,driver);
	        
	    }
	    return elem;
	}
	
	
	
	
	
	
		 
		 
		 public   void AddJobs(String TestURL,String UserName,String Password)throws Exception
		 {
			 
			 	try
			 	{
					
			 		 driver.get(TestURL);
					 R1.TakeScreenShotAuto(driver,"Open Url - Orange HRM Url Invoked Successfully ","Pass");
		
					findElement(By.id(uid)).sendKeys(UserName); 
					R1.TakeScreenShotAuto(driver,"Login Page - Enter user Name","Pass");
							 
				
					findElement(By.xpath(password_sendkey)).sendKeys(Password);
					R1.TakeScreenShotAuto(driver,"Login Page - Enter Password","Pass");
					

				 	findElement(By.xpath(login_click));
				 	R1.TakeScreenShotAuto(driver,"Login Page - Click on Sign In","Pass");
				 	findElement(By.xpath(login_click)).click();
				 	
							
						  
		 		}
			 	catch(NoSuchElementException e)
				{
					System.out.println("Error Message :"+e.getMessage());
					 R1.TakeScreenShotAuto(driver,e.getMessage(),"Fail");
				}
			 	
			 	catch(NullPointerException e)
				{
					System.out.println("Error Message :"+e.getMessage());
					 R1.TakeScreenShotAuto(driver,e.getMessage(),"Fail");
				}
			 	
			 	
		 }
		 
		 
		





		 
}
	


	
	
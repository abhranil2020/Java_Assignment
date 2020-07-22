package assignment.java;

import java.io.FileWriter;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Java_Assign9 {
	
	 
	@Test
	public void htmlfiletable() throws Exception
	{
        PrintWriter pw = new PrintWriter(new FileWriter("D:/test.html"));
             
        pw.println("<TABLE BORDER><TR><TH>Number<TH>Square of Number<TH>Testing</TR>"); 
        
        pw.println(); 
        pw.println("</TABLE>");
        pw.close();

	}

}
		  


	    
	    
	   

/*
	@BeforeMethod
	public void setUp() throws InterruptedException
	{		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Java_Asssignment\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver(); 
		driver.get("https://www.attra.com/");
		driver.manage().window().maximize();	
		Thread.sleep(2000);  			    
	}
	
	@AfterMethod
	public void tearDown()
	{	
		driver.quit();
    }
*/

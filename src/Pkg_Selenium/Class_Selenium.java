package Pkg_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Selenium {
	
	
	public static void main(String[] args) throws InterruptedException{
		String BaseURL;
		WebDriver driver;
			// declaration and instantiation of objects/variables
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", System.getProperty("C:\\DRIVERS") + "\\chromedriver.exe");
			 driver = new ChromeDriver();
			 					
			 
			try{
			// driver = new ChromeDriver();
			//URL initiation
				BaseURL = "http://www.Ikman.lk";
				driver.get(BaseURL);
				Thread.sleep(5000);
				
				//Close the webdriver
				driver.close();
				
		}
		
		catch (Exception ex) {
			// TODO: handle exception
			System.out.print(ex);
		}
		
		
		
		
		
	
	
	}

}

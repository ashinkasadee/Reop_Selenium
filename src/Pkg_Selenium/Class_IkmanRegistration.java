package Pkg_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_IkmanRegistration {
	
	
	public static void main(String[] args) throws InterruptedException{
		String BaseURL;
		WebDriver driver;
		boolean ErrorMsg;
			// declaration and instantiation of objects/variables
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", System.getProperty("C:\\DRIVERS") + "\\chromedriver.exe");
			 driver = new ChromeDriver();
			 					
			 
			try{
			// driver = new ChromeDriver();
			//URL initiation
				BaseURL = "http://www.Ikman.lk";
				driver.get(BaseURL);
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Sign up using email')]")).click();
				
				driver.findElement(By.xpath("//input[@id='name']")).sendKeys("UsernameIkman");
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tt123@gmail.com");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("S123@#12356");
				driver.findElement(By.xpath("//input[@id='password-confirm']")).sendKeys("S123@#12356");
				
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).click();
				
				ErrorMsg = driver.findElement(By.xpath("//div[contains(text(),'This email is already registered. Please log in.')]")).isDisplayed();
				
				if (ErrorMsg==true) {
					driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
					driver.findElement(By.id("account")).sendKeys("tt123@gmail.com");
					driver.findElement(By.id("password")).sendKeys("S123@#12356");
					driver.findElement(By.xpath("//button[@class='ui-btn is-secondary has-busy is-auto is-island gtm-email-login']/span[1]")).click();
					driver.findElement(By.xpath("//div[@class='is-main details-section']/h3"));
				}
				
				
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

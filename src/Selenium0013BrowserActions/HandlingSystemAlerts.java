package Selenium0013BrowserActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSystemAlerts {
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		driver.get("http://demo.guru99.com/test/delete_customer.php");			


		driver.findElement(By.name("cusid")).sendKeys("53920");
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).submit();

		//Switching to Alert        
		Alert alert = driver.switchTo().alert();		

		// Capturing alert message.    
		String alertMessage= driver.switchTo().alert().getText();		

		//Displaying alert message		
		System.out.println(alertMessage);	
		Thread.sleep(3000);

		//Accepting alert		
		alert.accept();
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("submit")).submit();
		Thread.sleep(2000);
		
		//Dismissing the alert
		alert.dismiss();
	}
}

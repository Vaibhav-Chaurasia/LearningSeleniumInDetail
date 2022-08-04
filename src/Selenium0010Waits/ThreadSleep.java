package Selenium0010Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Whenever Thread.sleep() functions to execute, it always pauses the current thread execution.
		 * 
		 * 
		 * If any other thread interrupts when the thread is sleeping, 
		 * then InterruptedException will be thrown
		 * 
		 * 
		 * If the system is busy, then the actual time the thread will sleep 
		 * will be more as compared to that passed while calling the sleep method 
		 * and if the system has less load, then the actual sleep time of the thread 
		 * will be close to that passed while calling sleep() method.
		 * */

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000); //Pause for 2 seconds

		/*-----------------------------------------Functions for Link/Anchor Tag-----------------------------------------*/		
		WebElement forgotPasswordLink  = driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
		String loginButtonText = forgotPasswordLink.getAccessibleName();
		System.out.println("Login button text is - " + loginButtonText);


		String forgotPasswordAriaRole = forgotPasswordLink.getAriaRole();
		System.out.println("Forgot Password Link Aria Role is - " + forgotPasswordAriaRole);
		Thread.sleep(2000); //Pause for 2 seconds

		String forgotPasswordTagName = forgotPasswordLink.getTagName();
		System.out.println("Forgot Password Link Tag Name  is - " + forgotPasswordTagName);

		Thread.sleep(2000); //Pause for 2 seconds
		forgotPasswordLink.click();

		Thread.sleep(2000); //Pause for 2 seconds
		driver.navigate().back();
		/*-----------------------------------------------------------------------------------------------------------------*/
	}
}
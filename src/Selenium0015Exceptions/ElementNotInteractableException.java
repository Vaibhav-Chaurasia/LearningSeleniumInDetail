package Selenium0015Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ElementNotInteractableException {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://accounts.lambdatest.com/login");
		
		
		//Sending text in label field
		driver.findElement(By.xpath("//span[text()='OR']")).sendKeys("");
	}
}
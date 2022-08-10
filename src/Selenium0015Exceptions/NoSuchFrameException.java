package Selenium0015Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchFrameException {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://accounts.lambdatest.com/login");
		
		//Switching to invalid frame
		driver.switchTo().frame("sd8");
		
		
		//Not mentioned the xpaths or selectors to perform actions
		driver.findElement(By.xpath("")).sendKeys("");
	}
}
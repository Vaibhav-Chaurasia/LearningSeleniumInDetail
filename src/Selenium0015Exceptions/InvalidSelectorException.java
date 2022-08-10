package Selenium0015Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidSelectorException {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://accounts.lambdatest.com/login");
		
		
		//Not mentioned the xpaths or selectors to perform actions
		driver.findElement(By.xpath("")).sendKeys("");
	}
}
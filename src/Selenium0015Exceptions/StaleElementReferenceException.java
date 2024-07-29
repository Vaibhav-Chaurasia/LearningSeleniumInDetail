package Selenium0015Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaleElementReferenceException {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://accounts.lambdatest.com/login");	
		

		//When it is declared already.
		WebElement email = driver.findElement(By.id("email"));
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		
		//But the action is taken lately when it is gone
		email.sendKeys("abc");
	}
}
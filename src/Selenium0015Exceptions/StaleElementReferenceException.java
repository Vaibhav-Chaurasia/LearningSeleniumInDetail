package Selenium0015Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.lambdatest.com/login");	
		

		//When it is declared already.
		WebElement email = driver.findElement(By.id("email"));
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		
		//But the action is taken lately when it is gone
		email.sendKeys("abc");
	}
}
package Selenium0015Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionNotCreatedException {
	
	public static void main(String[] args) throws Throwable {
		
		//When incorrect version of browser configured.
		System.setProperty("webdriver.chrome.driver","chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);
	
		driver.findElement(By.id("email")).hashCode();
	}

}

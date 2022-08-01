package Selenium0006LocatorStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		
		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		
		//Taking Relative xpaths
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vaicha.oracle@gmail.com");
		Thread.sleep(2000); //Pause or Wait for 2 seconds
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vaibhav1234");
	}
}
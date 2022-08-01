package Selenium0007WebDriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/register";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000); //Pause or Wait for 2 seconds

		driver.findElement(By.linkText("Privacy Policy")).click();
		Thread.sleep(2000); //Pause or Wait for 2 seconds


		String originalHandle = driver.getWindowHandle(); //This function deals with single tab or window.
		driver.switchTo().window(originalHandle);
	}
}
package Selenium0007WebDriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {

		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		String baseUrl = "https://accounts.lambdatest.com/register";
		driver.get(baseUrl);

		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("a[data-amplitude$='nin']")).click();
		Thread.sleep(2000);
		driver.navigate().back(); //It takes user to one page back in browser
		Thread.sleep(2000);

		driver.navigate().forward(); //It takes user to one page forward in browser
		Thread.sleep(2000);

		driver.navigate().refresh(); //It refreshes the active tab
		Thread.sleep(2000);

		driver.navigate().to("https://www.google.com"); //It navigates user to any url given
	}
}
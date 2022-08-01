package Selenium0007WebDriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) throws InterruptedException {

		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/register";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000); //Pause or Wait for 2 seconds

		String getCurrentURL = driver.getCurrentUrl(); //This function will get current URL in browser
		System.out.println("The Current URL is - " + getCurrentURL);

		driver.findElement(By.linkText("Privacy Policy")).click();
		Thread.sleep(2000); //Pause or Wait for 2 seconds

		
		String originalHandle = driver.getWindowHandle();

		for(String handle : driver.getWindowHandles()) {
			if (!handle.equals(originalHandle)) {
				driver.switchTo().window(handle);
				String getCurrentURL1 = driver.getCurrentUrl(); 
				System.out.println("The Current URL is - " + getCurrentURL1);
			}
		}

		driver.quit(); //closes all browser windows and ends the WebDriver session.
	}
}
package Selenium0016Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionHardAssertionExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://accounts.lambdatest.com/register");

		String currentURL = driver.getCurrentUrl();
		Thread.sleep(2000);


		Assert.assertNull(currentURL);


		//Above assertion failed, so, the code below doesn't executes and system abort abruptly.
		System.out.println("The Current URL is - " + currentURL);
	}
}
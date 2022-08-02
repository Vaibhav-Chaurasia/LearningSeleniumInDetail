package Selenium0008WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysToEnterText {

	public static void main(String[] args) throws InterruptedException {

		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);


		//This function enters the text into the input field
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vaicha.oracle@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vaibhav1234");
	}
}
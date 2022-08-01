package Selenium0006LocatorStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSimpleXpaths {

	public static void main(String[] args) throws InterruptedException {

		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		//Maximizing the window
		driver.manage().window().maximize();

		//Simple Format of Xpath
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vaicha.oracle@gmail.com");
		Thread.sleep(2000); //Pause or Wait for 2 seconds

		//Using And in Xpath
		driver.findElement(By.xpath("//input[@id='password' and @name='password']")).sendKeys("Vaibhav1234");

		//Using Contains and Text() function in xpath
		driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
		Thread.sleep(2000); //Pause or Wait for 2 seconds
		driver.navigate().back(); //This click on browser back button
		Thread.sleep(5000);


		//Using Index in xpath first way
		driver.findElement(By.xpath("//div//a[2]")).click();
		Thread.sleep(5000);
		driver.navigate().back(); //This click on browser back button
		Thread.sleep(5000);

		//Using Index in xpath second way
		driver.findElement(By.xpath("(//div//a)[3]")).click();
		Thread.sleep(5000);
		driver.navigate().back(); //This click on browser back button
		Thread.sleep(5000);


		//Using Chained Xpaths
		driver.findElement(By.xpath("//div//span[contains(text(),'No account')]//a[@href='/register']")).click();
		Thread.sleep(2000);
		driver.navigate().back(); //This click on browser back button
		Thread.sleep(5000);


		//Using OR in xpaths
		driver.findElement(By.xpath("//button[@id='login-button' or @type='submit']")).click();
		Thread.sleep(2000);


		//Using starts-with function
		driver.findElement(By.xpath("//a[starts-with(text(),'Forgot')]")).click();
	}
}
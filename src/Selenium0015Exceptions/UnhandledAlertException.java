package Selenium0015Exceptions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UnhandledAlertException {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/alerts");	
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);

		//When alert handled in incorrect way
		Alert simpleAlert = (Alert) driver.switchTo().frame(0);
		simpleAlert.accept();
	}
}
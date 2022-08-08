package Selenium0015Exceptions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnhandledAlertException {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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

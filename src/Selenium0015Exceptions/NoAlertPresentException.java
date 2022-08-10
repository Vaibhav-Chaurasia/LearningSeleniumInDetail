package Selenium0015Exceptions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoAlertPresentException {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");	
		driver.manage().window().maximize();
		
		//Try to switching to alerts, without having them on screen.
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
	}
}
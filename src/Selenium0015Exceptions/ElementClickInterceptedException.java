package Selenium0015Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClickInterceptedException {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/java/elementclickinterceptedexception-selenium");	
		
		//When element is there but HTML DOM not visible on screen
		driver.findElement(By.xpath("//a[text()='Stale Element Eeference Exception in Selenium']")).click();
	}
}
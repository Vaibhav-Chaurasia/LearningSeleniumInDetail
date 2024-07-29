package Selenium0015Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ElementClickInterceptedException {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://chercher.tech/java/elementclickinterceptedexception-selenium");
		
		Thread.sleep(10000);
		
		//When element is there but HTML DOM not visible on screen
		driver.findElement(By.xpath("//a[text()='Stale Element Eeference Exception in Selenium']")).click();
		
		System.out.println("Element clicked");
	}
}
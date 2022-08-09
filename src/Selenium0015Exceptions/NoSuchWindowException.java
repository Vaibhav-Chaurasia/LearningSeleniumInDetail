package Selenium0015Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchWindowException {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		

		//Giving incorrect window ID at the time of switching
		driver.switchTo().window("XYZ");
	}		
}
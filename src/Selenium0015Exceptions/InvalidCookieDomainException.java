package Selenium0015Exceptions;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidCookieDomainException {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Invalid Domain to set cookie
		Cookie cookie = new Cookie("Testing", "11111");
		driver.manage().addCookie(cookie);
		driver.get("https://www.google.ca/?gws_rd=ssl"); // The link is an example
	}
}
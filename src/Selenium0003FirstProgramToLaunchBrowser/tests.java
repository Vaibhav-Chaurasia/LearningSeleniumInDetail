package Selenium0003FirstProgramToLaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tests {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver.", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
	}
}
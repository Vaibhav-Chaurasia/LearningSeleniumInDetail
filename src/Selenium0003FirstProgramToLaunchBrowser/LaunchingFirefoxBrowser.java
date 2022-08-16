package Selenium0003FirstProgramToLaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirefoxBrowser {
	public static void main(String[] args) {

		//Setting up the firefox browser launch - Giving browser name and path.
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String baseUrl = "https://www.google.com";
		
		driver.get(baseUrl);
	}
}
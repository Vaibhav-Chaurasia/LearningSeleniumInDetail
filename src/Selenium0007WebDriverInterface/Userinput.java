package Selenium0007WebDriverInterface;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Userinput {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the name of the browser to launch (Chrome/Firefox/Edge)");

			String browserName = scanner.nextLine();
			WebDriver driver;

			if (browserName.equalsIgnoreCase("Chrome")) {

				// set the path of the chrome driver executable
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");

				// create an instance of the ChromeDriver
				driver = new ChromeDriver(options);
			} 

			else if (browserName.equalsIgnoreCase("Firefox")) {
				// set the path of the Firefox driver executable
				
				FirefoxOptions options = new FirefoxOptions();
				String strFFBinaryPath = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
				options.setBinary(strFFBinaryPath);
				driver = new FirefoxDriver(options);
			} 

			else {

				System.out.println(browserName.equalsIgnoreCase("Edge"));
				System.setProperty("webdriver.msedge.driver", "msedgedriver.exe");
				return;
			}

			// navigate to a URL
			driver.get("https:www.google.com");

			// close the browser
			driver.quit();
		} 
	}
}
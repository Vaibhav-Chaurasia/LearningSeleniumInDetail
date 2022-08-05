package Selenium0013BrowserActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAndWorkingInNewTab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.switchTo().newWindow(WindowType.TAB);

		// Loads Lambda Test open source website in the newly opened window
		driver.get("https://accounts.lambdatest.com/login");	
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vaicha.oracle@gmail.com");
	}
}
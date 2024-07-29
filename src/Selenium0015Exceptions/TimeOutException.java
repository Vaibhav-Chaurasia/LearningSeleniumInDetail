package Selenium0015Exceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeOutException {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		//Element not found under given duration
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		@SuppressWarnings("unused")
		WebElement loginHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Login']")));
	}
}
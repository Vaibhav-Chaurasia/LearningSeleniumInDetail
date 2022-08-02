package Selenium0008WebElementInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsElementVisible {

	//IsVisible in now not available it is a method of old Selenium RC. But we can achieve it through wait.

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		Thread.sleep(2000);

		try {
			
			//Wait until element is visible
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement isResetHeadingVisible = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Reset Password']")));

			System.out.println("Xpath of an Element Visible - " + isResetHeadingVisible);
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vchaurasia@dminc.com");
		} catch (Exception e) {
			System.out.println("No Element Found");
		}
	}
}
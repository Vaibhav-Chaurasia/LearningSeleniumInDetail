package Selenium0016Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assertTrueFailingCondition {
	public static void main(String[] args) throws InterruptedException {
		
		/* Assert True
		 * Assertion verifies the boolean value returned by a condition. 
		 * If the boolean value is true, then assertion passes the test case, 
		 * and if the boolean value is false, then assertion aborts the test case by an exception.
		 * */

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://accounts.lambdatest.com/register");

		WebElement fullName = driver.findElement(By.id("name"));
		Thread.sleep(2000);

		boolean fullNameIsSelected = fullName.isSelected();
		System.out.println("Is Full Name selected - " + fullNameIsSelected);
		Assert.assertTrue(fullNameIsSelected);
	}  
}
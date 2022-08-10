package Selenium0016Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertNotEqualsPassingCondition {
	
	public static void main(String[] args) throws InterruptedException {

		/* Assert Not Equals
		 * The assertNotEquals method also compares the actual object (or result)
		 *  with the expected object (or result). assertNotEquals 
		 *  is the opposite of assertEquals assertion.
		 * */

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://accounts.lambdatest.com/register");

		WebElement fullName = driver.findElement(By.id("name"));
		Thread.sleep(2000);

		fullName.sendKeys("vaibhavi");
		String expectedValue = "vaibhav";
		
		//Expected and Actual is different, but it is assertnotequals i.e. checking reverse of assertequals
		Assert.assertNotEquals("vaibhavi", expectedValue);
	} 
}

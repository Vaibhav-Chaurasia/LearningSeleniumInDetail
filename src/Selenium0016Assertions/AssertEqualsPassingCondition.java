package Selenium0016Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertEqualsPassingCondition {
	
	public static void main(String[] args) throws InterruptedException {

		/* Assert Equals
		 * The assertEquals method compares the actual object (or result) 
		 * with the expected object (or result). The objects to be compared 
		 * could be string, integer, byte, character, etc.
		 * */

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://accounts.lambdatest.com/register");

		WebElement fullName = driver.findElement(By.id("name"));
		Thread.sleep(2000);

		fullName.sendKeys("vaibhavi");
		String expectedValue = "vaibhavi";
		
		//Expected and Actual is same, hence, it pass the test case
		Assert.assertEquals("vaibhavi", expectedValue);
	} 
}

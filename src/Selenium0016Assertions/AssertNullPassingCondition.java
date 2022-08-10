package Selenium0016Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertNullPassingCondition {
	public static void main(String[] args) throws InterruptedException {

		/* Assert Null
		 * AssertNull() is a method that verifies whether the object is null or not. 
		 * If an object is null, then assertion passes the test case, and the test 
		 * case is marked as "passed", and if an object is not null, then assertion 
		 * aborts the test case and the test case is marked as "failed".
		 * */

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://accounts.lambdatest.com/register");

		String currentURL = driver.getCurrentUrl();
		Thread.sleep(2000);

		//expected object to be null
		Assert.assertNull(null);
		
		System.out.println("The Current URL is - " + currentURL);
	} 
}
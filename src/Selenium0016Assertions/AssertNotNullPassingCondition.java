package Selenium0016Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertNotNullPassingCondition {
	public static void main(String[] args) throws InterruptedException {

		/* Assert Not Null
		 * The assertNotNull method is used for checking if a particular object is
		 * NULL or not. This method throws an assert if the object has some value 
		 * (i.e. it is not NULL). In case of an assert, the current test method is 
		 * aborted with an exception.
		 * */

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://accounts.lambdatest.com/register");

		String currentURL = driver.getCurrentUrl();
		Thread.sleep(2000);

		//getCurentUrl have string, so, it is not null
		Assert.assertNotNull("message", currentURL);
	} 
}
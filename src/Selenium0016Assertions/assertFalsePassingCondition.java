package Selenium0016Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assertFalsePassingCondition {
	public static void main(String[] args) throws InterruptedException {
		
		/* Assertion verifies the boolean value returned by a condition. 
		 * If the boolean value is false, then assertion passes the test case, 
		 * and if the boolean value is true, then assertion aborts the test case by an exception.
		 * */

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://accounts.lambdatest.com/register");

		WebElement checkbox = driver.findElement(By.xpath("//samp[contains(@class,'customcheckbox')]"));
		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000);");
		long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

		while (true) {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000);");
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
			Thread.sleep(2000);
			Thread.sleep(2000);

			long newHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
			if (newHeight == lastHeight) {
				break;
			}
			lastHeight = newHeight;
		}

		boolean checkBoxIsSelected = checkbox.isSelected();
		System.out.println("Is Checkbox selected - " + checkBoxIsSelected);
		
		/*----------------------------------------Assert False----------------------------------------------------*/
		//In this we apply assertfalse i.e. it acts reverse of assertrue
		Assert.assertFalse(checkBoxIsSelected);
		/*--------------------------------------------------------------------------------------------------------*/
	}  
}
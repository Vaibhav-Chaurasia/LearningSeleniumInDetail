package Selenium0006LocatorStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCssSelector {

	public static void main(String[] args) throws InterruptedException {

		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		String baseUrl = "https://accounts.lambdatest.com/register";
		driver.get(baseUrl);

		//Maximizing the window
		driver.manage().window().maximize();


		/*----------------------------------------------Normal CSS Selectors-------------------------------------------*/
		//By CSS ID Selector - 1st Example
		driver.findElement(By.cssSelector("input#phone")).sendKeys("9521457526");
		Thread.sleep(2000); //Pause or Wait for 2 seconds


		//By CSS ID Selector - 2nd Example in this we can remove htmltag
		driver.findElement(By.cssSelector("#phone")).sendKeys("9521457526");
		Thread.sleep(2000); //Pause or Wait for 2 seconds


		//By CSS Class Selector - 1st Example
		driver.findElement(By.cssSelector("samp.customcheckbox")).click();
		Thread.sleep(2000); //Pause or Wait for 2 seconds


		//By CSS Class Selector - 2nd Example - In this we can remove htmltag and take classes in continuos style
		//for e.g. .customcheckbox.w-20.h-20.inline-block.bg-white (It is known as cascaded classes)
		driver.findElement(By.cssSelector(".customcheckbox.w-20")).click();
		Thread.sleep(2000); //Pause or Wait for 2 seconds


		//By Attribute Selector - 1st example
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Vaibhav");
		Thread.sleep(2000); //Pause or Wait for 2 seconds


		//By Attribute Selector - 2nd example
		driver.findElement(By.cssSelector("input[id='name'][name='name']")).sendKeys(" Chaurasia");
		Thread.sleep(2000); //Pause or Wait for 2 seconds



		//By Class ID mix selectors
		driver.findElement(By.cssSelector("input.w-full.tracking-custom[name='email']")).sendKeys("vchaurasia@dminc.com");
		Thread.sleep(2000);
		/*-----------------------------------------------------------------------------------------------------------------*/



		//Scroll page to the bottom
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


		/*-----------------------------------------Dynamic Handling of CSS Selectors----------------------------------------*/
		/*---------------------------------------------Matching Selectors----------------------------------------------------*/
		//By using '^' selector i.e. Prefix - Starting text in CSS (It acts as starts-with from xpath style)
		driver.findElement(By.cssSelector("button[data-testid^='signup']")).click();
		Thread.sleep(2000); //Pause or Wait for 2 seconds


		//By using '$' selector i.e. Suffix - Ending text in CSS (It acts as ends-with from xpath style)
		driver.findElement(By.cssSelector("a[data-amplitude$='nin']")).click();
		Thread.sleep(2000); //Pause or Wait for 2 seconds
		driver.navigate().back();
		Thread.sleep(2000); //Pause or Wait for 2 seconds



		//By using '*' selector i.e. string matches - It acts as contains keyword in xpath
		driver.findElement(By.cssSelector("input[placeholder*='Full']")).sendKeys("Raghav");
		Thread.sleep(2000); //Pause or Wait for 2 seconds
		/*-----------------------------------------------------------------------------------------------------------------*/




		/*-------------------------------------Navigating Through Child Elements-------------------------------------------*/
		//By using Direct Child
		//Direct child to the parent locator is represented with a ‘>’ symbol
		driver.findElement(By.cssSelector("select.custom_select>option[value='44']")).click();
		Thread.sleep(2000); //Pause or Wait for 2 seconds


		//By using Sub Child or Child
		//Sub child identification includes the same way to identify the elements as that of the 
		//direct child but we can ignore ‘>’ symbol
		driver.findElement(By.cssSelector("select.custom_select option[value='376']")).click();
		Thread.sleep(2000); //Pause or Wait for 2 seconds



		//By using Nth Child For Opting A Specific Value From A List
		//N-th child concept would be useful while navigating through ordered or unordered list elements. 
		//N becomes the number of the desired list user wants to select.
		driver.findElement(By.cssSelector("select.custom_select>option:nth-of-type(54)")).click();
		Thread.sleep(2000);


		//In case user want to select specifically 1st element
		driver.findElement(By.cssSelector("select.custom_select>option:first-of-type")).click();
		Thread.sleep(2000);


		//In case user want to select specifically last element
		driver.findElement(By.cssSelector("select.custom_select>option:last-of-type")).click();
		Thread.sleep(2000);
	}
}
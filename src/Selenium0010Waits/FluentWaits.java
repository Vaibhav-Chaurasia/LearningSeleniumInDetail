package Selenium0010Waits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class FluentWaits {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty ("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		
		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		
		//get the actual value of the title
		aTitle = driver.getTitle();
		
		//compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle))
		{
			System.out.println( "Test Passed") ;
		}
		else {
			System.out.println( "Test Failed" );
		}

		/*
		 * The Fluent Wait in Selenium is used to define maximum time for the 
		 * web driver to wait for a condition, as well as the frequency with which 
		 * we want to check the condition before throwing an 
		 * “ElementNotVisibleException” exception. It checks for the web element 
		 * at regular intervals until the object is found or timeout happens.
		 * 
		 * Frequency: Setting up a repeat cycle with the time 
		 * frame to verify/check the condition at the regular interval of time
		 * 
		 * 
		 * Note - To fail the test case, change the xpath which is irrelevant and see the output
		 * */
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(Duration.ofSeconds(30)) 			
				.pollingEvery(Duration.ofSeconds(5))
				.withMessage("Waiting")
				.ignoring(NoSuchElementException.class);
		
		WebElement clickTheLink = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//a//i[@class='icon-suitcase']"));
			}
		});
		
		Thread.sleep(2000);
		clickTheLink.click();
	}

}

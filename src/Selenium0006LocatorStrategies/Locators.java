package Selenium0006LocatorStrategies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		String baseUrl = "https://accounts.lambdatest.com/register";
		driver.get(baseUrl);

		//Maximizing the window
		driver.manage().window().maximize();
		
		//By ID
		driver.findElement(By.id("name")).sendKeys("Vaibhav Chaurasia");
		Thread.sleep(2000); //Pause or Wait for 2 seconds

		
		//By name
		driver.findElement(By.name("email")).sendKeys("vchaurasia@dminc.com");
		Thread.sleep(2000); //Pause or Wait for 2 seconds
		
		
		//By Classname
		driver.findElement(By.className("customcheckbox")).click();
		Thread.sleep(2000); //Pause or Wait for 2 seconds
		
		
		//By LinkText
		driver.findElement(By.linkText("Privacy Policy")).click();
		Thread.sleep(2000); //Pause or Wait for 2 seconds
		
		
		/*---------------------------------------------------------------------------------------------------*/
		//Handling the new tabs of the window
		//Closing the new tabs and keeping the original tab opened at first time.
		String originalHandle = driver.getWindowHandle();

	    //Do something to open new tabs
	    for(String handle : driver.getWindowHandles()) {
	        if (!handle.equals(originalHandle)) {
	            driver.switchTo().window(handle);
	            driver.close();
	        }
	    }

	    driver.switchTo().window(originalHandle);
	    /*---------------------------------------------------------------------------------------------------*/
		
		Thread.sleep(2000); //Pause or Wait for 2 seconds
		
		
		//By PartialLinkText
		driver.findElement(By.partialLinkText("Policy")).click();
		Thread.sleep(2000); //Pause or Wait for 2 seconds
		
		
		/*---------------------------------------------------------------------------------------------------*/
		//Handling the new tabs of the window
		//Closing the new tabs and keeping the original tab opened at first time.
		String originalHandle1 = driver.getWindowHandle();

	    //Do something to open new tabs
	    for(String handle : driver.getWindowHandles()) {
	        if (!handle.equals(originalHandle1)) {
	            driver.switchTo().window(handle);
	            driver.close();
	        }
	    }

	    driver.switchTo().window(originalHandle1);
	    /*---------------------------------------------------------------------------------------------------*/
		
	    Thread.sleep(2000); //Pause or Wait for 2 seconds
	    
		
		//By Tagname
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    for(int i = 0; i < links.size(); i++) {
	    	System.out.println(links.get(i).getText());
	    }
	    
	    
	    Thread.sleep(2000); //Pause or Wait for 2 seconds
	    
	    
	    //By CSS Selector
	    driver.findElement(By.cssSelector("input#phone")).sendKeys("9521457526");
	    Thread.sleep(2000); //Pause or Wait for 2 seconds
	    
	    
	    
	    //By Xpath
	    driver.findElement(By.xpath("//input[@id='userpassword' and @name='password']")).sendKeys("Vaibhav1234");
	}
}
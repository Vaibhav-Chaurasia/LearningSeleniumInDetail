package Selenium0007WebDriverInterface;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowHandlesUsingSet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);

		String baseUrl = "https://www.browserstack.com/";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		String title = driver.getTitle(); System.out.println(title);

		JavascriptExecutor js = (JavascriptExecutor) driver; 
		driver.findElement(By.xpath("//span[contains(text(),'Test on iPhone')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'visit this page')]")).click();
		js.executeScript("window.scrollBy(0,40)"); 

		Set<String> windows = driver.getWindowHandles(); 
		System.out.println(windows);
		System.out.println("a1"); 
		
		for (String window : windows) 
		{ 
			driver.switchTo().window(window); 
			if (driver.getTitle().contains("Most Reliable App & Cross Browser Testing Platform | Browserstack")) 
			{ 
				System.out.println("a2"); 
				js.executeScript("window.scrollBy(0,1000)"); 
				System.out.println("b1");
				driver.findElement(By.xpath("//a[@id='logo']//*[local-name()='svg']")).click();

				driver.findElement(By.xpath("//a[@id='signupModalButton']")).click(); 
				driver.manage().window().setPosition(new Point(2000, 0)); 
			} 
		} 
		
		Thread.sleep(3000); 
		
		Set<String> windows1 = driver.getWindowHandles(); 
		System.out.println(windows1); 
		System.out.println("a3"); 
		
		for (String window : windows1) 
		{ 
			driver.switchTo().window(window); 
			System.out.println("a4"); 
			js.executeScript("window.scrollBy(0,400)"); 
		} 
	} 
}
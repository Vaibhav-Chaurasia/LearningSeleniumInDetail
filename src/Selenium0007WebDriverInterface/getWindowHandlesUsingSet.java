package Selenium0007WebDriverInterface;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getWindowHandlesUsingSet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);

		String baseUrl = "https://accounts.lambdatest.com/register";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Privacy Policy")).click();
		Thread.sleep(2000);

		String currentwindow = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		Iterator<String> i = allWindows.iterator();
		
		while(i.hasNext()){
			String childwindow = i.next();
			
			if(!childwindow.equalsIgnoreCase(currentwindow)){
				driver.switchTo().window(childwindow);
				System.out.println("The child window is " + childwindow);
			} 
			
			else {
				System.out.println("There are no children");
			}
		}
		driver.quit();
	}
}
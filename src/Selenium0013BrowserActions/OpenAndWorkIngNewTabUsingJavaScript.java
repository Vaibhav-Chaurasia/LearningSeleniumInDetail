package Selenium0013BrowserActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAndWorkIngNewTabUsingJavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		String a = "window.open('https://accounts.lambdatest.com/login','_blank');";  // replace link with your desired link
		((JavascriptExecutor)driver).executeScript(a);

		Thread.sleep(3000);

		String originalHandle = driver.getWindowHandle();

		//Do something to open new tabs
		for(String handle : driver.getWindowHandles()) {
			if (!handle.equals(originalHandle)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vaicha.oracle@gmail.com");
			}
		}
	}
}
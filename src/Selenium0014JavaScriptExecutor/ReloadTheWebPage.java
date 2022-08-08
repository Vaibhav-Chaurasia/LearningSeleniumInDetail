package Selenium0014JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReloadTheWebPage {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.browserstack.com");
		
		Thread.sleep(2000);
		
		js.executeScript("location.reload()"); //reload to refresh
		Thread.sleep(2000);
		
		js.executeScript("history.go(0)"); //takes to the specific history and refresh
	}
}
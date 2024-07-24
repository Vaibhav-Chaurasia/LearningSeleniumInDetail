package Selenium0013BrowserActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAndWorkingInNewWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");


		// A new window is opened and switches to it
		driver.switchTo().newWindow(WindowType.WINDOW);

		// Loads Lambda Test open source website in the newly opened window
		driver.get("https://accounts.lambdatest.com/login");	
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vaicha.oracle@gmail.com");
		
		Thread.sleep(2000);

		String originalHandle = driver.getWindowHandle();
		driver.switchTo().window(originalHandle);
		
		//Do something to open new tabs
		for(String handle : driver.getWindowHandles()) {
			if (!handle.equals(originalHandle)) {
				driver.switchTo().window(handle);
			}
		}
		
//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
	}
}
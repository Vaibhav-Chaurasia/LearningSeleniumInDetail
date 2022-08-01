package Selenium0007WebDriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/register";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Privacy Policy")).click();
		Thread.sleep(2000);


		String originalHandle = driver.getWindowHandle(); //This function deals with single tab or window.
		driver.switchTo().window(originalHandle);

		for(String handle : driver.getWindowHandles()) { //This handles the multiple windows or tabs in the active session.
			if (!handle.equals(originalHandle)) {

				driver.switchTo().window(handle);

				driver.findElement(By.xpath("//span[text()='Allow Cookie']")).click();
				scrollPageToBottom(driver);
				Thread.sleep(2000);

				driver.findElement(By.xpath("//a[@href='https://www.facebook.com/lambdatest/']")).click();
				Thread.sleep(2000);

				driver.close();
			}
		}
	}

	public static void scrollPageToBottom(WebDriver driver) {
		try {
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
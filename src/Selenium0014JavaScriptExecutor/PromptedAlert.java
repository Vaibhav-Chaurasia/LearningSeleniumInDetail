package Selenium0014JavaScriptExecutor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptedAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");	
		driver.manage().window().maximize();

		Thread.sleep(2000);

		/*---------------------------------------Prompted Alert----------------------------------------------------*/
		WebElement element = driver.findElement(By.id("promtButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		Thread.sleep(2000);

		Alert promptAlert  = driver.switchTo().alert();
		String alertText = promptAlert.getText();
		System.out.println("Alert text is " + alertText);
		Thread.sleep(2000);

		//Send some text to the alert
		promptAlert.sendKeys("Test User");
		Thread.sleep(2000);

		promptAlert.accept();
		/*--------------------------------------------------------------------------------------------------------*/
	}
}
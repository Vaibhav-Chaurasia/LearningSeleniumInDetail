package Selenium0014JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollInBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.get("https://www.lambdatest.com/");


		/*-------------------------------------------------Scroll to the Bottom-------------------------------------*/
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
		/*----------------------------------------------------------------------------------------------------------*/


		Thread.sleep(2000);


		/*------------------------------------------Scroll to the Top-----------------------------------------------*/
		JavascriptExecutor scrollToTop = (JavascriptExecutor) driver;
		scrollToTop.executeScript("window.scrollTo(0,0)", "");
		/*----------------------------------------------------------------------------------------------------------*/


		Thread.sleep(5000);


		/*-------------------------------------------------Scroll upto the Element-------------------------------------*/
		WebElement text = driver.findElement(By.xpath("//h2[text()='Powerful Cloud Testing Platform to Accelerate Your Go-To-Market']"));
		JavascriptExecutor scrollUptoElement = (JavascriptExecutor)driver;
		scrollUptoElement.executeScript("arguments[0].scrollIntoView();", text);
		Thread.sleep(500);
		System.out.println(text.getText());
		/*----------------------------------------------------------------------------------------------------------*/
	}
}
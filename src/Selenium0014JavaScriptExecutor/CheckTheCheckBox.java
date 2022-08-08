package Selenium0014JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTheCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.get("https://accounts.lambdatest.com/register");

		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('i_agree').checked=true;");
	}
}
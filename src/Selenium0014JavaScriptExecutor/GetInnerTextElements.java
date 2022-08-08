package Selenium0014JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetInnerTextElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://accounts.lambdatest.com/register");
		Thread.sleep(2000);
		
		//Inner HTML with specific string using tagname and index
		String documentTitleViaInnerHTML = (String) js.executeScript("return document.getElementsByTagName('title')[0].innerHTML;");
		System.out.println(documentTitleViaInnerHTML);
		
		System.out.println("\n\n");
		
		//Inter HTML with all text on the webpage.
		String innerHTML = (String) js.executeScript("return document.documentElement.innerText;");
		System.out.println(innerHTML);
	}
}
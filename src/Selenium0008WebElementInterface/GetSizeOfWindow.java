package Selenium0008WebElementInterface;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeOfWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		Dimension dimensionWhenNormal = driver.manage().window().getSize(); //This function fetches height and width of window.
		System.out.println("Width on normal window : " + dimensionWhenNormal.width);
		System.out.println("Height on normal window : " + dimensionWhenNormal.height);
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Dimension dimensionWhenMaximized = driver.manage().window().getSize();
		System.out.println("Width after maximized window : " + dimensionWhenMaximized.width);
		System.out.println("Height after maximized window : " + dimensionWhenMaximized.height);
	}
}
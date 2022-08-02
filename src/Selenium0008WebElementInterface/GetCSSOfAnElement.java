package Selenium0008WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSOfAnElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement rememberMe = driver.findElement(By.xpath("//input[@type='checkbox']"));

		String fontSize = rememberMe.getCssValue("font-size"); //This returns the css value. For e.g. font-size, margins etc.
		System.out.println("Value of Font Size - " + fontSize);

		String position = rememberMe.getCssValue("position");
		System.out.println("Value of position - " + position);
		
		String top = rememberMe.getCssValue("top");
		System.out.println("Value of top - " + top);
	}
}
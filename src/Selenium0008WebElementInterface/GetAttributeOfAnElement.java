package Selenium0008WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeOfAnElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement rememberMe = driver.findElement(By.xpath("//input[@type='checkbox']"));

		String typeValue = rememberMe.getAttribute("type"); //This returns the attribute value. For e.g. type=checkbox in html code
		System.out.println("Value of type attribute: " + typeValue);

		String classValue = rememberMe.getAttribute("class");
		System.out.println("Value of class attribute: " + classValue);
	}
}
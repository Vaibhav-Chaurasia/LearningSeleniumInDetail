package Selenium0008WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationOfAnElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement rememberMe = driver.findElement(By.xpath("//input[@type='checkbox']"));
		rememberMe.click();

		System.out.println("Location of X - " + rememberMe.getLocation().getX()); //It returns the position of an element on x-axis
		System.out.println("Location of Y - " + rememberMe.getLocation().getY()); //It returns the position of an element on y-axis
	}
}
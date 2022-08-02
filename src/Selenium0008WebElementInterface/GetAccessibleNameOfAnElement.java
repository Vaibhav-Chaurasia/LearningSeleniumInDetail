package Selenium0008WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAccessibleNameOfAnElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement rememberMe = driver.findElement(By.xpath("//input[@type='checkbox']"));
		String rememberMeText = rememberMe.getAccessibleName(); //This function extracts the text of an element as it is mentioned.
		System.out.println("Remember Me text is - " + rememberMeText);

		WebElement loginButton  = driver.findElement(By.xpath("//button[@id='login-button']"));
		String loginButtonText = loginButton.getAccessibleName();
		System.out.println("Login button text is - " + loginButtonText);
	}
}
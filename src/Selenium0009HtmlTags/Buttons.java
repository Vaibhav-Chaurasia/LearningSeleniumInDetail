package Selenium0009HtmlTags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement loginButton  = driver.findElement(By.xpath("//button[@id='login-button']"));
		String loginButtonText = loginButton.getAccessibleName();
		System.out.println("Login button text is - " + loginButtonText);
		
		Thread.sleep(2000);
		loginButton.click();
		
		String loginButtonAriaRole = loginButton.getAriaRole();
		System.out.println("Login button Aria Role is - " + loginButtonAriaRole);
		Thread.sleep(2000);
		
		String loginTagName = loginButton.getTagName();
		System.out.println("Login button Tag Name  is - " + loginTagName);
		
		
		//These are some operations we can perform with buttons, there are such more functions we can try.
	}
}
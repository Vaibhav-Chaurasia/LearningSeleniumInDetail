package Selenium0008WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAriaLabelOfAnElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement rememberMe = driver.findElement(By.xpath("//input[@type='checkbox']"));
		String rememberMeAriaRole = rememberMe.getAriaRole(); //This function tells us about the type of HTML element i.e. button, checkbox, link etc.
		System.out.println("Remember Me text is - " + rememberMeAriaRole);

		WebElement loginButton  = driver.findElement(By.xpath("//button[@id='login-button']"));
		String loginButtonAriaRole = loginButton.getAriaRole(); //This function tells us about the type of HTML element i.e. button, checkbox, link etc.
		System.out.println("Login button text is - " + loginButtonAriaRole);
		
		
		WebElement forgotPassword  = driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
		String forgotPasswordAriaRole = forgotPassword.getAriaRole(); //This function tells us about the type of HTML element i.e. button, checkbox, link etc.
		System.out.println("Login button text is - " + forgotPasswordAriaRole);
	}
}
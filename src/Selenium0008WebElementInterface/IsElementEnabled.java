package Selenium0008WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementEnabled {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement loginButton = driver.findElement(By.xpath("//button[@id='login-button']"));
		//loginButton.click();

		boolean isLoginButtonActive = loginButton.isEnabled(); //It verifies the state of an element.
		System.out.println("Is Login button active - " + isLoginButtonActive);

		if(isLoginButtonActive == false) {
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vaicha.oracle@gmail.com");
			Thread.sleep(2000); //Pause or Wait for 2 seconds

			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vaibhav1234");
		}

		else {
			loginButton.click();
			System.out.println("Login Button is clicked.");
		}
	}
}
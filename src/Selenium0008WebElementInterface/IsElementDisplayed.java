package Selenium0008WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementDisplayed {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/register";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement passwordField = driver.findElement(By.xpath("//input[@id='userpassword' and @name='password']"));

		boolean isPasswordFieldDisplayed = passwordField.isDisplayed(); //It verifies the presence of an element.
		System.out.println("Password field is displayed - " + isPasswordFieldDisplayed);

		if(isPasswordFieldDisplayed == true) {
			passwordField.sendKeys("Vaibhav1234");
		}
	}
}
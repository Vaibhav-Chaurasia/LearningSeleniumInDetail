package Selenium0008WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitTheForm {

	/* The click() and submit() functions are quite similar in terms of functionalities. However there are minor differences.
	 * 
	 * The submit() function is applicable only for <form> and makes handling of form easier. 
	 * It can be used with any element inside a form. if a button is outside <form>, 
	 * then submit() will not work.
	 * 
	 * 
	 * The click() is only applicable to all elements which is clickable like radiobutton, 
	 * checkbox or textbox irrespective of the fact that the element is inside or outside of <form>.
	 * 
	 * 
	 * The submit() function shall wait for the page to load 
	 * click() waits only if any explicit wait condition is provided.
	 * */

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement email  = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("vaicha.oracle@gmail.com");
		Thread.sleep(2000);

		WebElement password  = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Vaibhav1234");
		Thread.sleep(2000);

		WebElement loginButton  = driver.findElement(By.xpath("//button[@id='login-button']"));
		loginButton.submit();
	}
}
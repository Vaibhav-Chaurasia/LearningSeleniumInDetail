package Selenium0008WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsCheckboxSelected {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement rememberMe = driver.findElement(By.xpath("//input[@type='checkbox']"));
		rememberMe.click();

		boolean isRememberMeChecked = rememberMe.isSelected(); //It verifies the presence of an element.
		System.out.println("Remember me check box selected - " + isRememberMeChecked);
		Thread.sleep(2000);

		if(isRememberMeChecked == true) {
			rememberMe.click();
			Thread.sleep(2000);
			System.out.println("Checkbox becomes unchecked");
		}
		
		else {
			rememberMe.click();
			Thread.sleep(2000);
			System.out.println("Checkbox becomes checked");
		}
	}
}

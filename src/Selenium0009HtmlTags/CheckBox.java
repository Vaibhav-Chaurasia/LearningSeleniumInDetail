package Selenium0009HtmlTags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		/*Checkbox - User can select multiple option from the multiple options.*/
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement rememberMe = driver.findElement(By.xpath("//input[@type='checkbox']"));
		String rememberMeText = rememberMe.getAccessibleName(); //This function extracts the text of an element as it is mentioned.
		System.out.println("Remember Me text is - " + rememberMeText);
		
		Thread.sleep(2000);
		rememberMe.click();
		
		String rememberMeAriaRole = rememberMe.getAriaRole();
		System.out.println("Remember Me Aria Role is - " + rememberMeAriaRole);
		Thread.sleep(2000);
		
		String rememberMeTagName = rememberMe.getTagName();
		System.out.println("Remember Me Tag Name  is - " + rememberMeTagName);
	}
}
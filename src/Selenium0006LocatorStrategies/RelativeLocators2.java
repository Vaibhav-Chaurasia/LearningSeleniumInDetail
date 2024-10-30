package Selenium0006LocatorStrategies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RelativeLocators2 {
	public static void main(String[] args) throws InterruptedException {

		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);


		String baseUrl = "https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(baseUrl);

		//Maximizing the window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
		

		List<WebElement> abc = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li//a"));
		
		Thread.sleep(2000);
		
		System.out.println("abc");
		
		for(int i = 0; i < 3; i++) {
			System.out.println(abc.get(i).getText());
			Thread.sleep(2000);
			abc.get(1).click();
		}
		
	}
}
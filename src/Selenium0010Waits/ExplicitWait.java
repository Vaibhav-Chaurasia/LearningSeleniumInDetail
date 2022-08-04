package Selenium0010Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty ("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String eTitle = "Demo Guru99 Page";
		String aTitle = "";
		
		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		
		//get the actual value of the title
		aTitle = driver.getTitle();
		
		//compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle))
		{
			System.out.println( "Test Passed");
		}
		else {
			System.out.println( "Test Failed");
		}
		
		driver.findElement(By.xpath("//a[text()='Insurance Project']")).click();
		
		
		//Explicit wait - Explicit wait, waits for specific time given, then throws the error for this specific element
		//Note - To pass the test case, click on close button manually.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		@SuppressWarnings("unused")
		WebElement loginHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Login']")));
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
}
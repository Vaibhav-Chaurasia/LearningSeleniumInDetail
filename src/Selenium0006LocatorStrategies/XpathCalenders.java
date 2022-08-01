package Selenium0006LocatorStrategies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCalenders {

	public static void main(String[] args) throws InterruptedException {

		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html";
		driver.get(baseUrl);

		//Maximizing the window
		driver.manage().window().maximize();

		/*---------------------------------Finding Date in Calender using WebTable style---------------------------------*/
		// click on date picker so that we can get the calendar in view 
		driver.findElement(By.id("datepicker")).click();

		// this will find all matching nodes in calendar		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		// now we will iterate all values and will capture the text. We will select when date is 28
		for(WebElement ele : allDates)
		{
			String date=ele.getText();

			// once date is 28 then click and break
			if(date.equalsIgnoreCase("28"))
			{
				ele.click();
				break;
			}
		}
		/*------------------------------------------------------------------------------------------------------------------*/


		Thread.sleep(2000);


		/*------------------You can find the dates using XPath or CSSSelector and click on the dates directly.---------------*/
		// click on date picker so that we can get the calendar in view
		driver.findElement(By.id("datepicker")).click();

		// this will find all matching nodes in calendar
		@SuppressWarnings("unused")
		List<WebElement> allDates1 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		// Click on date 28 or any other date of your choice
		driver.findElement(By.xpath("//a[text()='29']")).click();
		/*------------------------------------------------------------------------------------------------------------------*/
	}
}
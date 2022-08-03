package Selenium0009HtmlTags;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFields {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html";
		driver.get(baseUrl);

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


		//This code clear the data inside input field.
		driver.findElement(By.xpath("//input[@id='datepicker']")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/01/2022");
	}
}

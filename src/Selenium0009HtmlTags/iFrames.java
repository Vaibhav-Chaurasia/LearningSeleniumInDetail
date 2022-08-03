package Selenium0009HtmlTags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * iFrame in Selenium Webdriver is a web page or an inline frame which is 
		 * embedded in another web page or an HTML document embedded inside another 
		 * HTML document. 
		 * 
		 * The iframe is often used to add content from other sources 
		 * like an advertisement into a web page. 
		 * 
		 * The iframe is defined with the <iframe> tag.
		 * */

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://demo.guru99.com/test/guru99home/";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		/*-------------------------------Switching the frame via ID------------------------------------------*/
		driver.switchTo().frame("a077aa5e"); //switching the frame by ID

		Thread.sleep(2000);

		System.out.println("********We are switch to the iframe*******");
		Thread.sleep(2000);

		driver.findElement(By.xpath("html/body/a/img")).click();
		/*---------------------------------------------------------------------------------------------------*/
	}
}
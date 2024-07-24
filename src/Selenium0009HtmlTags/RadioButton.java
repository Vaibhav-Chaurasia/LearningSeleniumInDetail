package Selenium0009HtmlTags;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		/*Radio button - User can only select one option from the multiple options.*/

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://watir.com/examples/forms_with_input_elements.html";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);


		/*-----------------------------------------Scroll the Page-------------------------------------------------------*/
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000);");
		long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

		while (true) {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000);");
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
			Thread.sleep(2000);
			Thread.sleep(2000);

			long newHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
			if (newHeight == lastHeight) {
				break;
			}
			lastHeight = newHeight;
		}
		/*-----------------------------------------------------------------------------------------------------------------*/

		driver.findElement(By.xpath("//input[@id='new_user_newsletter_yes']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='new_user_newsletter_no']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='certainly']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='new_user_newsletter_probably']")).click();
		Thread.sleep(2000);

		WebElement radioButtonNone = driver.findElement(By.xpath("//input[@id='new_user_newsletter_nah']"));
		boolean radioButtonStatus = radioButtonNone.isEnabled();
		System.out.println("Is Radio button clickable - " + radioButtonStatus);
		System.out.println("The Radiobutton aria-role is - " + radioButtonNone.getAriaRole());
		System.out.println("The Radiobutton Tag Name is - " + radioButtonNone.getTagName());
	}
}
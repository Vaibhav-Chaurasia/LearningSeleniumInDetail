package Selenium0009HtmlTags;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextArea {

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

		WebElement textArea = driver.findElement(By.xpath("//textarea[@id='delete_user_comment']"));
		textArea.sendKeys("Comment for better reach.");
		Thread.sleep(2000);

		textArea.clear();

		System.out.println("The textArea name is - " + textArea.getText());
		System.out.println("The textArea aria-role is - " + textArea.getAriaRole());
		System.out.println("The textArea Tag Name is - " + textArea.getTagName());
	}
}
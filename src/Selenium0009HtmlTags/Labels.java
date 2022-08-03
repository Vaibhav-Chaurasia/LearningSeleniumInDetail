package Selenium0009HtmlTags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Labels {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);


		/*Label the the HTML tags used to identify the fields properly and it have read only features*/
		WebElement checkBoxLabel = driver.findElement(By.xpath("//span[text()='Remember Me']"));
		System.out.println("The Label name is - " + checkBoxLabel.getText());
		System.out.println("The Label aria-role is - " + checkBoxLabel.getAriaRole());
		System.out.println("The Label Tag Name is - " + checkBoxLabel.getTagName());
		
		
		//These are some operations we can perform with labels, there are such more functions we can try.
	}
}
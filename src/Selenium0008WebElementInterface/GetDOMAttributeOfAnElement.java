package Selenium0008WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDOMAttributeOfAnElement {
	
	/* The most recent version of Selenium 3 had the getAttribute() method, 
	 * however it did not actually retrieve the Attribute value. 
	 * The previous getAttribute() method figured out what the user was most 
	 * likely interested in between the Attribute value and the Property values and returned it.
	 * 
	 * Since an element attribute is different from an element property, the W3C WebDriver specification 
	 * requires different implementations. Thanks to this, two new methods have been created for Selenium 4: 
	 * getDomAttribute() and getDomProperty().
	 * 
	 * Most of the time these two methods return the same thing (especially in Java where getDomProperty()
	 * is returned as a String value). You will find some code examples below, showing when you might want 
	 * to use which method. Note that getAttribute() is still available for backwards compatibility, 
	 * but is implemented by sending a large blob of JavaScript to the remote endpoint. Where possible, 
	 * it is recommended to use one of the new methods for performance and precision.
	 * */

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement rememberMe = driver.findElement(By.xpath("//input[@type='checkbox']"));

		String typeValue = rememberMe.getDomAttribute("type"); //This returns the attribute value. For e.g. type=checkbox in html code
		System.out.println("Value of type attribute: " + typeValue);

		
	}
}
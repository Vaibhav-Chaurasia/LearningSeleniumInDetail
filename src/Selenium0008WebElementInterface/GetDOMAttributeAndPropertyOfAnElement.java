package Selenium0008WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDOMAttributeAndPropertyOfAnElement {

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
	 * to use which method. 
	 * 
	 * Note that getAttribute() is still available for backwards compatibility, 
	 * but is implemented by sending a large blob of JavaScript to the remote endpoint. 
	 * 
	 * Where possible, 
	 * it is recommended to use one of the new methods for performance and precision.
	 * 
	 * 
	 * What is the difference between the HTML element attribute and DOM property?
	 * The Attributes are defined by HTML whereas the properties are defined by the DOM.
	 * 
	 * The attribute’s main role is to initializes the DOM properties. 
	 * So, once the DOM initialization complete, the attributes job is done.
	 * 
	 * Property values can change, whereas the attribute values can never be changed.
	 * */

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://watir.com/examples/forms_with_input_elements.html";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		/*--------------A case where getDomProperty() returns false and getDomAttribute() returns null--------------------*/
		WebElement bookCheckbox = driver.findElement(By.id("new_user_interests_books"));
		
		//Value showing checked in html checked attribute
		System.out.println("Simple GetAttribute Function - " + bookCheckbox.getAttribute("checked"));
		
		//Value showing checked in html checked attribute
		System.out.println("DOM Property Function output - " + bookCheckbox.getDomProperty("checked"));
		
		
		//Just for understanding
//		Assert.assertEquals("true", element1.getAttribute("checked"));
//		Assert.assertEquals("true", element1.getDomProperty("checked"));

		bookCheckbox.click();
		Thread.sleep(2000);
		
		//Checkbox unchecked i.e. now on the page checkbox is unchecked but still the value in attribute is not changing
		System.out.println("Simple GetAttribute Function output after checking the checkbox - " + bookCheckbox.getAttribute("checked"));
		
		//Checkbox unchecked i.e. now on the page checkbox is unchecked. So, it is taking original state.
		System.out.println("DOM Property Function output after checking the checkbox - " + bookCheckbox.getDomProperty("checked"));
		
		
		//Just for understanding
//		Assert.assertNull(element1.getAttribute("checked"));
//		Assert.assertEquals("false", element1.getDomProperty("checked"));
		/*-----------------------------------------------------------------------------------------------------------------*/
		
		
		System.out.println("\n");

		/*---------------------getDomProperty() boolean result updates but getDomAttribute() does not-----------------------*/
		WebElement occupation = driver.findElement(By.id("new_user_occupation"));
		
		//When page loads, original value is "Developer", and in html attribute value is developer, so it is showing the same.
		System.out.println("Simple GetAttribute Function output - " + occupation.getAttribute("value"));
		
		//When page loads, original value is "Developer", and in html attribute value is developer, so it is showing the same.
		System.out.println("DOM Attribute Function output - " + occupation.getDomAttribute("value"));
		
		//When page loads, original value is "Developer", and in html attribute value is developer, so it is showing the same.
		System.out.println("DOM Property Function output - " + occupation.getDomProperty("value"));

		
		//Just for understanding
//		Assert.assertEquals("Developer", element.getAttribute("value"));
//		Assert.assertEquals("Developer", element.getDomAttribute("value"));
//		Assert.assertEquals("Developer", element.getDomProperty("value"));

		occupation.clear();
		Thread.sleep(2000);
		
		occupation.sendKeys("Engineer");
		Thread.sleep(2000);
		
		//Value changes to engineer, so, attribute updates their value.
		System.out.println("Simple GetAttribute Function output after changing the text - " + occupation.getAttribute("value"));
		
		//Value changes to engineer, so, dom attribute not able to update their value, because still value of html attribute is same.
		System.out.println("DOM Attribute Function output after changing the text - " + occupation.getDomAttribute("value"));
		
		//Value changes to engineer, so, property updates their value as per value updates on the html page.
		System.out.println("DOM Property Function output after changing the text - " + occupation.getDomProperty("value"));

		
		//Just for understanding
//		Assert.assertEquals("Engineer", element.getAttribute("value"));
//		Assert.assertEquals("Developer", element.getDomAttribute("value"));
//		Assert.assertEquals("Engineer", element.getDomProperty("value"));
		/*-----------------------------------------------------------------------------------------------------------------*/
	}
}
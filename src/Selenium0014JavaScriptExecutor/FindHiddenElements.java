package Selenium0014JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindHiddenElements {

	/* We can interact with hidden elements in Selenium Webdriver. 
	 * The hidden elements are the ones that are present in the 
	 * DOM but not visible on the page. Mostly the hidden elements are 
	 * defined by the CSS property style="display:none;". 
	 * In case an element is a part of the form tag, 
	 * it can be hidden by setting the attribute type to the value hidden.
	 * 
	 * 
	 * Selenium by default cannot handle hidden elements and throws 
	 * ElementNotVisibleException while working with them. Javascript Executor 
	 * is used to handle hidden elements on the page. Selenium runs the Javascript 
	 * commands with the executeScript method. The commands to be run are 
	 * passed as arguments to the method.
	 * 
	 * 
	 * First of all, the getElementById method can be used to identify 
	 * the element. Next to enter text to the field, the 
	 * value method is used to set value to the field.*/

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://courses.letskodeit.com/practice");
		Thread.sleep(2000);


		// identify element and click
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);

		// identify element and set value
		js.executeScript("document.getElementById('displayed-text').value='Selenium';");
		Thread.sleep(2000);

		String valueEntered = (String) js.executeScript("return document.getElementById('displayed-text').value");
		System.out.print("Value entered in hidden field: " + valueEntered);
	}
}
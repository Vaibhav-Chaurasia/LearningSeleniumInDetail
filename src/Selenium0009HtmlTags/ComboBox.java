package Selenium0009HtmlTags;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComboBox {

	public static void main(String[] args) throws InterruptedException {
		/* A combo box is a combination of an input text field and a list of options. 
		 * You can type in stuff in the input field and the list should 
		 * update to highlight a possible match
		 * 
		 * Combo Box:
		 * 1. Occupies less space but shows only one value for visibility
		 * 2. Multiple select is not possible
		 * 3. can't use checkboxes within combo boxes
		 * */

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://webkit.org/blog-files/aria1.0/combobox_with_live_region_status.html";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);


		/*--------------------------------Editable Combobox with Autocomplete--------------------------------------*/
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("A");

		List<WebElement> autoSuggestStates = driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='option']"));
		Thread.sleep(2000);

		for(int i = 0; i < autoSuggestStates.size(); i++) {
			System.out.println("State - " + autoSuggestStates.get(i).getText());

			if (autoSuggestStates.get(i).getText().equalsIgnoreCase("Alaska")) {
				autoSuggestStates.get(i).click();
				break;
			}
		}
		/*---------------------------------------------------------------------------------------------------------*/
		
		Thread.sleep(3000);
		
		/*---------------Editable Combobox With Both List and Inline Autocomplete Example---------------------------*/
		driver.navigate().to("https://w3c.github.io/aria-practices/examples/combobox/combobox-autocomplete-both.html");
		Thread.sleep(2000);
		
		
		//Scroll page till element visible
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h2[@id='ex_label']")));
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@id='cb1-input']")).click();

		List<WebElement> StateList = driver.findElements(By.xpath("//ul[@id='cb1-listbox']//li[@role='option']"));
		Thread.sleep(2000);

		for(int i = 0; i < StateList.size(); i++) {
			System.out.println("State - " + StateList.get(i).getText());

			if (StateList.get(i).getText().equalsIgnoreCase("Arizona")) {
				StateList.get(i).click();
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='cb1-input']")).clear();
		/*---------------------------------------------------------------------------------------------------------*/
	}
}
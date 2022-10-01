package Selenium0009HtmlTags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {

		/*A dropdown is just a list of options that drops down when you click on the arrow button. 
		 * You can only choose from a list of predefined options*/

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/register";
		driver.get(baseUrl);

		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("select.custom_select>option[value='44']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("select.custom_select option[value='376']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("select.custom_select>option:nth-of-type(54)")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("select.custom_select>option:first-of-type")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("select.custom_select>option:last-of-type")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//select[@data-testid='country_code']")).click();

		WebElement dropDown  = driver.findElement(By.xpath("//select[@data-testid='country_code']"));
		String dropDownText = dropDown.getAccessibleName();
		System.out.println("Dropdown text is - " + dropDownText);

		Thread.sleep(2000);
		dropDown.click();

		String dropDownAriaRole = dropDown.getAriaRole();
		System.out.println("Dropdown Aria Role is - " + dropDownAriaRole);
		Thread.sleep(2000);

		String dropDownTagName = dropDown.getTagName();
		System.out.println("Dropdown Tag Name  is - " + dropDownTagName);
		
		
//		Using Select Method for dropdown and Multilist as well
//		System.out.println("Selecting options from dropdown");
//
//		WebElement priceDropdown = driver.findElement(By.cssSelector("div[class='_2b0bUo']>div[class='_3uDYxP']>select"));
//		Select priceFromDropdown = new Select(priceDropdown);
//		priceFromDropdown.selectByIndex(2);
//		priceFromDropdown.selectByVisibleText("Option 2");
//		priceFromDropdown.selectByValue("selenium");
	}
}
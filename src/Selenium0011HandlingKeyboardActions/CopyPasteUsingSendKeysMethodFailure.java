package Selenium0011HandlingKeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteUsingSendKeysMethodFailure {
	public static void main(String[] args) {

		System.setProperty ("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//Navigate to the demo site
		driver.get("https://demoqa.com/text-box");

		// Enter the Full Name
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Mr.Peter Haynes");

		//Enter the Email
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("PeterHaynes@toolsqa.com");

		// Enter the Current Address
		WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("43 School Lane London EC71 9GO");

		// Copy the Current Address
		currentAddress.sendKeys(Keys.CONTROL);
		currentAddress.sendKeys("A");
		currentAddress.sendKeys(Keys.CONTROL);
		currentAddress.sendKeys("C");

		//Press the TAB Key to Switch Focus to Permanent Address
		currentAddress.sendKeys(Keys.TAB);

		//Paste the Address in the Permanent Address field
		WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
		permanentAddress.sendKeys(Keys.CONTROL);
		permanentAddress.sendKeys("V");
		
		
		/*
		 * Note - In the above code snippet, though the sendKeys() method of WebElementallows 
		 * using the Control Key, it cannot do the copy and paste action, as it 
		 * fails to combine the key sequences.
		 * 
		 * As we can see from the following screenshot, 
		 * instead of pasting the content of Current Address in the Permanent Address text field, 
		 * it just pasted the character "V".
		 * */
	}
}
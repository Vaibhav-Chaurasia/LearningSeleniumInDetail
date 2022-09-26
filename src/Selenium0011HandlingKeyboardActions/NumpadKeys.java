package Selenium0011HandlingKeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NumpadKeys {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	       
        //Navigate to the demo site
        driver.get("https://demoqa.com/text-box");
        
        //Create object of the Actions class
        Actions actions = new Actions(driver);
      
        @SuppressWarnings("unused")
		WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        actions.keyDown(Keys.NUMPAD0).build().perform();
        actions.keyDown(Keys.NUMPAD1).build().perform();
        actions.keyDown(Keys.NUMPAD2).build().perform();
        actions.keyDown(Keys.NUMPAD3).build().perform();
        actions.keyDown(Keys.NUMPAD4).build().perform();
        actions.keyDown(Keys.NUMPAD5).build().perform();
        actions.keyDown(Keys.NUMPAD6).build().perform();
        actions.keyDown(Keys.NUMPAD7).build().perform();
        actions.keyDown(Keys.NUMPAD8).build().perform();
        actions.keyDown(Keys.NUMPAD9).build().perform();
        
        
//      WebElement pinCode = driver.findElement(By.id("pincodeInputId"));
//		pinCode.click();
//		actions.sendKeys(Keys.chord(Keys.NUMPAD1)).
//		sendKeys(Keys.chord(Keys.NUMPAD1)).
//		sendKeys(Keys.chord(Keys.NUMPAD0)).
//		sendKeys(Keys.chord(Keys.NUMPAD0)).
//		sendKeys(Keys.chord(Keys.NUMPAD0)).
//		sendKeys(Keys.chord(Keys.NUMPAD1)).
//		build().perform();
	}
}
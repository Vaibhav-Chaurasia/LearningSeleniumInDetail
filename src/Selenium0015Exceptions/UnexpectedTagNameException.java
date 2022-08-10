package Selenium0015Exceptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UnexpectedTagNameException {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vistair.com/");
        driver.manage().window().maximize();
 
        Thread.sleep(2000);
        
        //Create action builder instance by passing WebDriver instance
        driver.findElement(By.id("hs-eu-confirmation-button")).click();
        
        Actions builder = new Actions(driver);
        WebElement menuElement = driver.findElement(By.linkText("SOLUTIONS"));
        builder.moveToElement(menuElement).build().perform();
        
        Thread.sleep(2000);
        
        
        /* The locator that you are passing inside the Select constructor 
         * should point to the Select tag only. In this case, 
         * it is pointing to the anchor tag. 
         */
        Select dropDown = new Select(driver.findElement(By.linkText("SOLUTIONS"))); //points to <a> tag instead of <select> tag.
        List <WebElement> e = dropDown.getOptions();
        int itemsCount = e.size();
        System.out.println(itemsCount);
	}
}
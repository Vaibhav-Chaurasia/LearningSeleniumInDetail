package Selenium0012HandlingMouseEvents;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMenuHover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//Navigate to the demo site
		driver.get("https://www.lambdatest.com/blog/perform-mouse-actions-in-selenium-webdriver/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		//Create object of the Actions class
		Actions actions = new Actions(driver);

		//Moving mouse to the menu
		WebElement menuOptions = driver.findElement(By.xpath("//a[text()='Platform ']"));
		actions.moveToElement(menuOptions).build().perform();
		
		Thread.sleep(2000);

		//Moving mouse to the option present in sub menu
		WebElement subMenuOption = driver.findElement(By.xpath("//h3[text()='Selenium Testing']"));
		actions.moveToElement(subMenuOption).build().perform();
		
		Thread.sleep(2000);
		
		//Finally clicking on the element
		actions.click().build().perform();
	}
}
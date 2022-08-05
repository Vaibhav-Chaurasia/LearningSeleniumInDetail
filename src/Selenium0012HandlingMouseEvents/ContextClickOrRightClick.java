package Selenium0012HandlingMouseEvents;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickOrRightClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//Navigate to the demo site
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		//Create object of the Actions class
		Actions actions = new Actions(driver);

		WebElement contextOrRightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		actions.contextClick(contextOrRightClick).build().perform(); //Performing right click on the event
		
		Thread.sleep(2000);
		
		WebElement clickOnEdit = driver.findElement(By.xpath("//span[text()='Edit']"));
		actions.click(clickOnEdit).build().perform(); //Performing left click on the event.
		
		Thread.sleep(2000);
		
		actions.keyDown(Keys.ENTER).build().perform();
	}
}
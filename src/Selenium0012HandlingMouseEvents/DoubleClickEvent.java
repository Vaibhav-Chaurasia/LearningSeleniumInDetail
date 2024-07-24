package Selenium0012HandlingMouseEvents;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickEvent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Navigate to the demo site
		driver.get("https://unixpapa.com/js/testmouse.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		//Create object of the Actions class
		Actions actions = new Actions(driver);

		WebElement clickOnLink = driver.findElement(By.xpath("//a[text()='click here to test']"));
		actions.doubleClick(clickOnLink).build().perform(); //Double click on the event.
	}
}
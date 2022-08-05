package Selenium0012HandlingMouseEvents;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderClickAndHoldMoveByOffsetRelease {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//Navigate to the demo site
		driver.get("https://jqueryui.com/slider/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		//Create object of the Actions class
		Actions actions = new Actions(driver);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);

		WebElement sliderClickHoldThenMoveAndRelease = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Thread.sleep(2000);
		
		//Click the element then holding the element and moving them to particular position defined and finally releasing the mouse.
		actions.clickAndHold(sliderClickHoldThenMoveAndRelease).moveByOffset(40, 0).release().perform();
	}
}
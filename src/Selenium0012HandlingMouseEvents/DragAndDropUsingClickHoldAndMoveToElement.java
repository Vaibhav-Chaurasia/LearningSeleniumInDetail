package Selenium0012HandlingMouseEvents;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropUsingClickHoldAndMoveToElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//Navigate to the demo site
		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		//Create object of the Actions class
		Actions actions = new Actions(driver);

		//Switching to iframe
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);

		//Taking source element to move
		WebElement itemToBeDragSource = driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(2000);

		//Scrolling the page
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", itemToBeDragSource);
		Thread.sleep(2000);

		//Taking destination element
		WebElement itemWhereToDropDestination = driver.findElement(By.xpath("//div[@id='droppable']"));


		//Click the element then holding them, finally moving them from source to destination
		actions.clickAndHold(itemToBeDragSource).moveToElement(itemWhereToDropDestination, 100, 100).release().perform();
	}
}
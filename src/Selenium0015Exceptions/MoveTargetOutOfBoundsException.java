package Selenium0015Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTargetOutOfBoundsException {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty ("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://jqueryui.com/slider/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);

		WebElement sliderClickHoldThenMoveAndRelease = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Thread.sleep(2000);
		
		//Passing invalid coordinates
		actions.clickAndHold(sliderClickHoldThenMoveAndRelease).moveByOffset(4023, 3032).release().perform();
	}
}
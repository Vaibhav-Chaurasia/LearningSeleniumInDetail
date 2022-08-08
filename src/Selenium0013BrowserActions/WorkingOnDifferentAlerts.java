package Selenium0013BrowserActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnDifferentAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");	
		driver.manage().window().maximize();

		Thread.sleep(2000);

		/*---------------------------------------Simple Alert----------------------------------------------------*/
		// This step will result in an alert on screen
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);

		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		/*--------------------------------------------------------------------------------------------------------*/


		Thread.sleep(3000);
		

		/*---------------------------------------Prompted Alert----------------------------------------------------*/
		WebElement element = driver.findElement(By.id("promtButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		Thread.sleep(2000);

		Alert promptAlert  = driver.switchTo().alert();
		String alertText = promptAlert.getText();
		System.out.println("Alert text is " + alertText);
		Thread.sleep(2000);

		//Send some text to the alert
		promptAlert.sendKeys("Test User");
		Thread.sleep(2000);

		promptAlert.accept();
		/*--------------------------------------------------------------------------------------------------------*/
		
		
		//Use Robot class or any other method in case, of multiple text box in the alert box. For e.g. username and password
//		Robot robot = new Robot();
//		Alert alert=dr.switchTo().alert();
//		dr.get("the url");
//		alert.sendKeys("username");
//		//dr.switchTo().alert();
//		robot.keyPress(KeyEvent.VK_TAB);
//		alert.sendKeys("password");
//		alert.accept();
	}
}

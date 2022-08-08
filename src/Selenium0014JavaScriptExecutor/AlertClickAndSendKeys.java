package Selenium0014JavaScriptExecutor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClickAndSendKeys {
	
	/*To generate the alert we need to use 
	 * “alert(‘ALERT_TEXT_TO_BE_SHOWN’);” while performing the operation with Javascript.*/

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		driver.get("https://www.browserstack.com/users/sign_in");
		js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';"); //send keys to username
		js.executeScript("document.getElementById('user_password').value='password';"); //send keys to password
		js.executeScript("document.getElementById('user_submit').click();"); //click on submit button
		js.executeScript("alert('enter correct login credentials to continue');"); 
		
		Thread.sleep(2000);
		
		Alert promptAlert  = driver.switchTo().alert();
		promptAlert.accept();
	}
}
package Selenium0006LocatorStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDynamicXpathFromCoding {

	public static void main(String[] args) throws InterruptedException {
		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		//Maximizing the window
		driver.manage().window().maximize();


		/*//input[@id="{0}"]
		 * //input[@id="{0}" and @name="{1}"]
		 * 
		 * In this method we have to follow the normal xpath and in last, replace value by '{0}' i.e.
		 * some number 
		 * */


		//Assigning id value {0} which is further replaced by email itself
		//Actual Xpath - input[@id='email']
		String userName = createXpath("//input[@id='{0}']", "email");
		driver.findElement(By.xpath(userName)).sendKeys("vchaurasia@dminc.com");
		Thread.sleep(2000);



		//Actual Xpath - input[@id='password' and @placeholder='Password']
		String password = createXpath("//input[@id='{0}' and @placeholder='{1}']", "password", "Password");
		driver.findElement(By.xpath(password)).sendKeys("Vaibhav1234");
	}


	//Method to replace xpath from i
	public static String createXpath(String xpathExp, Object ...args){
		for(int i = 0; i < args.length; i++){
			xpathExp = xpathExp.replace("{" + i + "}", (CharSequence) args[i]);
		}
		return xpathExp;
	}
}
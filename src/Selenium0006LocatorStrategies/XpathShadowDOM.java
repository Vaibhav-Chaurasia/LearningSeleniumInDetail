package Selenium0006LocatorStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathShadowDOM {

	public static void main(String[] args) {

		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);

		String baseUrl = "https://www.alodokter.com/";
		driver.get(baseUrl);

		//Maximizing the window
		driver.manage().window().maximize();
		
		
		/*In this URL find the root from where shadow DOM start then follow the steps to inspect the element
		 * Go to Console in Dev tools -> Debugger
		 * Write -  document.querySelector('tagname') For e.g.
		 * document.querySelector('grammarly-desktop-integration')
		 * Press enter and look at the hierarchy
		 * 
		 * For Parent Child hierarchy we can write
		 * document.querySelector('html > grammarly-desktop-integration')
		 * 
		 * For further structure Use the following command
		 * document.querySelector('grammarly-desktop-integration').shadowRoot.querySelector('style') 
		 * i.e. element immediately after which shadow starts and so on.
		 * */
		
		//Method 1
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement name = (WebElement) jse.executeScript("return document.querySelector('top-navbar-transparent-view').shadowRoot.querySelector('form > input')");
		name.sendKeys("abc");
		
		//Method 2
		//getShadowRoot method introduced in selenium 4
		WebElement shadowHost = driver.findElement(By.id("top-navbar-view"));
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		String text = (String) shadowRoot.findElement(By.cssSelector("#searchinput")).getAttribute("id");
		System.out.println(text);
		shadowRoot.findElement(By.cssSelector("#searchinput")).sendKeys("abc");
	
		
	}
}
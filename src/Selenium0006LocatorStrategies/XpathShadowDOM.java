package Selenium0006LocatorStrategies;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathShadowDOM {

	public static void main(String[] args) {

		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

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
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement name = (WebElement) jse.executeScript("return document.querySelector('hero-view').shadowRoot.querySelector('input')");
		String js = "arguments[0].setAttribute('value', 'Vaibhav Chaurasia')";
		jse.executeScript(js, name);
		
		
		//WebElement searchButton = (WebElement) jse.executeScript("return document.querySelector('hero-view').shadowRoot.querySelector('input[id=\"buttonSearch\"]')");
		WebElement searchButton = (WebElement) jse.executeScript("return document.querySelector('hero-view').shadowRoot.querySelector('a')");
		
		jse.executeScript("arguments[0].click();", searchButton);
		
	}
}
package Selenium0008WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetShadowRootOfAnElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://watir.com/examples/shadow_dom.html";
		driver.get(baseUrl);

		driver.manage().window().maximize();
		
		//Getting Shadow Host i.e. the element from where shadow-root is starting
		WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
		System.out.println(shadowHost);
		
		//Getting Shadow Root i.e. from where the actual shadow starts
		SearchContext shadowRoot = shadowHost.getShadowRoot(); //It is used to get shadow-dom structure xpaths
		
		//Getting further xpaths
		WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#shadow_content"));
		System.out.println(shadowContent);
	}
}
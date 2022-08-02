package Selenium0008WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement loginButton = driver.findElement(By.xpath("//button[@id='login-button']"));

		//This function gives us the tagname of an Element. For e.g.
		/*<button id="login-button" type="submit" class="rounded block w-full text-size-14 h-40 
		 * tracking-widest font-bold uppercase g-recaptcha bg-black 
		 * text-white disabled:opacity-50">Login</button>
		 * 
		 * 
		 * 
		 * So, in this html code, tag starting from 'button', so, using this function we are getting
		 * html tags.
		 * */
		System.out.println("The TagName of Login button is - " + loginButton.getTagName());
	}

}

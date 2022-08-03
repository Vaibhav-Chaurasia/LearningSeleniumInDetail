package Selenium0009HtmlTags;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anchor {

	public static String url = "";
	public static HttpURLConnection httpURLConnection = null;
	public static int responseCode = 200;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		/*-----------------------------------------Functions for Link/Anchor Tag-----------------------------------------*/		
		WebElement forgotPasswordLink  = driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
		String loginButtonText = forgotPasswordLink.getAccessibleName();
		System.out.println("Login button text is - " + loginButtonText);


		String forgotPasswordAriaRole = forgotPasswordLink.getAriaRole();
		System.out.println("Forgot Password Link Aria Role is - " + forgotPasswordAriaRole);
		Thread.sleep(2000);

		String forgotPasswordTagName = forgotPasswordLink.getTagName();
		System.out.println("Forgot Password Link Tag Name  is - " + forgotPasswordTagName);

		Thread.sleep(2000);
		forgotPasswordLink.click();

		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		/*-----------------------------------------------------------------------------------------------------------------*/

		System.out.println("\n\n");

		/*---------------------------------------------Identify Broken Links, if any---------------------------------------*/
		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while(it.hasNext()){

			url = it.next().getAttribute("href");
			System.out.println(url);

			if(url == null || url.isEmpty()){
				System.out.println("URL is either not configured for anchor tag or it is empty");
				System.out.println("\n");
				continue;
			}

			if(!url.startsWith(baseUrl)){
				System.out.println("URL belongs to another domain, skipping it.");
				System.out.println("\n");
				continue;
			}

			try {
				httpURLConnection = (HttpURLConnection)(new URL(url).openConnection());
				httpURLConnection.setRequestMethod("HEAD");
				httpURLConnection.connect();
				responseCode = httpURLConnection.getResponseCode();

				if(responseCode >= 400){
					System.out.println(url+" is a broken link");
					System.out.println("\n");
				}
				else{
					System.out.println(url+" is a valid link");
					System.out.println("\n");
				}

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/*-----------------------------------------------------------------------------------------------------------------*/
	}
}
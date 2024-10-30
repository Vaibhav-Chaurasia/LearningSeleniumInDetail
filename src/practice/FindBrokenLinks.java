package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindBrokenLinks {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		String url = "https://www.artbasel.com";
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i = 0; i < links.size(); i++) {
			WebElement ele = links.get(i);
			String urls = ele.getAttribute("href");
			verifyLink(urls);
		}
	}
	
	
	public static void verifyLink(String urls) {
		try {
			URL link = new URL(urls);
			HttpURLConnection conn = (HttpURLConnection) link.openConnection();
			conn.setConnectTimeout(3000);
			conn.connect();
			
			if(conn.getResponseCode() == 200) {
				System.out.println(urls + " - " + conn.getResponseMessage());
			}
			
			else {
				System.out.println(urls + " - " + conn.getResponseMessage() + " - " + "is a broken link");
			}
			
		} catch (Exception e) {
			System.out.println(urls + " - " + "is a broken link");
		}
		
	}
}
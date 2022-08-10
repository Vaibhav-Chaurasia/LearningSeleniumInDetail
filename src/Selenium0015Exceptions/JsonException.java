package Selenium0015Exceptions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JsonException {
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		//Invalid URL type calling in Remote web driver.
		WebDriver driver =  new RemoteWebDriver(new URL("https://www.google.com"), caps);
        driver.get("https://www.vistair.com/");
	}
}
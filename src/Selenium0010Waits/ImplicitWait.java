package Selenium0010Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		System.setProperty ("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //Implicit wait for 10 seconds for each and every element. As it is executed at global level.

		String eTitle = "Demo Guru99 Page";
		String aTitle = "";

		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/");

		//Maximizes the browser window
		driver.manage().window().maximize();

		//get the actual value of the title
		aTitle = driver.getTitle();

		//compare the actual title with the expected title
		if (aTitle.equals(eTitle))
		{
			System.out.println( "Test Passed");
		}
		else {
			System.out.println( "Test Failed");
		}
	}
}
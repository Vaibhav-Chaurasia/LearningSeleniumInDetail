package Selenium0006LocatorStrategies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSVG {

	public static void main(String[] args) throws InterruptedException {

		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		/*---------------------------------Getting Attribute(Any thing) of an element-----------------------------------------*/
		String baseUrl1 = "https://www.flipkart.com/";
		driver.get(baseUrl1);

		//Maximizing the window
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		WebElement element = driver.findElement(By.xpath("(//*[name()='svg']//*[local-name()='path' and @class='_1zrN4q'])[1]"));
		String color = element.getAttribute("fill");
		System.out.println(color);
		/*---------------------------------------------------------------------------------------------------------------------*/

		
		Thread.sleep(3000);

		
		
		/*---------------------------------Getting Dynamic Dimensions of the rotating image-------------------------------------*/
		String baseUrl = "http://debeissat.nicolas.free.fr/svg3d.php";
		driver.get(baseUrl);

		//Maximizing the window
		driver.manage().window().maximize();


		//Switch to frame of SVG, if available in the scripts
		driver.switchTo().frame("svg_result");
		while(true){ //Infinite loop because, svg is changing in microseconds

			List <WebElement> eleList = driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='g' and @id='g2']//*[local-name()='path' and contains(@id, 'face')]"));

			for (WebElement ele : eleList){
				String text = null;
				text = ele.getAttribute("d");
				System.out.println(text);
			}
		}
		/*---------------------------------------------------------------------------------------------------------------------*/
	}
}
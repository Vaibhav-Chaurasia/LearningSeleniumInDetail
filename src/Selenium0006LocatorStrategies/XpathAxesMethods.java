package Selenium0006LocatorStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesMethods {

	public static void main(String[] args) throws InterruptedException {

		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/register";
		driver.get(baseUrl);

		//Maximizing the window
		driver.manage().window().maximize();

		Thread.sleep(2000);

		//Using 'following' in xpath - you can have all the elements that follow the current node
		driver.findElement(By.xpath("//div/following::div//input[@id='phone']")).sendKeys("85421745244");
		Thread.sleep(2000);


		//Using 'following-sibling' in xpath
		/* Siblings are those nodes that share the same parent or are at the same level. 
		 * Hence, Following-Sibling will return you the node at the same level and after the current node.
		 * */
		driver.findElement(By.xpath("//div//following-sibling::div//select[@id='country_code']")).click();	
		Thread.sleep(2000);	
		driver.findElement(By.xpath("(//div//following-sibling::option)[2]")).click();



		//Using 'preceding' in xpath - this method helps locate all the elements before the current node
		driver.findElement(By.xpath("//div/preceding::input[@id='userpassword']")).sendKeys("Vaibhav1234");
		Thread.sleep(2000);



		//Using 'preceding-sibling' in xpath - you get all the nodes that are siblings 
		// or at the same level but are before your current node
		driver.findElement(By.xpath("//div/following-sibling::div//select[@id='country_code']")).click();	
		Thread.sleep(2000);	
		driver.findElement(By.xpath("(//div//preceding-sibling::option)[4]")).click();
		Thread.sleep(2000);


		//Using 'child' in xpath - this approach is used to locate all the child elements of a particular node.
		driver.findElement(By.xpath("//div//child::input[@id='email']")).sendKeys("vchaurasia@xyz.com");
		Thread.sleep(2000);



		//Using 'child' in xpath - This method is used to select the parent node of the current node.
		driver.findElement(By.xpath("//input[@type='email']//parent::div//following-sibling::div//input[@name='password']")).sendKeys("Vaibhav1234");
		Thread.sleep(2000);



		//Using 'descendants' in xpath - This method is used for selecting the descendants of the current node.
		//Here, Descendants refer to the child nodes, grandchild nodes, etc.
		driver.findElement(By.xpath("//div[contains(@class,'block overflow-hidden relative')]//descendant::div")).click();
		Thread.sleep(2000);



		//Using 'ancestor' in xpath - This method is used for selecting the ancestors of the current node. 
		//Here, Ancestors refer to the parent nodes, grandparent nodes, etc.
		driver.findElement(By.xpath("//input[contains(@id,'password')]//ancestor::div//input[@name='name']")).sendKeys("Vaibhav Chaurasia");
		Thread.sleep(2000);
	}

}
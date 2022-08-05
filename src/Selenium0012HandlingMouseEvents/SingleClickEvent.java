package Selenium0012HandlingMouseEvents;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SingleClickEvent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//Navigate to the demo site
		driver.get("https://www.w3schools.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		//Create object of the Actions class
		Actions actions = new Actions(driver);

		WebElement textToSearch = driver.findElement(By.xpath("//input[@id='search2']"));
		actions.sendKeys(textToSearch, "CSS").build().perform(); //Enter the text

		Thread.sleep(2000);

		WebElement searchTheText = driver.findElement(By.xpath("//button[@id='learntocode_searchbtn']"));
		actions.click(searchTheText).build().perform(); //Perform Single Left click from mouse
	}
}
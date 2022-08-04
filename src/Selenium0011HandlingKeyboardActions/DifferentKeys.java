package Selenium0011HandlingKeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DifferentKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		//Navigate to the demo site
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		//Create object of the Actions class
		Actions actions = new Actions(driver);

		WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("43 School Lane London EC71 9GO");
		
		actions.keyDown(Keys.ADD).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.SUBTRACT).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.MULTIPLY).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.DIVIDE).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.ARROW_LEFT).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.ARROW_LEFT).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.DELETE).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.ARROW_RIGHT).build().perform();
		Thread.sleep(1000);
		
		currentAddress.sendKeys("43 School Lane London EC71 9GO Sjfldsjfljasldfjldasj ljsdfljsd lfjsadljf lasj");
		Thread.sleep(1000);
		
		actions.keyDown(Keys.ARROW_UP).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.DECIMAL).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.SEMICOLON).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.SEPARATOR).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.SPACE).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.HOME).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.END).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.INSERT).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		
		actions.keyDown(Keys.SHIFT).sendKeys("a").build().perform();
		Thread.sleep(1000);
	}
}
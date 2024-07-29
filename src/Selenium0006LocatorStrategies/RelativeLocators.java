package Selenium0006LocatorStrategies;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class RelativeLocators {
	public static void main(String[] args) throws InterruptedException {

		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);


		String baseUrl = "https://accounts.lambdatest.com/register";
		driver.get(baseUrl);

		//Maximizing the window
		driver.manage().window().maximize();
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(Duration.ofSeconds(30)) 			
				.pollingEvery(Duration.ofSeconds(1)) 			
				.ignoring(NoSuchElementException.class);
		
		WebElement clickTheLink = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("emaill"));
			}
		});
		
		clickTheLink.click();
		
		//Using Above
		By emailLocator = RelativeLocator.with(By.id("email")).above(By.id("userpassword"));
		driver.findElement(emailLocator).sendKeys("vaicha.oracle@gmail.com");
		Thread.sleep(2000); //Pause or Wait for 2 seconds


		//Using Below
		By password = RelativeLocator.with(By.id("userpassword")).below(By.id("email"));
		driver.findElement(password).sendKeys("ABC");
		Thread.sleep(2000); //Pause or Wait for 2 seconds


		//Using LeftOf
		By signInWithGoogle = RelativeLocator.with(By.xpath("//div[@role='button' and @aria-labelledby='sign_up_with_google_label']")).toLeftOf(By.xpath("//div[@role='button' and @aria-label='Sign up with Github']"));
		driver.findElement(signInWithGoogle).click();
		Thread.sleep(2000); //Pause or Wait for 2 seconds
		driver.navigate().back();
		Thread.sleep(2000); //Pause or Wait for 2 seconds


		//Using RightOf
		By signInWithGithub = RelativeLocator.with(By.xpath("//div[@role='button' and @aria-label='Sign up with Github']")).toRightOf(By.xpath("//div[@role='button' and @aria-labelledby='sign_up_with_google_label']"));
		driver.findElement(signInWithGithub).click();
		Thread.sleep(2000); //Pause or Wait for 2 seconds
		driver.navigate().back();
		Thread.sleep(2000); //Pause or Wait for 2 seconds

		
		//Using Near
		By showPassword = RelativeLocator.with(By.xpath("//div[@class='block overflow-hidden relative']//div")).near(By.id("userpassword"), 100);
		driver.findElement(showPassword).click();
		Thread.sleep(2000); //Pause or Wait for 2 seconds
		
		//Chaining
		By termsOfService = RelativeLocator.with(By.xpath("//a[@href='https://www.lambdatest.com/terms-of-service']")).below(By.xpath("//button[@data-amplitude='R_signup']")).below(By.id("userpassword"));
		driver.findElement(termsOfService).click();
		Thread.sleep(2000); //Pause or Wait for 2 seconds
		
		driver.quit();
	}
}
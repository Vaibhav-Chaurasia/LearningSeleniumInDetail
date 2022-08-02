package Selenium0008WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectangleMeansSize {

	public static void main(String[] args) throws InterruptedException {
		/*Prior to selenium 4, you have use
		 * getLocation() to fetch the X & Y axis values
		 * 
		 * Point p = el.getLocation();
		 * System.out.println(p.x + " " + p.y);
		 * 
		 * getSize() to fetch the height and width of an element
		 * Dimension d = el.getSize();
		 * System.out.println(d.height + " " + d.width);
		 * 
		 * Selenium 4 provides Rectangle class to achieve this feature, 
		 * this class exposes getRect() to get the element position and size.
		 * getRect().x -> X axis value from top left corner of an element
		 * getRect().y -> Y axis value from top left corner of an element
		 * getRect().width & getRect().height – size of an element*/


		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement rememberMe = driver.findElement(By.xpath("//input[@type='checkbox']"));
		Rectangle rect = rememberMe.getRect();  //It covers all attributes like x, y axis and height, width instead of using individually.

		System.out.println("X-Axis - " + rect.x ); //from left top corner of element
		System.out.println("Y-Axis - " + rect.y ); 
		System.out.println("Element Width - " + rect.width );
		System.out.println("Element Height - " + rect.height );

		//OR 
		System.out.println("\n");

		System.out.println("Location of X - " + rememberMe.getLocation().getX()); //It returns the position of an element on x-axis
		System.out.println("Location of Y - " + rememberMe.getLocation().getY()); //It returns the position of an element on y-axis
		System.out.println("Width - " + rect.getWidth());
		System.out.println("Height - " + rect.getHeight());
	}
}
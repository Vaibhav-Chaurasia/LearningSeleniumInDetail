package Selenium0008WebElementInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextOfElement {

	public static void main(String[] args) throws InterruptedException {

		/*------------------------------------------Getting text of single element-----------------------------------------*/
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://accounts.lambdatest.com/login";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		//One element text
		WebElement rememberMe = driver.findElement(By.xpath("//span[text()='Remember Me']"));
		System.out.println("The Text is - " + rememberMe.getText()); // getting text of a single element
		/*------------------------------------------------------------------------------------------------------------------*/




		/*------------------------------------------Getting text of list of an element-------------------------------------*/
		String baseUrl1 = "https://www.w3schools.com/html/html_tables.asp";
		driver.get(baseUrl1);
		Thread.sleep(2000);

		List<WebElement> columns = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int columnSize = columns.size();
		System.out.println("Total Number of Columns are - " + columnSize);

		String beforeXpath1stColumn = "//*[@id='customers']/tbody/tr[";
		String afterXpath2ndColumn = "]/td[1]";

		for(int i = 2; i <= columnSize; i++) {
			String actualXpath = beforeXpath1stColumn + i + afterXpath2ndColumn;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText()); // getting text of list of an elements as in for loop

			//Searching, if data exists
			if(element.getText().equals("Island Trading")) {
				System.out.println("Company name : " + element.getText() + " is Found" + " at position:" + " " + (i-1));
				break; //Due to this break complete data of column do not print, in case, anyone wants to print complete data, remove break.
			}
		}
		/*------------------------------------------------------------------------------------------------------------------*/
	}
}
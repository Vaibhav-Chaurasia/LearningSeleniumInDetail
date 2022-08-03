package Selenium0009HtmlTags;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {

		//Setting up the chrome browser launch - Giving browser name and path.
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://www.w3schools.com/html/html_tables.asp";
		driver.get(baseUrl);

		//Maximizing the window
		driver.manage().window().maximize();



		/*---------------------------------------Printing Data from each column using List-----------------------------*/
		/*Absolute Xpaths of an elements*/
		/*
		 * //*[@id="customers"]/tbody/tr[2]/td[1]
		 * //*[@id="customers"]/tbody/tr[3]/td[1]
		 * //*[@id="customers"]/tbody/tr[4]/td[1] and so on
		 * 
		 * In the above xpaths, we observe that only "tr" is changing i.e. Table Rows and rest all are contanst.
		 * So, now we have to make xpaths
		 */
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int columnSize = columns.size();
		System.out.println("Total Number of Columns are - " + columnSize);

		String beforeXpath1stColumn = "//*[@id='customers']/tbody/tr[";
		String afterXpath2ndColumn = "]/td[1]";

		for(int i = 2; i <= columnSize; i++) {
			String actualXpath = beforeXpath1stColumn + i + afterXpath2ndColumn;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());

			//Searching, if data exists
			if(element.getText().equals("Island Trading")) {
				System.out.println("Company name : " + element.getText() + " is Found" + " at position:" + " " + (i-1));
				break; //Due to this break complete data of column do not print, in case, anyone wants to print complete data, remove break.
			}
		}
		/*--------------------------------------------------------------------------------------------------------------*/


		System.out.println("\n\n");


		/*---------------------------------------Printing Data from each row using Simple Method----------------------------*/
		/*Absolute Xpaths of an elements*/
		/*
		 * //*[@id="customers"]/tbody/tr[2]/td[1]
		 * //*[@id="customers"]/tbody/tr[2]/td[2]
		 * //*[@id="customers"]/tbody/tr[2]/td[3]
		 * 
		 * In the above xpaths, we observe that only "tr" is changing i.e. Table Rows and rest all are contanst.
		 * So, now we have to make xpaths
		 */

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[2]/td"));
		int rowSize = rows.size();
		System.out.println("Total Number of Columns are - " + rowSize);
		
		
		String beforeXpath1stRow = "//*[@id='customers']/tbody/tr[2]/td[";
		String afterXpath2ndRow = "]";

		for(int i = 1; i <= rowSize; i++) {
			String actualXpath = beforeXpath1stRow + i + afterXpath2ndRow;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());

			//Searching, if data exists
			if(element.getText().equals("Maria Anders")) {
				System.out.println("Contact name : " + element.getText() + " is Found" + " at position:" + " " + (i-1));
				break; //Due to this break complete data of column do not print, in case, anyone wants to print complete data, remove break.
			}
		}
		/*--------------------------------------------------------------------------------------------------------------*/
	}
}
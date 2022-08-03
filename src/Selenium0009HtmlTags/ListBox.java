package Selenium0009HtmlTags;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {

		/* List Box :
		 * 1. Occupies more space but shows more than one value.
		 * 2. We can select multiple or single items.
		 * 3. we can use checkboxes with in the list box.
		 * */

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://www.w3.org/WAI/ARIA/apg/example-index/listbox/listbox-rearrangeable";
		driver.get(baseUrl);

		driver.manage().window().maximize();

		Thread.sleep(2000);


		//Scroll page till element visible
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h3[@id='ex2_label']")));
		Thread.sleep(500);


		/*--------------------------------------Adding Items to the list--------------------------------------------*/
		List<WebElement> upgrades = driver.findElements(By.xpath("//ul[@id='ms_imp_list']//li[@role='option']"));
		Thread.sleep(2000);

		//Getting the text of the ugrades from the list.
		for(int i = 0; i < upgrades.size(); i++) {
			System.out.println("Upgrades - " + upgrades.get(i).getText());
		}


		//Clicking the elements in the list.
		for(int j = 0; j < upgrades.size();) {
			upgrades.get(1).click();
			upgrades.get(2).click();
			break;
		}


		Thread.sleep(2000);

		//Adding the elements in another list.
		driver.findElement(By.xpath("//button[@id='ex2-add']")).click();
		/*------------------------------------------------------------------------------------------------------------*/


		Thread.sleep(2000);


		/*--------------------------------------Removing Item from the list--------------------------------------------*/
		List<WebElement> chosenList = driver.findElements(By.xpath("//ul[@id='ms_unimp_list']//li[@role='option']"));

		//Clicking the elements in already chosen list.
		for(int k = 0; k < chosenList.size();) {
			chosenList.get(1).click();
			break;
		}


		Thread.sleep(2000);

		//Removing the element from another list.
		driver.findElement(By.xpath("//button[@id='ex2-delete']")).click();
		/*---------------------------------------------------------------------------------------------------------------*/
	}

}

package Selenium0011HandlingKeyboardActions;

import java.awt.AWTException;	
import java.awt.Robot;	
import java.awt.event.KeyEvent;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	

class FunctionEscapeAltKeysUsingRobotClass {
	
	/*Drawback of Robot Class, once it started, it is impossible to stop. The only way is to 
	 * close the eclipse and after sometime press ESCAPE key again and again.*/

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty ("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
		driver.manage().window().maximize();

		Robot robot = new Robot();  // Robot class throws AWT Exception	
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);  //It opens the help menu in chrome browser        
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_PAGE_UP);  //It opens the help menu in chrome browser        
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_F1);  //It opens the help menu in chrome browser        
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_F12); //It opens the developer console
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_F2); //In developer options, this button perform "Edit as HTML" in element tab.
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_F3); //It opens the global search bar in chrome
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_F5); //It refrshes the window
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_F6); //It selects the url
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_F7); //It starts the carror browsing option
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_ESCAPE); //This escapes anything open as a popup
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_F10); //This selects the menu in chrome
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_F11); //This makes chrome in full screen
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_ALT); //This closes the chrome
		robot.keyPress(KeyEvent.VK_F4);
		Thread.sleep(2000);
		
		
		//To write string or integer
		//robot.keyPress(KeyEvent.VK_H);
		//robot.keyPress(KeyEvent.VK_4);
	}	 
}
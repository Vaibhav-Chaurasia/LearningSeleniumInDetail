package Selenium0016Assertions;

import org.testng.asserts.SoftAssert;

public class AssertionSoftAssertionExample {

	public static void main(String[] args) throws InterruptedException {

		SoftAssert softAssert = new SoftAssert();
		
		//Only Possible with testng Framework as needed @Test annotation.
		//In case of java we need two main java function in same class.
		
		softAssert.assertAll();
	}
}
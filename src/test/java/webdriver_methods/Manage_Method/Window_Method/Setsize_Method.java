package webdriver_methods.Manage_Method.Window_Method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// First line of Code
		WebDriver driver = new ChromeDriver();

		// Approach 1
		// Setting the Size Of Window
		driver.manage().window().setSize(new Dimension(800, 500));

		Thread.sleep(5000);

		// Approach 2
		// Object Creation of Dimension
		Dimension sizeOfBrowser = new Dimension(1500, 800);
		// Setting the Size Of Window
		driver.manage().window().setSize(sizeOfBrowser);

	}

}

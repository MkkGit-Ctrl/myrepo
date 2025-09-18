package webdriver_methods.Navigate_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// First Line of code
		WebDriver driver = new ChromeDriver();

		// Navigate to Facebook
		driver.navigate().to("https://www.facebook.com");

		Thread.sleep(3000);

		// Refresh the page
		driver.navigate().refresh();

	}

}

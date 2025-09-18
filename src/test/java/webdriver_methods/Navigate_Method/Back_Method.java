package webdriver_methods.Navigate_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Back_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First line of code
		WebDriver driver = new ChromeDriver();

		// Navigate to Facebook
		driver.navigate().to("https://www.facebook.com");

		// Navigate to Google
		driver.navigate().to("https://www.google.com");

		// Navigate to Demowebshop
		driver.get("https://demowebshop.tricentis.com/");

		// Navigate back to Google
		driver.navigate().back();

		// Navigate back to Facebook
		driver.navigate().back();

	}

}

package webdriver_methods.Navigate_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_url_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First line of code
		WebDriver driver = new ChromeDriver();

		// Navigate to facebook by method chaining
		driver.navigate().to("https://facebook.com");

		// Capturing the Object
		Navigation navigate = driver.navigate();

		// Navigate to Google
		navigate.to("https://www.google.com");
	}

}

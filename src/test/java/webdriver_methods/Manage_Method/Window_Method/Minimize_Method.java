package webdriver_methods.Manage_Method.Window_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First line code
		WebDriver driver = new ChromeDriver();

		// Navigate to Google
		driver.get("https://www.google.com");

		// Minimizing Browser by First Way
		Window handleWindow = driver.manage().window();

		handleWindow.minimize();

		handleWindow.maximize();

		// Minimizing browser window by Second Way
		driver.manage().window().minimize();

	}

}

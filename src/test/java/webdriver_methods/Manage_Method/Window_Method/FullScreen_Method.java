package webdriver_methods.Manage_Method.Window_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreen_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First line of Code
		WebDriver driver = new ChromeDriver();

		// Navigate to Facebook
		driver.get("https://www.facebook.com");

		// FullScreen mode
		driver.manage().window().fullscreen();
	}

}

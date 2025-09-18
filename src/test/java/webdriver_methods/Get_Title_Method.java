package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title_Method {

	public static void main(String[] args) {
		// First line of Code
		WebDriver driver = new ChromeDriver();

		// Navigate to Facebook
		driver.get("https://wwww.facebook.com");

		// Capturing the title of Facebook Application
		String title = driver.getTitle();
		System.out.println("Title : " + title);

	}

}

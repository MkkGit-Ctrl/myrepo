package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Windowhandle_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First line of Code
		WebDriver driver = new ChromeDriver();

		// Capturing the Session ID
		String windowHandle = driver.getWindowHandle();

		// Print
		System.out.println("Session ID of Current Window : " + windowHandle);

	}

}

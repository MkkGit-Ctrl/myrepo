package webdriver_methods.Navigate_Method;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_URL_Method_ {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//First line of code
		
		WebDriver driver = new ChromeDriver();
		
		//Navigate to Facebook
		driver.navigate().to(new URL("http://www.facebook.com"));

	}

}

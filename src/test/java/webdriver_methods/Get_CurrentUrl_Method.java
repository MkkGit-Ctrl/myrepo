package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_CurrentUrl_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First line of code
		WebDriver driver = new ChromeDriver();

		// Navigate to FaceBook app
		driver.get("https://www.facebook.com");
	
		String currentUrl = driver.getCurrentUrl();

		System.out.println("Current Url of Web Page : " + currentUrl);
		
		//Verification
		
		if(currentUrl.contains("facebook")) {
			System.out.println("Pass");
			
		}
		else {
			System.out.println("Fail");
		}
	}

}

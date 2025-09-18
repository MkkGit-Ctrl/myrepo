package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_PageSource_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First line of Code
		WebDriver driver = new ChromeDriver();

		// Navigate to FaceBook
		driver.get("https://www.facebook.com");

		// Capturing the Html Code of the Facebook Url
		String sourceCode = driver.getPageSource();

		// Printing the SourceCode
		System.out.println("HTML code of FaceBook Login Page : " + sourceCode);

		System.out.println(
				"Does the text //Facebook helps you connect and share with the people in your life.// is displayed or not");

		// Verification
		if (sourceCode.contains("Facebook helps you connect and share with the people in your life.")) {
			System.out.println("Yes It is Displayed");
		} else {
			System.out.println("NO It is not Displayed");
		}

	}

}

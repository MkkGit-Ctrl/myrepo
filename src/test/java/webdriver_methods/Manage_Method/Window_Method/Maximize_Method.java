package webdriver_methods.Manage_Method.Window_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// First Line of Code
		WebDriver driver = new ChromeDriver();

		// Second line of Code
		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.get("https://demowebshop.tricentis.com/");
	}

}

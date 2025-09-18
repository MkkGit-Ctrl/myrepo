package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Windowhandles_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First Line Of Code
		WebDriver driver = new ChromeDriver();

		// Second line of code
		driver.manage().window().maximize();

		// Navigate to DemoWebShop
		driver.get("https://demowebshop.tricentis.com/");

		// Perform some Action
		driver.findElement(By.xpath("//li[@class = 'facebook']/a")).click();

		// Capture the Session ID of Both the Tabs
		Set<String> handles = driver.getWindowHandles();
		
		System.out.println("All the Session ID" + handles);

	}

}

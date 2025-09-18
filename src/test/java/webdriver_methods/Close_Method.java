package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//First line of Code Launching Browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to Demoshop
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(10000);
		
		//Close the parent window 
		driver.quit();
	}

}

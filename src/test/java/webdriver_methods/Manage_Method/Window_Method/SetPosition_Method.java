package webdriver_methods.Manage_Method.Window_Method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition_Method {
	public static void main(String[] args) throws InterruptedException {
		// First line of code
		WebDriver driver = new ChromeDriver();
		// Set the Size of Window
		driver.manage().window().setSize(new Dimension(50, 100));
		// Initial position of the Browser
		System.out.println("Initial Position : " + driver.manage().window().getPosition());

		// Set the Position of Browser window to Center of the Screen
		driver.manage().window().setPosition(new Point(750, 400));
		Thread.sleep(1000);

		// Move the Browser window diagonally to the Screen
		driver.manage().window().setPosition(new Point(0, 0));
		Thread.sleep(1000);
		driver.manage().window().setPosition(new Point(180, 100));
		Thread.sleep(1000);
		driver.manage().window().setPosition(new Point(360, 200));
		Thread.sleep(1000);
		driver.manage().window().setPosition(new Point(540, 300));
		Thread.sleep(1000);
		driver.manage().window().setPosition(new Point(720, 400));
		Thread.sleep(1000);
		driver.manage().window().setPosition(new Point(900, 500));
		Thread.sleep(1000);
		driver.manage().window().setPosition(new Point(1000, 600));
		Thread.sleep(1000);
		driver.manage().window().setPosition(new Point(1200, 700));
		Thread.sleep(1000);
		driver.manage().window().setPosition(new Point(1400, 800));
		Thread.sleep(1000);
		
		//wefewfwefwefewf
	}

}

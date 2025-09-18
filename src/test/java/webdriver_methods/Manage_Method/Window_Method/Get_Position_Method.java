package webdriver_methods.Manage_Method.Window_Method;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Position_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First line of Code
		WebDriver driver = new ChromeDriver();

		// Capturing the position of the window
		System.out.println("Initial Position of the Window " + driver.manage().window().getPosition());

		// Capturing X and Y Co-ordinate
		System.out.println("X Co-ordinate : " + driver.manage().window().getPosition().getX());
		System.out.println("Y Co-ordinate : " + driver.manage().window().getPosition().getY());
          
		driver.manage().window().setPosition(new Point(-500, -500));
	}

}

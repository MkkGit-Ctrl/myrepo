package webdriver_methods.Manage_Method.Window_Method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First line of Code
		WebDriver driver = new ChromeDriver();

		// Capture the Dimension Object
		Dimension dimension = driver.manage().window().getSize();

		System.out.println("Before Maximize");
		// Print the dimension
		System.out.println("Dimension : " + dimension);

		// Printing the Width
		System.out.println("Width : " + dimension.getWidth() + " pixel");

		// Printing Height
		System.out.println("Height : " + dimension.getHeight() + " pixel");

		System.out.println("After Maximize");

		driver.manage().window().maximize();

		// Capture the Dimension Object
		dimension = driver.manage().window().getSize();

		// Printing the Width
		System.out.println("Width : " + dimension.getWidth() + " pixel");

		// Printing Height
		System.out.println("Height : " + dimension.getHeight() + " pixel");

	}

}

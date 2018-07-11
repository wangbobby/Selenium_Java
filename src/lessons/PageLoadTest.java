package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

//import org.openqa.selenium.firefox.FirefoxDriver;

/**
public class PageLoadTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		
		driver.get("https://www.baidu.com/link?url=kelC3-7jRUgvCPuBeD96QWYPO7Dif3dNOdS4pqY7mwQTzQartkAewWgjE5nQD-RY&wd=&eqid=8636474700011d3c000000065b10768a");

	}

}
*/

public class PageLoadTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Point targetPosition = new Point(600, 300);
		Dimension targetSize = new Dimension(1024, 768);
		driver.manage().window().setPosition(targetPosition);
		driver.manage().window().setSize(targetSize);
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
		
//		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("")) 
			System.out.println("Title is correct...");
		else
			System.out.println("Title is wrong...");
	}
}
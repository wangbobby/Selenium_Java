package FindElement;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://news.baidu.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		List <WebElement> links = driver.findElements(By.xpath("//*[@id=\"pane-news\"]/ul[2]/li/a"));
//		List <WebElement> links = driver.findElements(By.xpath(".//*[@target='_blank']"));
		//*[@id="pane-news"]/ul[2]/li[1]/a
		System.out.println(links.size());
		for(int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
		//print out source html file
//		System.out.println(driver.getPageSource());
		
		//print out the handler
		System.out.println(driver.getWindowHandles());
	}

}

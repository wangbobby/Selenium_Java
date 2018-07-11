package P20;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleAndMultipleChoice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
//		driver.get("http://news.baidu.com");
		driver.get("https://www.sojump.com/m/2792226.aspx/");
		
		Thread.sleep(1000);
		
//		ArrayList<WebElement> searchType = (ArrayList<WebElement>) driver.findElement(By.xpath("//*/p[@class='search-radios']/input"));
		
//		ArrayList<WebElement> searchType = (ArrayList<WebElement>)driver.findElement(By.xpath("//*[@id='sbox']/tbody/tr/td[2]/p"));
//		
//		for(WebElement ele: searchType) {
//			ele.click();
//			Thread.sleep(1000);
//		}
		
		
		ArrayList<WebElement> answerOptions = (ArrayList<WebElement>) driver.findElements(By.className("jqradiowrapper"));
//		ArrayList<WebElement> answerOptions = (ArrayList<WebElement>) driver.findElements(By.xpath("//*/div[@id='divQuestion']/fieldset/div/div/div/span/input/../a"));
//		ArrayList<WebElement> answerOptions = (ArrayList<WebElement>) driver.findElements(By.xpath("//*/div[@id='divQuestion']/fieldset/div/div/div/span/input/../a"));  
//		ArrayList<WebElement> answerOptions = (ArrayList<WebElement>) driver.findElements(By.xpath("//*[@id=\"div3\"]"));
		System.out.println(answerOptions.size());
		for(WebElement ele: answerOptions) {
			ele.click();
			Thread.sleep(1000);
		}
	}

}

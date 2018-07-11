package P30;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlePopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://scrolltest.com/");

	}

}

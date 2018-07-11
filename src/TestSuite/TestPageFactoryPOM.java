package TestSuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import POM.PageFactoryPOM;

public class TestPageFactoryPOM {
  WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.elong.com/?semid=ppzqbaidu");
  }
  
  @Test
  public void f() {
	  PageFactoryPOM pfp = PageFactory.initElements(driver, PageFactoryPOM.class);
	  pfp.login("wangyymz", "swksdbgj");
  }

  @AfterClass
  public void afterClass() {
  }

}

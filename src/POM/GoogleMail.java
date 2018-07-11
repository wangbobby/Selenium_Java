package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleMail {
	
	//element location
	@FindBy(xpath="/html/body/nav/div/a[2]")
	WebElement toMailPage;
	
	@FindBy(xpath="//*[@id=\"identifierId\"]")
	WebElement inputUserName;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")
	WebElement toPasswordPage;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/content/form/div[1]/div/div[1]/div/div[1]/input")
	WebElement inputPassword;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")
	WebElement loginButton;
	
	public void login(String username, String password) throws InterruptedException {
		toMailPage.click();
		Thread.sleep(1000);
		inputUserName.sendKeys(username);
		toPasswordPage.click();
		Thread.sleep(1000);
		inputPassword.sendKeys(password);
		loginButton.click();
		Thread.sleep(1000);
	}
	
}

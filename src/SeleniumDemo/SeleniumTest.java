package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://itera-qa.azurewebsites.net/home");
		
	}
}

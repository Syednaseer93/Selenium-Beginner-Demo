package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	}

}

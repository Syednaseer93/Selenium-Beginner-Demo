package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//*[@id='imagesrc']")).click();
		
		
		
		
	


		
	}

}

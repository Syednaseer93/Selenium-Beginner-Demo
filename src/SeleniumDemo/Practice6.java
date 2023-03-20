package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(4000);
		WebElement ele=driver.findElement(By.xpath("/html/body/nav/div[2]/div[2]/ul/li[2]/div/a/span\r\n"
				+ ""));
		Select s=new Select(ele);
		s.selectByIndex(1);
	}

}

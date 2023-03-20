package SeleniumDemo;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:\\www.google.com");
		List <WebElement> link =driver.findElements(By.tagName("a"));// to find no of links use anchor tag 'a'
		System.out.println(link.size());
		
		for(WebElement ele:link)// to get name of links
		{
			System.out.println(ele.getText());
		}
		
		
		
		
	}
  
}

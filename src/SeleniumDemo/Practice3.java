package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[1]/a\r\n"
				+ "")).click();
	//	driver.findElement(By.className("2IX_2- VJZDxU")).sendKeys("9742017868");
	//	driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU")).sendKeys("ALLAH143:*");
	//	driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("dhsbdvfdb");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input\r\n"
				+ "")).sendKeys("fgfedfgf123@A");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span\r\n"
				+ "")).click();
	}

}

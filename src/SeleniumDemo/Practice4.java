package SeleniumDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input\r\n"
				+ "")).sendKeys("Admin");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input\r\n"
				+ "")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button\r\n"
				+ "")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys("Naseer");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input\r\n"
			+ "")).sendKeys("Syed");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]\r\n"
			+ "")).click();
WebElement ele=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[1]/div[1]\r\n"
		+ ""))	;
Select country=new Select(ele);
JavascriptExecutor js=(JavascriptExecutor)driver;
WebElement ele1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[1]/div[1]\r\n"
		+ ""));
js.executeScript("arguments[0].click()", ele1);


	
}
}

package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GmailExample { //Test passed use this to refer
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.nopcommerce.com/");
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a\r\n"
				+ "")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[2]/ul/li[2]/a\r\n"
				+ "")).click();
		WebElement position=driver.findElement(By.xpath("//*[@id=\"products-orderby\"]\r\n"
				+ ""));
		Select s=new Select(position);
		s.selectByVisibleText("Created on");
		Thread.sleep(4000);
	/*	driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]\r\n"
				+ "")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]\r\n"
				+ "")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]\r\n"
				+ "")).click();
		driver.findElement(By.xpath("//*[@id=\"itemquantity11271\"]")).sendKeys("2");
	WebElement giftwrapping=driver.findElement(By.xpath("//*[@id=\"checkout_attribute_1\"]"));
	Select s1=new Select(giftwrapping);
	s1.selectByIndex(1);
	driver.findElement(By.xpath("//*[@id=\"updatecart\"]\r\n"
			+ "")).click();
	*/

	driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]\r\n"
			+ "")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]\r\n"
			+ "")).click();
	driver.findElement(By.xpath("//*[@id=\'termsofservice\']\r\n"
			+ "")).click();
	driver.findElement(By.xpath("//*[@id=\'checkout\']\r\n"
			+ "")).click();
	String expectedTitle="nopCommerce demo store. Login";
	String actualTitle=driver.getTitle();
  if(expectedTitle.equals(actualTitle))
	{
		System.out.println("Test Passed");
	}
	else
	{
		System.out.println("Test Failed");
	}
	}

}

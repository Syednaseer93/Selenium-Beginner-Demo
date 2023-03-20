package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Syedjsbd@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Fhsbfjks23@");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")).click();
		driver.findElement(By.id("identify_email")).sendKeys("syednaseer1993@gmail.com");
		driver.findElement(By.id("did_submit")).click();
	}

}

package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LenskartExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		driver.findElement(By.xpath("//*[@id=\"Form_getForm_FullName\"]")).sendKeys("Syed");
		driver.findElement(By.xpath("//*[@id=\"Form_getForm_Email\"]")).sendKeys("syednaseer92@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Form_getForm_Contact\"]")).sendKeys("+910889987686");
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"Form_getForm_Country\"]"));
		Select s= new Select(ele);
		s.selectByVisibleText("India");
		driver.findElement(By.xpath("")).click();
		

	
		
		
			
	}
	
}



package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.linkText("Book a Free Demo")).click();
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Syed");
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("Syednaseer33@gmail.com");
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("+919726281921");
		WebElement dd=driver.findElement(By.id("Form_getForm_Country"));
		Select s=new Select(dd);
		s.selectByValue("India");
	//	driver.findElement(By.className("recaptcha-checkbox-border")).click();
		driver.findElement(By.id("Form_getForm_action_submitForm")).click();
		
		//driver.close();

	}

}

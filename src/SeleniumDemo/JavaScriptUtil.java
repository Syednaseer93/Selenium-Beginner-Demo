package SeleniumDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	public static void flash(WebElement element, WebDriver driver)
	{
		String bgcolor= element.getCssValue("background color");
		for(int i=0;i<500;i++)
		{
			changeColor("#333333",element,driver);
			changeColor(bgcolor,element,driver);		
		}
	}
	
	public static void changeColor(String color,WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("argument[0].style.backgroundColor='" + color + "'", element);
		
		try
		{
			Thread.sleep(5000);
		} catch(InterruptedException e)
		{
			
		}
		
	}

	

}

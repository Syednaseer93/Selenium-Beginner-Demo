package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='imagesrc']")).click();
		
	/*	String imagesFilePath="C:\\SeleniumPractice\\";
		String inputFilepath="C:\\SeleniumPractice\\";
		
		Screen s =new Screen();
		
		Pattern fileInputTextBox = new Pattern(imagesFilePath+"inputtextbox.PNG");
		Pattern openButton = new Pattern(imagesFilePath+"openbutton.PNG");
		
		Thread.sleep(5000);
		
		s.wait(fileInputTextBox,20);
		s.type(fileInputTextBox,inputFilepath+"apple.jpg");
		s.click(openButton); */  
		
	}

}

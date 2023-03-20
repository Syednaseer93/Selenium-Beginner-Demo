package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input\r\n"
				+ "")).sendKeys("Admin");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input\r\n"
				+ "")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button\r\n"
				+ "")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input\r\n"
				+ "")).sendKeys("Syed");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input\r\n"
				+ "")).sendKeys("Naseer");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input\r\n"
				+ "")).sendKeys("786");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]\r\n"
				+ "")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input\r\n"
				+ "")).sendKeys("Beast");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys("786786");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input\r\n"
				+ "")).click();
		Thread.sleep(3000);
		String month="December";
		int day=14;
	  while(true)
	  {
		  String text= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/ul/li[1]/div/p\r\n"
		     		+ "")).getText();
	
	    if(month.equalsIgnoreCase(text))
	    {
	    	break;
	    }
	    else
	    {
	    	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/button[2]/i\r\n"
	    			+ "")).click();
	    }
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[3]/div[15]/div\r\n"
	    		+ "")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input\r\n"
	    		+ "")).sendKeys("123456");
	    Thread.sleep(2000);
	/*   WebElement ele= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[1]/div[1]\r\n"
	    		+ ""));
	   Select s=new Select(ele);
	   s.selectByVisibleText("Indian");  
	WebElement w2=    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/div[1]/div[1]\r\n"
	    		+ ""));
	Select bloodtype=new Select(w2);
	bloodtype.selectByVisibleText("A+"); */
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[1]/div/div[2]/input\r\n"
	    		+ "")).sendKeys("aqsedrgtyhujkihgfd");
	
	    WebElement w=driver.findElement(By.className("oxd-select-text-input"));
	Select nationality=new Select(w);
	List<WebElement>alloptions=nationality.getOptions();
	
	for(WebElement option:alloptions)
	{
		if(option.getText().equals("Indian"))
		{
			option.click();
			break;
		}
	}
	
	
		
		
		
		
	Thread.sleep(5000);
		driver.close();
	}

}
}

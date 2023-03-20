package SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a\r\n"
				+ "")).click();
		driver.findElement(By.xpath("//*[@id=\"layered_id_attribute_group_1\"]\r\n"
				+ "")).click();
		driver.findElement(By.id("selectProductSort")).click();
		WebElement sortby= driver.findElement(By.id("selectProductSort"));
		Select s=new Select(sortby);
		s.selectByVisibleText("In stock");
		driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		driver.findElement(By.id("add_to_cart")).click();
	   String actualTitle= driver.getTitle();
	   String expectedTitle="Faded Short Sleeve T-shirts - My Store";
	   
	   if(actualTitle.equals(expectedTitle))
	   {
		   System.out.println("Test Passed");
	   }
	   else
	   {
		   System.out.println("Test Failed");
	   }
		
		
	/*Actions actions = new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img\r\n"
				+ ""));
	     actions.moveToElement(ele);
	     actions.perform();
	     */
	
		
		
	
		
		
	}

}

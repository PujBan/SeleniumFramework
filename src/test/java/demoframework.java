import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoframework {

	
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub	
		setup();
		process();
		close();

	}
	static WebDriver driver;
	static String Url="http://automationpractice.com/index.php";
	
	public static void setup() 
	{
		System.out.println("WebDriver SettingUP");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath"+ projectPath); 
		System.setProperty("webdriver.chrome.driver",projectPath+ "/Drivers/ChromeDriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void process() throws InterruptedException
	{
		driver.get(Url);
		Thread.sleep(5000);
		/*WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("testing techniques");
		textbox.sendKeys(Keys.RETURN);*/
	}
	
	public static void close() {
		driver.close();
	}

}

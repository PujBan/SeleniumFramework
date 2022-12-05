package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginSWAGLABS;

public class testloginfunctionality 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		setup();
		login();
		close();
	}

	static WebDriver driver= null;
	static String Url="https://www.saucedemo.com/";
	
	@BeforeTest
	public static void setup() {
        System.out.println("WebDriver SettingUP");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath"+ projectPath); 
		System.setProperty("webdriver.chrome.driver",projectPath+ "/Drivers/ChromeDriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public static void login() 
	{
		driver.get(Url);
		LoginSWAGLABS.textBox_Uname(driver).sendKeys("standard_user");
		LoginSWAGLABS.textBox_Pwd(driver).sendKeys("secret_sauce");
		LoginSWAGLABS.button_login(driver).click();	
		
	}
	
	@AfterTest
	public static void close() 
	{
	  driver.close();	
	}
}

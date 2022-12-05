package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.testloginfunctionalityobjects;

public class testloginfunctionalitytest 
{

	static WebDriver driver= null;
	
	public static void main(String[] args) 
	{
		testlogin();
	}
	public static void testlogin() {
		String projectPath = System.getProperty("user.dir"); 
		System.setProperty("webdriver.chrome.driver",projectPath+ "/Drivers/ChromeDriver/chromedriver.exe");
		driver= new ChromeDriver();
		
		testloginfunctionalityobjects loginobj = new testloginfunctionalityobjects(driver);
		driver.get("https://www.saucedemo.com/");
		
		loginobj.setusername("problem_user");
		loginobj.setpwd("secret_sauce");
		loginobj.clickonlogin();
	}
}

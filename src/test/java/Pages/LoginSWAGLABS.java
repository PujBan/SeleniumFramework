package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSWAGLABS 
{
	static WebElement element= null;
	
	public static WebElement textBox_Uname(WebDriver driver)
	{
		element = driver.findElement(By.id("user-name"));
		return element;
	}
	
	public static WebElement textBox_Pwd(WebDriver driver)
	{
		element = driver.findElement(By.id("password"));
		return element;
	}
	
	public static WebElement button_login(WebDriver driver)
	{
		element = driver.findElement(By.id("login-button"));
		return element;
	}

	

}

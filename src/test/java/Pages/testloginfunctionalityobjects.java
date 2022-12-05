package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testloginfunctionalityobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static WebDriver driver= null;
	
	By textbox_Uname = By.id("user-name");
	By textbox_Pwd = By.id("password");
	By button_Login = By.id("login-button");
	
	public testloginfunctionalityobjects(WebDriver driver)
	{
		this.driver= driver;
		
	}
	
	public void setusername(String uname) 
	{
		driver.findElement(textbox_Uname).sendKeys(uname);
	}
	public void setpwd(String pwd) 
	{
		driver.findElement(textbox_Pwd).sendKeys(pwd);
	}
	public void clickonlogin() 
	{
		driver.findElement(button_Login).click();
	}
}

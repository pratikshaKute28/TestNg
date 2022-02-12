package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects 
{
	public WebDriver driver;
	By username=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@id='Login']");
	
	public LoginPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement EnterUsername()
	{
		return driver.findElement(username);
	}
	public WebElement EnterPassword()
	{
		return driver.findElement(password);
	}
	public WebElement ClickLogin()
	{
		return driver.findElement(login);
	}

}

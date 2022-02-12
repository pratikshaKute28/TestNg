package PageObjectModel;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FreeTrialObjects 
{
	public WebDriver driver;
	By FirstName =By.xpath("//input[@name='UserFirstName']");
	By LastName = By.xpath("//input[@name='UserLastName']");
	By email= By.xpath("//input[@name='UserEmail']");
	By phone=By.xpath("//input[@name='UserPhone']");
	By checkbox=By.xpath("//input[@id='SubscriptionAgreement']");

public WebElement FirstName()
{
	return driver.findElement(FirstName);
}
public WebElement LastName()
{
	return driver.findElement(LastName);
}
public WebElement email()
{
	return driver.findElement(email);
}
public WebElement phone()
{
	return driver.findElement(phone);
}
public WebElement checkbox()
{
	return driver.findElement(checkbox);
}

}
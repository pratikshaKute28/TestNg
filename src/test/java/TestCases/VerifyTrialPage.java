package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjectModel.FreeTrialObjects;
import Resources.BaseClass;

public class VerifyTrialPage extends BaseClass
{
	@Test
	public void LaunchBrowser() throws IOException  
	{
		driver=InitialiseDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath("//span[normalize-space()='Start my free trial']")).click();
		FreeTrialObjects obj=new FreeTrialObjects();
		obj.FirstName().sendKeys("abc");
		obj.LastName().sendKeys("xyz");
		obj.email().sendKeys("abc.12@gmail.com");
		obj.phone().sendKeys("987654321");
		obj.checkbox().click();
		
		
	}

}

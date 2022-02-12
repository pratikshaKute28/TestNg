package TestCases;
//for git demo
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;

public class VerifyLoginPage extends BaseClass
{
	@Test(dataProvider="login")
	public void LaunchBrowser(String username,String password) throws IOException
	{
		driver=InitialiseDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		LoginPageObjects obj= new LoginPageObjects(driver);
		obj.EnterUsername().sendKeys(username);
		obj.EnterPassword().sendKeys(password);
		obj.ClickLogin().click();
		
	}
	@DataProvider	
	Object[][] login()
	{
		Object[][]a=new Object[2][2];
		a[0][0]="test1";
		a[0][1]="pass1";
		a[1][0]="test2";
		a[1][1]="pass2";
		return a;
		
		
	}

}

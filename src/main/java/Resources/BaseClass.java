package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.jodah.failsafe.internal.util.Assert;

public class BaseClass 
{
	public WebDriver driver;
	public WebDriver InitialiseDriver() throws IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\Pratiksha\\eclipse-workspace\\EndtoendDemo\\src\\main\\java\\Resources\\Data.properties");
		Properties prop=new Properties();
		prop.load(f1);
		String browsername=prop.getProperty("Browser");
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pratiksha\\Desktop\\SeleniumJars\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			//firefox code
		}
		else if(browsername.equals("Internet Explorer"))
		{
			//IE code
		}
		return driver;
		
	}
	
}

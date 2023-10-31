package GenaricScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest  implements FrameworkConstant
{

	protected WebDriver driver;
	@BeforeMethod
	public void open( )
	{
		System.setProperty(gk,gv);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);
		
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}

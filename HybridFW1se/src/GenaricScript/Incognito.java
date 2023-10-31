package GenaricScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Incognito implements FrameworkConstant
{
@Test
public void openincon() 

{
	System.setProperty(ck,cv);
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--incognito");
	WebDriver driver=new ChromeDriver(opt);
	driver.get(baseurl);
}
}

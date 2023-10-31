package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenaricScript.BaseTest;
import GenaricScript.GenaricScreenshot;
import PomScript.Loginfb;



public class RunnerFB extends BaseTest
{
	
@Test
public void test() throws InterruptedException
{
	
	
	Loginfb a=new Loginfb(driver);
	a.user("ganil.0243@gmail.com");
	Thread.sleep(2000);
	a.pass("GAMGAMGAM");
	Thread.sleep(2000);
	a.button();
	
	
}

}

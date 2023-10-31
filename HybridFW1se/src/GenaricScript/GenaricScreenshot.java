package GenaricScript;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class GenaricScreenshot
{
	@Test
	public void test(WebDriver driver) throws IOException
	{
		String photo="./Photos/";
		Date d=new Date();
		String d1=d.toString();
		String d2=d1.replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		File fi = new File(d2+photo+".jpeg");
		FileHandler.copy(f, fi);
	}
	

}

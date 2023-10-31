package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import GenaricScript.FrameworkConstant;

public class Multiwrite implements FrameworkConstant
{
	@Test
	public void test() throws EncryptedDocumentException, IOException
	{
		System.setProperty(gk,gv);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		int c = ele.size();
		FileInputStream f= new FileInputStream("./Excel/Book1.xlsx");
		Workbook b = WorkbookFactory.create(f);
	 Sheet s = b.createSheet("Linkss");
		
		for(int i=0;i<c;i++)
		{
			WebElement si = ele.get(i);
			String v = si.getAttribute("href");
			Row r = s.createRow(i);
			Cell ce = r.createCell(0);
			ce.setCellValue(v);
			
		}
		FileOutputStream fi=new FileOutputStream("./Excel/Book1.xlsx");
		b.write(fi);
	
	}

}

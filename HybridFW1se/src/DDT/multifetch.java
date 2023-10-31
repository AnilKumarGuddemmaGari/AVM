package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class multifetch 
{
	@Test
	public void test() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream f=new FileInputStream("./Excel/Book1.xlsx");
		Workbook b = WorkbookFactory.create(f);
		Sheet s = b.getSheet("Links");
		int lr = s.getLastRowNum();
		s.getRow(0).getLastCellNum();
		for (int i=0;i<lr;i++)
		{
			Row r = s.getRow(i);
			Cell c = r.getCell(0);
			Thread.sleep(70);
			String st = c.toString();
			System.out.println(st);
			
		}
	}

}

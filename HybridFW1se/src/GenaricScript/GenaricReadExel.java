package GenaricScript;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class GenaricReadExel 
{
	public static String Fetch_data(String sheet,int row, int cel)
	{
		String val="";
		try {
			FileInputStream f= new FileInputStream("./Exel/Book1.xlsx");
			Workbook b=WorkbookFactory.create(f);
			Sheet s = b.getSheet(sheet);
			Row r = s.getRow(row);
			Cell c = r.getCell(cel);
			String value=c.toString();
			System.out.println(value);
		}
		catch(Exception e)
		{
			System.out.println("unable to open");
		}
		return val;
	}

}

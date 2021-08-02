package JavaBasic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelFile {

	public static void main(String[] args) throws Exception  
	{
		File src = new File("D:\\New Folder\\New folder\\testdata.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sht = wb.getSheetAt(0);
		
		String Sheet1= sht.getRow(0).getCell(0).getStringCellValue();
		String Sheet= sht.getRow(0).getCell(1).getStringCellValue();
		String Sheet2= sht.getRow(1).getCell(1).getStringCellValue();
		String Sheet3= sht.getRow(0).getCell(2).getStringCellValue();
		
		System.out.println(" print the Sheet Values " + Sheet1);
		System.out.println(" print the Sheet Values " + Sheet);
		System.out.println(" print the Sheet Values " + Sheet2);
		System.out.println(" print the Sheet Values " + Sheet3);
						
		wb.close();
		
	}

}

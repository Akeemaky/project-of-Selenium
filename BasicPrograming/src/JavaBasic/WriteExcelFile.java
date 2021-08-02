package JavaBasic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcelFile {

	public static void main(String[] args) throws Exception  
	{
		File src = new File("D:\\New Folder\\New folder\\testdata.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sht = wb.getSheetAt(0);
		
		sht.getRow(0).createCell(2).setCellValue("True");
		sht.getRow(1).createCell(2).setCellValue("Fail");
		sht.getRow(2).createCell(2).setCellValue("14.455");
		sht.getRow(3).createCell(2).setCellValue("New Tool");
		sht.getRow(4).createCell(2).setCellValue("Github");
		
		FileOutputStream fos = new FileOutputStream(src);
		
		wb.write(fos);
		
		wb.close();
		
	}

}

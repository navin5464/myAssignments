package marathon1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelmarathon {
	
public static String[][] readData(String filename) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook ("./data/"+filename+".xlsx");
		
		XSSFSheet sheetAt = wb.getSheetAt(0);
		
		int lrownum = sheetAt.getLastRowNum();
		System.out.println("number of rows present :"+ lrownum);
		
		int lCellNum = sheetAt.getRow(0).getLastCellNum();
		/*
		 * System.out.println("number of cells present :"+ lCellNum);
		 * 
		 * XSSFCell cell = sheetAt.getRow(1).getCell(3); String stringCellValue =
		 * cell.getStringCellValue(); System.out.println(stringCellValue);
		 */
		
		String [][] data = new String [lrownum][lCellNum];
		
		for (int i = 1; i <= lrownum; i++) {
			XSSFRow row = sheetAt.getRow(i);
			
			for (int j = 0; j < lCellNum; j++) {
				String fdata = row.getCell(j).getStringCellValue();
				System.out.println(fdata);
				data[i-1][j]=fdata;
			}
			
		}
		wb.close();
		return data;
		}

}

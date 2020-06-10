package assignment.java;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {	

public static void main(String[] args) {
		
	try {		
	     FileInputStream file = new FileInputStream(".\\Test data\\Readingdata.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		 
		 for (int i = 0; i < workbook.getNumberOfSheets(); i++) 
		 {
			  XSSFSheet sheet = workbook.getSheetAt(i);//Returns the sheet count
			  int rownum = sheet.getLastRowNum(); // Returns number of rows present in excel sheet		  
			  int colcount = sheet.getRow(0).getLastCellNum(); // Returns number of cells present in a row  			  
			  
			  for (int j = 0; j < rownum; j++) {
			   XSSFRow row = sheet.getRow(j);

			   for (int k = 0; k < colcount; k++) {
			    String value = row.getCell(k).toString(); // reading the data from cell
			    System.out.print(value + " ");
			   }
			
			  System.out.println();
			  }			  
		 } 
	}
		 
catch(IOException ioe)
         {
          System.err.println("IOException: " + ioe.getMessage());
         }	 			
	 }				
}




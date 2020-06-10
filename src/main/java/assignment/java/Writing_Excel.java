package assignment.java;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Excel {
	
	public static void main(String[] args) {

	try {	
		
		  FileOutputStream file = new FileOutputStream(".\\Test data\\Writingdata.xlsx");		  
		  XSSFWorkbook workbook = new XSSFWorkbook();
		  XSSFSheet sheet = workbook.createSheet("Data");

		  for (int i = 0; i <= 2; i++) {
		   XSSFRow row = sheet.createRow(i);
		   for (int j = 0; j < 3; j++) {
		    row.createCell(0).setCellValue("Selenium Assignment");
		    row.createCell(1).setCellValue("Java Assignment");		    
		    row.createCell(2).setCellValue("Testng Assignment");
		    
		      }
		  }
		
		  
		  XSSFSheet sheet1 = workbook.createSheet("Data2");
		  for (int i = 0; i <= 3; i++) {
		   XSSFRow row = sheet1.createRow(i);
		   for (int j = 0; j < 3; j++) {
		      	row.createCell(0).setCellValue("Selenium-1 Assignment");
			    row.createCell(1).setCellValue("Java-1 Assignment");		    
			    row.createCell(2).setCellValue("Testng-1 Assignment");
		      }
		  }

		  workbook.write(file);		  	  
		  System.out.println("Writing excel is Sucesfully completed");
	}
	
	 catch(IOException ioe) {
     System.err.println("IOException: " + ioe.getMessage());
     }
	
	      }

	}	
	
package assignment.java;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Read_Write_textfile {
	
	public static void main(String[] args) {

	        try
	          {
	             String filename= ".\\Test data\\Readdata.txt";
	             FileWriter fw = new FileWriter(filename); 
	             BufferedWriter Brr=new BufferedWriter(fw);
	             
	             //appends the string to the file
	             Brr.write("Selenium Assignment\n");
	             Brr.write("Java Assignment\n");
	             Brr.write("Testng Assignment\n");
	             Brr.write("Cucumber-BDD Assignment\n");
	             Brr.close();
	             
	             //Reading the File
	             BufferedReader buffred = new BufferedReader(new FileReader(filename)); 		  
	             String str; 
	             while ((str = buffred.readLine()) != null) 
	            	 System.out.println(str);
	             buffred.close();                          
	           }
	        catch(IOException ioe)
	           {
	            System.err.println("IOException: " + ioe.getMessage());
	           }
	        	        
	        }		
	}


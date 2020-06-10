package assignment.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLJDBCdrivers {

	public static void main(String[] args) {

		  try
          {              
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");             
              String userName = "sa";
              String password = "sa123";
              String url= "jdbc:sqlserver://localhost:1434;databaseName=COMPANY";  
             //String url= "jdbc:sqlserver://DESKTOP-OS9HIGU;databaseName=COMPANY;";                    
                          
            Connection con = DriverManager.getConnection(url, userName, password);
            
             if(con!=null)
                 System.out.println("Database Successfully connected");
             
              Statement s1 = con.createStatement();
              ResultSet rs = s1.executeQuery("SELECT * FROM CRED;");
              
              while (rs.next()){            	  
            	  String Username= rs.getString("USERNAME");
            	  String Password=rs.getString("PASSWRD");
            	  System.out.println(Username);
            	  System.out.println(Password); }
              
              con.close();
                             
              /***********************************************************                      
              String[] result = new String[20];
              System.out.println(result.length);
              if(rs!=null){
                  while (rs.next()){
                      for(int i = 1; i <result.length ;i++)
                      {
                          for(int j = 0; j <result.length;j++)
                          {
                              result[j]=rs.getString(i);
                              System.out.println(result[j]);
                          }
                      }
                              }
                            }              
              ****************************************************************/
              
          } 
		  catch (Exception e){
              e.printStackTrace();
          }                    
     }
}


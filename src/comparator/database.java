/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.*;
 /*
 * @author Rinki
 */
public class database {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/project";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
   
   public static void main(String[] args)throws IOException {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection''mohit''
      conn = DriverManager.getConnection(DB_URL ,USER ,PASS);

      //STEP 4: Execute a query
      stmt = conn.createStatement();
      String conti="YES";
      System.out.println("Enter Query");
     while(conti.equalsIgnoreCase("yes"))
      {System.out.println("Enter Query");
              
      String sql = br.readLine();
      stmt.executeUpdate(sql);
   System.out.println("Enter conti");
   conti=br.readLine();
      }}
      catch(SQLException se){
     System.out.println("JDBC ERROR"); //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      System.out.println("Class ERROR");//Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      System.out.println("nothing");}// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){System.out.println("end");
         se.printStackTrace();
      }//end finally try
   }//end try
}//end main
}//end JDBCExample


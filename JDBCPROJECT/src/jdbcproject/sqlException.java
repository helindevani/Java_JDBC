/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcproject;

import java.sql.*;
import java.util.Scanner;
public class sqlException {
      public static void main(String[] args)throws Exception {
       String url="jdbc:mysql://localhost:3306/student_db";
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,"root","");
       if(con!=null)
       {
           System.out.println("sucessfully connected");
           String sql="insert into s_info values(139,'bhavy','a')";
           try(Connection con1=DriverManager.getConnection(url,"root"," "))
           {
                Statement stmt;
               stmt=con.createStatement();
                stmt.executeUpdate(sql);
           }
           catch(SQLException sq)
           {
               System.out.println(sq.getErrorCode());
                  System.out.println(sq.getSQLState());
                     System.out.println(sq.getMessage());
                     //sq.printStackTrace();
           }
       }
       
     }
}

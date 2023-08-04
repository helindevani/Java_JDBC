/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ljeng
 */
public class gtuQuestion2 {
    
      public static void main(String[] args)throws Exception {
    
     String url="jdbc:mysql://localhost:3306/student_db";
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,"root","");
       if(con!=null)
       {
           System.out.println("sucessfully connected");
       }
       
       String sql="select * from gtutable where age>40";
       
       
       System.out.println("updating method ");
       Statement stmt1;
       stmt1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
       ResultSet rs1;
       rs1=stmt1.executeQuery(sql);
       
       int i=0;
       
       while(rs1.next())
       {
          
           
          int r=rs1.getInt(1)+500;
          rs1.updateInt(1,r);
          rs1.updateRow();
          System.out.println("basic update"+rs1.getInt(1));
          i++;
       }
       
           System.out.println("rows affected"+i);
           
      }
}

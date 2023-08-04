/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcproject;

import java.sql.*;
import java.util.*;
/**
 *
 * @author ljeng
 */
public class createinsertupdatedropdeletetable {
    public static void main(String[] args)throws Exception {
        
        Scanner sc=new Scanner(System.in);
        
       String url="jdbc:mysql://localhost:3306/student_db";
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,"root","");
       if(con!=null)
       {
           System.out.println("sucessfully connected");
       }
       //String sql="Create table s_info(id int(10),name varchar(50),division varchar(50))";
       Statement stmt;
       stmt=con.createStatement();
       //stmt.executeUpdate(sql);
       //System.out.println("table created");
       
//       String sql1="Insert INTO s_info VALUES (1,'brijesh', 'b')";==
//       Statement stmt;
//       stmt=con.createStatement();
//       stmt.executeUpdate(sql1);
//       System.out.println("1 record inserted");
       
//      String sql4="Insert INTO s_info VALUES (2,'brijesh', 'a')";
//      
//       stmt.executeUpdate(sql4);
//       System.out.println("1 record inserted");
//       
//       String sql2="Update s_info SET name='helin' where name='brijesh'";
//       stmt.executeUpdate(sql2);
//       System.out.println("1 record updated");
//       
       
       String sql3=sc.nextLine();
       stmt.executeUpdate(sql3);
       System.out.println("1 record deleted");
     
    
//       String sql5="drop table s_info";
//       stmt.executeUpdate(sql5);
//       System.out.println("table drop successfully.");

       
    }
}

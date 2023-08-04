/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcproject;

import java.sql.*;
import java.util.*;
public class uservaluePrepaidstatemnent {
    public static void main(String[] args)throws Exception {
        
        Scanner sc=new Scanner(System.in);
        
       String url="jdbc:mysql://localhost:3306/student_db";
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,"root","");
       if(con!=null)
       {
           System.out.println("sucessfully connected");
       }
       String sq="insert into s_info values(101,'brijesh','A')";
         String sq1="insert into s_info values(?,?,?)";
         
           PreparedStatement pst;
           
           pst=con.prepareStatement(sq);
           pst.executeUpdate();
           
           pst=con.prepareStatement(sq1);
           
           int rollno=sc.nextInt();
           String name=sc.next();
           String division=sc.next();
          
               pst.setInt(1,rollno);
                pst.setString(2,name);
                 pst.setString(3,division);
                 int r=pst.executeUpdate();
                 
     
           
           System.out.println("rows affected"+r);
           
             
//           pst.setInt(1,102);
//           pst.setString(2,"helin");
//           pst.setString(3,"b");
          
//          int r=pst.executeUpdate();
//            int r=pst.executeUpdate();
       }   
}

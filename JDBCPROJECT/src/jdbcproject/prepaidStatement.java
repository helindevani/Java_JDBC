/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcproject;


import java.sql.*;
import java.util.*;
public class prepaidStatement {
       @SuppressWarnings("empty-statement")
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
           
           int[] rollno={103,104,105,106,107,108,109,110,111,112};
           String[] name={"brijesh","helin","g","r","a","b","c","u","i","t"};
           String[] division={"brijesh","helin","g","r","a","b","c","u","i","t"};
           int r=0;
           for(int i=1;i<rollno.length;i++)
           {
               pst.setInt(1,rollno[i]);
                pst.setString(2,name[i]);
                 pst.setString(3,division[i]);
                 r=pst.executeUpdate();
                 
                 r=i+1;
           }
           System.out.println("rows affected"+r);
           
             
//           pst.setInt(1,102);
//           pst.setString(2,"helin");
//           pst.setString(3,"b");
          
//          int r=pst.executeUpdate();
//            int r=pst.executeUpdate();
       }   
}

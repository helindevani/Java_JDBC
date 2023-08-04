/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcproject;


import java.sql.*;
import java.util.*;
public class bankingQuestiongtu {
      public static void main(String[] args)throws Exception {
        
       String url="jdbc:mysql://localhost:3306/student_db";
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,"root","");
       if(con!=null)
       {
           System.out.println("sucessfully connected");
       }
//       String sq3="Create table bank(acc_no int(100),c_name varchar(50),Mobaile_no int(50),address varchar(50))";
//       Statement stmt;
//       stmt=con.createStatement();
//       stmt.executeUpdate(sq3);
//       System.out.println("table created");
       
          String sq="insert into bank values(101225285,'brijesh5',282828,'una')";
         String sq2="insert into bank values(?,?,?,?)";
         
           PreparedStatement pst;
           
           pst=con.prepareStatement(sq);
           pst.executeUpdate();
           
           pst=con.prepareStatement(sq2);
           
           pst.setInt(1,1021212121);
                pst.setString(2,"brijesh");
                 pst.setInt(3,82228285);
                   pst.setString(4,"surat");
                  int r=pst.executeUpdate();
                  System.out.println("rows affected"+r);
                  
                 String sq4="select * from bank";
       Statement stmt;
      stmt=con.createStatement();
       ResultSet rs;
       rs=stmt.executeQuery(sq4);
       
       while(rs.next())
       {
           System.out.println("acc_no:"+rs.getInt(1));
           System.out.println("c_name:"+rs.getString(2));
          System.out.println("phone:"+rs.getInt(3));
          System.out.println("Address:"+rs.getString(4));
      }
       
       
          System.out.println("updating method ");
       String sq5="update bank SET Mobaile_no =? where address=?";
     
           
           pst=con.prepareStatement(sq5);
           pst.setInt(1,1234778999);
           pst.setString(2,"surat");
           pst.executeUpdate();
}
}

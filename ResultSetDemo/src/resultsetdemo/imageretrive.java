/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultsetdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.*;
public class imageretrive {
     public static void main(String[] args)throws Exception {
        
        Scanner sc=new Scanner(System.in);
        
       String url="jdbc:mysql://localhost:3306/student_db";
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,"root","");
       if(con!=null)
       {
           System.out.println("sucessfully connected");
       }
       String sql="select * from image";
       PreparedStatement pst;
       pst=con.prepareStatement(sql);
       ResultSet rs=pst.executeQuery();
       rs.next();
       
       Blob b=rs.getBlob(1);
       byte[] arr=b.getBytes(1,(int)b.length());
       FileOutputStream fs= new FileOutputStream("E:\\data visualization/me.png");
       fs.write(arr);
       System.out.println("saved");
     }
    
}


package resultsetdemo;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.*;
public class imageinsertindatabasedemo {
     public static void main(String[] args)throws Exception {
        
        Scanner sc=new Scanner(System.in);
        
       String url="jdbc:mysql://localhost:3306/student_db";
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,"root","");
       if(con!=null)
       {
           System.out.println("sucessfully connected");
       }
       
       String sql="insert into image values(?)";
        PreparedStatement pst;
        pst=con.prepareStatement(sql);
        
        File mf=new File("C:\\Users\\ljeng\\Documents\\NetBeansProjects\\ResultSetDemo\\src\\resultsetdemo/me.png");
        FileInputStream in=new FileInputStream(mf);
        
        pst.setBinaryStream(1,in,(int)mf.length());
        pst.executeUpdate();
        
     }
    
}


package jdbcproject;
  
import java.sql.*;
import java.util.Scanner;
public class JDBCPROJECT {

   
    public static void main(String[] args)throws Exception {
       String url="jdbc:mysql://localhost:3306/student_db";
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,"root","");
       if(con!=null)
       {
           System.out.println("sucessfully connected");
           
            con.setAutoCommit(false);
       
            String sql="insert into s_info values(130,'bhavy','a')";
            
            Statement stmt;
            stmt=con.createStatement();
            stmt.executeUpdate(sql);
            stmt.executeUpdate("update s_info set name='raju' where id=130");
            Savepoint sp=con.setSavepoint();
            stmt.executeUpdate("delete from s_info where id=101");
            con.rollback(sp);
            con.commit();
//            String c;
//            Scanner rs=new Scanner(System.in);
//            c=rs.next();
//            
//            if(c.equalsIgnoreCase("c"))
//            {
//                con.commit();
//            }
//            
//            if(c.equalsIgnoreCase("r"))
//            {
//                con.rollback();
//            }
       }
      
    }
    
}

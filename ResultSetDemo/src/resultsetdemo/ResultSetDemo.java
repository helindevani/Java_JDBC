
package resultsetdemo;

import java.sql.*;
public class ResultSetDemo {

    public static void main(String[] args)throws Exception {
        
       String url="jdbc:mysql://localhost:3306/student_db";
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,"root","");
       if(con!=null)
       {
           System.out.println("sucessfully connected");
       }
       String sql="select * from s_info";
//       Statement stmt;
//       stmt=con.createStatement();
//       ResultSet rs;
//       rs=stmt.executeQuery(sql);
       
//       while(rs.next())
//       {
//           System.out.println("id:"+rs.getInt("id"));
//           System.out.println("name:"+rs.getString(2));
//           System.out.println("division:"+rs.getString(3));
//       }
       
//       //navigation method
//       
//       rs.first();
//         System.out.println("navigation method of first");
//       System.out.println("id:"+rs.getInt(1));
//       
//        rs.last();
//       System.out.println("navigation method of last");
//       System.out.println("id:"+rs.getInt(1));
//       
//       rs.previous();
//       System.out.println("navigation method of previous");
//       System.out.println("id:"+rs.getInt(1));
//       
//          rs.absolute(2);
//       System.out.println("navigation method of absolute");
//       System.out.println("id:"+rs.getInt(1));
    
       //updating method
       System.out.println("updating method ");
       Statement stmt1;
       stmt1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
       ResultSet rs1;
       rs1=stmt1.executeQuery(sql);
       while(rs1.next())
       {
           if((rs1.getInt(1))==7)
           {
               int r=rs1.getInt(1)+5;
                rs1.updateInt(1, r);
                rs1.updateRow();
                System.out.println("id:"+rs1.getInt("id"));
           }
       }
       
    }
}
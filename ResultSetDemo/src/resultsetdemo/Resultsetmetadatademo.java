
package resultsetdemo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class Resultsetmetadatademo {
    public static void main(String[] args)throws Exception {
    
     String url="jdbc:mysql://localhost:3306/student_db";
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,"root","");
       if(con!=null)
       {
           System.out.println("sucessfully connected");
       }
       
       String sql="select * from s_info";
       
       Statement stmt1;
       stmt1=con.createStatement();
       ResultSet rs;
       rs=stmt1.executeQuery(sql);
       
       ResultSetMetaData rsmd=rs.getMetaData();
       
       System.out.println("col. name"+rsmd.getColumnName(1));
       System.out.println("table name"+rsmd.getTableName(1));
       System.out.println("col. count name"+rsmd.getColumnCount());
       System.out.println("class name"+rsmd.getClass());
       System.out.println("datatype name"+rsmd.getColumnType(2));
       System.out.println("datatype name"+rsmd.getColumnTypeName(2));
       System.out.println("alias name"+rsmd.getColumnLabel(1));
       
       
       DatabaseMetaData dbm=con.getMetaData();
       System.out.println(dbm.getDatabaseProductName());
       System.out.println(dbm.getDatabaseProductVersion());
       System.out.println(dbm.getURL());
       System.out.println(dbm.getUserName());
       System.out.println(dbm.getDriverName());
       System.out.println(dbm.getDriverVersion());
       System.out.println(dbm.supportsSavepoints());
       System.out.println(dbm.supportsStoredProcedures());
       
    
}
}

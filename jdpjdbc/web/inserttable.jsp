<%-- 
    Document   : inserttable
    Created on : Apr 28, 2023, 10:29:31 AM
    Author     : ljeng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          response.setContentType("text/html");
        
            String username=request.getParameter("name");
            String password=request.getParameter("div");
        
            String url="jdbc:mysql://localhost:3306/student_db";
            Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection(url,"root","");
                if(con!=null)
                {
                    System.out.println("sucessfully connected");
                }
                String sql="insert into student values(?,?)";
                PreparedStatement pst;
                pst=con.prepareStatement(sql);
       
                pst.setString(1,username);
                pst.setString(2,password);
                pst.executeUpdate();
                
                out.println("inserted");

         %>
    </body>
</html>

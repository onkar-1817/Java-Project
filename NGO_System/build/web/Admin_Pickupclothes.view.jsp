<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin pickupclothes</title>
        <link rel="stylesheet" href="bootstrap.css"/>
        <style>
            .container
            {
                margin-top: 40px;
            }
            .jumbotron
            {
                width: 110%;
                box-shadow: 0px 0px 5px 5px black;
            }
        </style>
    </head>
    <body>
        <%@include file="Admin_Header.jsp" %>
        <div class="container">
        <div class="jumbotron">
            <table class="table">
  <thead class="thead-dark">
      <b> <center><h3>PICKUP CLOTHES</h3></center></b>
	<br>
    <tr>
      <th scope="col">Sr.No</th>  
      <th scope="col">Full name</th>
      <th scope="col">Date</th>
      <th scope="col">Time</th>
      <th scope="col">Address</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
    <%
      Connection cn=null;
    Statement st=null;
    
 try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/NGO_system","root","root");
           st=cn.createStatement();
           String sql="select * from pickup_clothes;";
           ResultSet rs=st.executeQuery(sql);
           while(rs.next())
           {
           
           
      %>
    <tr>
        <form action="Pickup_clothes" method="POST">
     <td><%=rs.getString("s_id")%>
         <input type="hidden" name="txt_num"  value="<%=rs.getString("s_id")%>"/>
     </td>
      <td>
          <input type="text" name="txt_name"  value="<%=rs.getString("fullname")%>"/>
      </td>
      <td>
          <input type="text" name="txt_date" value="<%=rs.getString("dat")%>"/>
      </td>
      <td>
          <input type="text"  name="txt_time" value="<%=rs.getString("tim")%>"/>
      </td>
      <td>
          <input type="text" name="txt_address"  value="<%=rs.getString("address")%>"/>
      </td>
      <td>
       <input type="submit" name="btn_save" value="Update" class="btn btn-primary "/>
       <input type="submit" name="btn_save" value="Delete" class="btn btn-secondary "/>
      </td>
        </form>
    </tr>
     <%
     }
        }catch(Exception ex)
        {
           
        }
     %>

  </tbody>
</table>

        </div>
        </div>    
    </body>
</html>

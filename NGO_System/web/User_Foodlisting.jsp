<%-- 
    Document   : User_Foodlisting
    Created on : 21 Mar, 2024, 7:59:54 AM
    Author     : Onkar
--%>


<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Food</title>
        <link rel="stylesheet" href="bootstrap.css"/>
        <style>
            .container
            {
                margin-top: 40px;
                margin-right: 20px;
            }
            .jumbotron
            {
                margin: auto auto auto auto;
                width: 130%;
                margin-left: -150px;
                box-shadow: 0px 0px 5px 5px black;
                
            }
        </style>
    </head>
    <body>
        <%@include file="User_Foodlisting.jsp" %>
        <div class="container">
        <div class="jumbotron">
            <table class="table">
  <thead class="thead-dark">
      <b> <center><h3>FOOD</h3></center></b>
	<br>
    <tr>
        <th scope="col">Sr.No</th>
      <th scope="col">Full name</th>
      <th scope="col">Food item</th>
       <th scope="col">Type of food</th>
      <th scope="col">Quantity</th>
      <th scope="col">Expiry date</th>
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
           String sql="select * from food where contact='"+session.getAttribute("contact")+"'";
           ResultSet rs=st.executeQuery(sql);
           while(rs.next())
           {
           
           
      %>
    <tr>
        <form action="Food_Listing" method="POST">
       <td><%=rs.getString("s_id")%>
           <input type="hidden" name="txt_id" value="<%=rs.getString("s_id")%>"/>
       </td>
       <td>
          <input type="text" name="txt_name" value="<%=rs.getString("fullname")%>"/>
      </td>
      <td>
          <input type="text" name="txt_food" value="<%=rs.getString("item")%>"/>
      </td>
      <td>
          <input type="text" name="checkbox" value="<%=rs.getString("typefood")%>"/>
      </td>
      <td>
          <input type="text" name="txt_num" value="<%=rs.getString("qun")%>"/>
      </td>
      <td>
          <input type="text" name="txt_date" value="<%=rs.getString("expi_date")%>"/>
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

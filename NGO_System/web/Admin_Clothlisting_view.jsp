<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin clothes</title>
        <link rel="stylesheet" href="bootstrap.css"/>
        <style>
            .container
            {
                margin-top: 40px;
            }
            .jumbotron
            {
                margin-left: -205px;
                width: 180%;
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
      <b> <center><h3>CLOTHES</h3></center></b>
	<br>
    <tr>
       <th scope="col">Sr.No</th> 
     
      <th scope="col"> Name</th>
      <th scope="col">Type Clothes</th>
       <th scope="col">Items</th>
      <th scope="col">Condition of clothes</th>
      <th scope="col">Quantity</th>
      <th scope="col">Addtional Detail</th>
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
           String sql="select * from clothes;";
           ResultSet rs=st.executeQuery(sql);
           while(rs.next())
           {
           
           
      %>
    <tr>
        <form action="Clothes_listing" method="POST">
     <td><%=rs.getString("s_id")%>
         <input type="hidden" name="txt_id" value="<%=rs.getString("s_id")%>"/>
     </td>
     
      <td>
          <input type="text" name="txt_name" value="<%=rs.getString("name")%>"/>
      </td>
      <td>
          <input type="text" name="checkbox"  value="<%=rs.getString("typeclothes")%>"/>
      </td>
      <td>
          <input type="text" name="txt_item" value="<%=rs.getString("item")%>"/>
      </td>
      <td>
          <input type="text" name="txt_check" value="<%=rs.getString("condcloth")%>"/>
      </td>
      <td>
          <input type="text" name="txt_qun" value="<%=rs.getString("qun")%>"/>
      </td>
      <td>
          <input type="text"  name="txt_add"  value="<%=rs.getString("detail")%>"/>  
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

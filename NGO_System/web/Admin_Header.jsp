<%-- 
    Document   : Admin_Header
    Created on : 31 Jan, 2024, 10:53:18 AM
    Author     : Onkar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>admin</title>
        <link rel="stylesheet" href="bootstrap.css"/>
        <style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}
body
{
    background-color: lightblue;
}
</style>
    </head>
    <body>
      
<ul>
    <li><a class="active" href="#Home">NGO</a></li>
    <li><a href="Admin_Foodlisting_view.jsp">Food List</a></li>
    <li><a href="Admin_Pickupfood.view.jsp">Pickup Food List</a></li>
    <li><a href="Admin_Clothlisting_view.jsp">Clothes List</a></li>
    <li><a href="Admin_Pickupclothes.view.jsp">Pickup Clothes List</a></li>
    <li><a href="Admin_Notification_view.jsp">Notification List</a></li>
    <li><a href="Admin_Feedback_view.jsp">Feedback List</a></li>
    
</ul>

    </body>
</html>

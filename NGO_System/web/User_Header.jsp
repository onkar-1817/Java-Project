<%-- 
    Document   : User_Header
    Created on : 21 Mar, 2024, 7:19:28 AM
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
    <li><a href="food_listing.jsp">Food</a></li>
    <li><a href="pickup_food.jsp">Pickup Food</a></li>
    <li><a href="clothlisting.jsp">Clothes</a></li>
    <li><a href="clothes_pickup.jsp">Pickup Clothes</a></li>
    <li><a href="notification.jsp">Notification</a></li>
    <li><a href="User_Foodlist.jsp">Food List</a></li>
    <li><a href="User_ClothListing.jsp">Clothes List</a></li>
    
    <li><a href="feedback.jsp">Feedback</a></li>
    
    
</ul>

    </body>
</html>

<%-- 
    Document   : pickup_food
    Created on : 15 Jan, 2024, 4:14:21 PM
    Author     : Onkar
--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Food Pickup Form</title>
    <link rel="stylesheet" href="bootstrap.css"/>
    <script src="validation.js"></script>
    <style>
        body {
            
             background-color: lightblue;
            
        }
        .jumbotron
        {
            margin: auto auto auto auto;
            width: 45%;
            background-color: lightgoldenrodyellow;
            box-shadow: 0px 0px 5px 5px black;
            border-radius: 20px;
        } 
        .container
        {
            margin-top: 10px;
        }
        label
        {
            font-weight: bold;
        }
        h1
        {
            margin-top: -15px;
        }
    </style>
</head>
<body>
     <%@include file="User_Header.jsp" %>
    <div class="container">
        <form action="Pickup_food" method="POST">
        <div class="jumbotron">
            <h1 style="text-align: center">Pickup Forms Food</h1>
            <hr>
            <div class="row">
                <div class="col-sm-12">
                  
                    <label> Full Name</label>
                    <input type="text" name="txt_name" placeholder="Enter your name" class="form-control" onkeypress="javasctript:return isString(event)" required=""/>
                </div>
            </div>
            </br>
            <div class="row">
                <div class="col-sm-12">
                    <label>Preferred Date</label>
                    <input type="date" name="txt_date" class="form-control" min="2024-01-01" max="2025-12-31" required/>
                </div>
            </div>
            </br>
             <div class="row">
                <div class="col-sm-12">
                    <label>Preferred Time</label>
                    <input type="time" name="txt_time" class="form-control" required/>
                </div>
            </div>
            </br>
            <div class="row">
                <div class="col-sm-12">
                    <label>Address</label>
                    <textarea rows="3" class="form-control" name="txt_address" placeholder="Enter your address"  onkeypress="javasctript:return isAlphanumric(event)" required></textarea>
                </div>
            </div>
            </br>
            <input type="submit" name="btn_save" value="Donate" class="btn btn-primary btn-lg btn-block"/>
              
        </div>
        </form>>     
    </div>
  </body>
</html> 
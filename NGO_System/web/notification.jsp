<%-- 
    Document   : notification
    Created on : 27 Jan, 2024, 4:04:53 PM
    Author     : Onkar 
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Notification</title>
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
            margin-top: 50px;
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
            <form action="Notification" method="POST">
            <div class="jumbotron">
                <h1 style="text-align: center">Notification</h1>
                <hr>
                <div class="row">
                    <div class="col-sm-12">
                        
                        <label>Registration Number</label>
                        <input type="number" name="txt_num" placeholder="Enter your number" class="form-control" onkeypress="javascript:return isNumber(event)" required/>
                    </div>
                </div>
                </br>
                <div class="row">
                    <div class="col-sm-12">
                        <label> Organization Name</label>
                        <input type="text" name="txt_name" placeholder="Enter your name" class="form-control" onkeypress="javascript:return isString(event)"/>
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-sm-12">
                        <label>Thanking message</label>
                        <textarea rows="3" class="form-control" placeholder="Enter messsage" name="txt_msg" onkeypress="javascript:return isString(event)"></textarea>
                    </div>
                 </div>
                 <br>
                    <input type="submit" name="btn_save" value="Submit" class="btn btn-primary btn-lg btn-block"/>
                    
            </div>
            </form>     
        </div>
    </body>
</html>

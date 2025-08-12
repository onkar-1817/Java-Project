<%-- 
    Document   : feedback
    Created on : 31 Jan, 2024, 8:51:46 AM
    Author     : Onkar
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback</title>
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
            margin-top: 40px;
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
            <form action="Feedback_user"  method="POST">
            <div class="jumbotron">
                <h1 style="text-align: center">Feedback</h1>
                <hr>
                <div class="row">
                    <div class="col-sm-12">
                        <label>Name</label>
                        <input type="text" name="txt_name" placeholder="Enter your name" class="form-control" onkeypress="javascript:return isString(event)" required/>
                    </div>
                </div>
                    <br>
                     <div class="row">
                    <div class="col-sm-12">
                        <label>Email</label>
                        <input type="email" name="txt_email" placeholder="Enter your email" class="form-control" onkeypress="javascript:return isAlphanumric(event)"/>
                    </div>
                </div>
                 <br>
                     <div class="row">
                    <div class="col-sm-12">
                        <label>Feedback</label>
                        <textarea rows="3" class="form-control" name="txt_mes"  onkeypress="javascript:return isString(event)"></textarea>
                    </div>
                </div>
                 <br>
                 <input type="submit" name="btn_save" value="Submit" class="btn btn-primary btn-lg btn-block"/>
            </div>
            </form>     
        </div>
    </body>
</html>

<%-- 
    Document   : login 
    Created on : 10 Jan, 2024, 7:59:58 PM
    Author     : Onkar
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login form</title>
        <link rel="stylesheet"  href="bootstrap.css"/>
        <script src="validation.js"></script>
        <style>
            body
            {
                background-color: lightblue;
            }
            .jumbotron
            {
                width: 30%;
                background-color: lightgoldenrodyellow;
                margin: auto auto auto auto;
                margin-top: 130px;
                border-radius: 20px;
                 box-shadow: 0px 0px 5px 5px black;
            }
            h1
            {
                font-size: 40px;
                margin-top: -30px;
            }
            label
            {
                font-weight: bold;
            }
            a
            {
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <form action="UserLogin" method="POST">
        <div class="jumbotron">
            <h1 style="text-align: center">Login form</h1>
            <hr>
            <div class="row">
                <div class="col-sm-12">
                    <label>Email<span style="color:red">*</span></label>
                     <input type="email" name="txt_email" placeholder="Enter your email" class="form-control" required/>
                </div>
            </div>
            </br>
            <div class="row">
                <div class="col-sm-12">
                    <label>Password</label>
                    <input type="password" name="txt_pass" class="form-control" placeholder="Enter password" onkeypress="javascript:return isNumber(event)"/>
                </div>
            </div>
            </br>
            <div class="row">
                <div class="col-sm-12">
                    <a href="User_registration.jsp">New Member Register Here</a>
                </div>
            </div>
            </br>
            <input type="submit" name="btn_save" value="Login" class="btn btn-primary btn-lg btn-block"/>
            
        </div>
        </form>    
    </body>
</html>

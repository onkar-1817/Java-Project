<%-- 
    Document   : clothlisting
    Created on : 18 Jan, 2024, 7:39:45 PM
    Author     : Onkar
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>clothes donate</title>
        <link rel="stylesheet" href="bootstrap.css"/>
        <script src="validation.js"></script>
        <style>
            body
            {
                background-color: lightblue;
            }
            .jumbotron
            {
                width:45%;
                margin: auto auto auto auto;
                background-color: lightgoldenrodyellow;
                border-radius: 20px;
                margin-top: 10px;
                box-shadow: 0px 0px 5px 5px black;
                
            }
              label
            {
              color:#273746; 
              font-weight: bold;
            }
            h1
            {
                 margin-top: -30px;
                font-size: 40px;
            }
            .container
            {
                margin-top: -5px;
            }
        </style>
    </head>
    <body>
        <%@include file="User_Header.jsp" %>
        <div class="container">
            <form action="Clothes_listing" method="POST">
            <div class="jumbotron">
                <h1 style="text-align: center">Clothes Donation Form</h1>
                <hr>
                
                <br>
                <div class="row">
                    <div class="col-sm-12">
                        <label>Full Name</label> 
                        <input type="text" name="txt_name" class="form-control" placeholder="Enter name" onkeypress="javascript:return isString(event)" required/>
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-sm-12">
                        <label>Type of clothes</label><br>
                        <input type="checkbox" name="checkbox" value="Mens"/>Men's</br>
                        <input type="checkbox" name="checkbox" value="All"/>All</br>
                         <input type="checkbox" name="checkbox" value="Childrens"/>Children's</br>
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-sm-6">
                        <label>Clothing items</label>
                        <input type="text" name="txt_item" class="form-control" placeholder="Enter clothes items" onkeypress="javascript:return isString(event)" required/>
                    </div>
                    <div class="col-sm-6">
                        <label>Quantity</label>
                        <input type="text"name="txt_qun" class="form-control" placeholder="Enter Quantity"  required/>
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-sm-5">
                        <label>Condition of clothes</label><br>
                        <input type="checkbox" name="txt_check" value="New"/>New</br>
                        <input type="checkbox" name="txt_check" value="Gently Used"/>Gently Used</br>
                         <input type="checkbox" name="txt_check" value="Well-Worn"/>Well-Worn</br> 
                    </div>
                    <div class="col-sm-7">
                        <label>Addtional Details</label>
                        <textarea rows="3" class="form-control" name="txt_add" placeholder="Enter details" onkeypress="javascript:return isString(event)" required></textarea>
                    </div>
                </div>
                </br>
                   <input type="submit" name="btn_save" value="Submit" class="btn btn-primary btn-lg btn-block"/>
            </div>
            </form>    
        </div>
    </body>
</html>

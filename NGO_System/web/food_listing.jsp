
<%-- 
    Document   : food_listing
    Created on : 12 Jan, 2024, 7:29:18 PM
    Author     : Onkar
--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Food Listing</title>
        <link rel="stylesheet" href="bootstrap.css"/>
        <script src="validation.js"></script>
        <style>
            body
            {
                background-color: lightblue;
            }
            .jumbotron
            {
                width:50%;
                margin: auto auto auto auto;
                background-color: lightgoldenrodyellow;
                border-radius: 20px;
                margin-top: 10px;
                box-shadow: 0px 0px 5px 5px black;
                
            }
            h1
            {
                margin-top: -10px;
                font-size: 40px;
            }
            .container
            {
                margin-top: 5px;
            }
            label
            {
                font-size: 16px;
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <%@include file="User_Header.jsp" %>
        <div class="container">
          <form action="Food_Listing" method="POST">
            <div class="jumbotron">
                <h1 style="text-align: center">Food Donation Form</h1>
                <hr>
                 
                <div class="row">
                    <div class="col-sm-6">
                       <label>Full Name</label>
                       <input type="text" name="txt_name" class="form-control" placeholder="Enter your name" onkeypress="javascript:return isString(event)" required/>
                    </div>
                    <div class="col-sm-6">
                       <label>Food items</label>
                        <input type="text" name="txt_food" class="form-control" placeholder="Enter items"onkeypress="javascript:return isString(event)"/>
                    </div>
                </div>
                </br>
                <div class="row>"
                    <div class="col-sm-6">
                        <label>Type of Food</label></br>
                         <input type="checkbox" name="checkbox" value="Veg"/>Veg</br>
                        <input type="checkbox" name="checkbox" value=" Non-veg"/> Non-veg</br>
                         <input type="checkbox" name="checkbox" value=" Packed"/>Packed</br>
                        <input type="checkbox" name="checkbox" value="Fresh"/>Fresh</br>
                    </div>
                     </br>
                <div class="row">
                    <div class="col-sm-8">
                        <label>Quantity</label>
                        <input type="text" name="txt_num" class="form-control" placeholder="Enter Quantity"  required/>
                    </div>
                </div>
                    </br>
                     <div class="row">
                         <div class="col-sm-12">
                             <label>Expiry Date</label>
                             <input type="date" name="txt_date" class="form-control" min="2023-10-1" max="2024-10-1" required/>
                         </div>
                    </div> 
                    </br>
                   <input type="submit" name="btn_save" value="Submit" class="btn btn-primary btn-lg btn-block"/>
                 
            </div>
         </form>   
            </div>
        </body>
</html>

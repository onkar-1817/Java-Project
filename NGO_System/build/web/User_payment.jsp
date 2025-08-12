<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="bootstrap.css"/>
    <script src="validation.js"></script>
    <title>UPI Payment</title>
    <style>
        .mainbody {
            width: 100%;
            height: 645px;
            height: 540px;
            position: relative; 
        }

        .jumbotron1 {
            width: 60%;
            height: 500px;
            background-color: white;
            position: absolute; /* Use absolute positioning */
            top: 50%; /* Center vertically */
            left: 50%; /* Center horizontally */
            transform: translate(-50%, -50%); /* Center the div */
            border-radius: 30px;
            box-shadow: 0px 0px 20px rgba(0,0,0,0.2);
            box-shadow: 0px 0px 20px rgba(0,0,0,0.5);
            
        }
        .nestedCarddivleft{
           
            width: 25%;
            width: 40%;
            height: 500px;
            background-color: #8b5eb0;        
                     
            background-size: cover;
            background-position: center;
            border-radius: 30px;
            float: left;
               
            box-shadow: inset 0px 0px 150px 0px #000;
        }

        .nestedCarddivright{
            
            width: 60%;
            height: 500px;
            background-color: white;
            border-radius: 30px;
            float: right;          
        }
        
    </style>
</head>
<body>
    <form action="Payment_Page" method="POST">      
        <br>
    <div class="mainbody">
        <div class="jumbotron1">
            <div class="nestedCarddivleft leftDiv ">
                            </div>
            
            <div class="nestedCarddivright">
                <div class="container">
                    <br>
                   <br><br>                 
                 <h3  align="center" style="margin-left: 2%;  font-weight: bold;" >UPI Payment</h3>
                 <br><br>
               
                            <div class="input-group">
                                <input class="input " name="txt_upi_id"  type="text" id="maleName" style="color: black"required>
                                    <label class="label" for="maleName">UPI ID</label>
                            </div><br>
                            <div class="input-group">
                                <input class="input "  name="amount" type="tel" id="femaleName" style="color: black" onkeypress="javascript:return isNumber(event)" required>
                                    <label class="label" for="femaleName">Amount</label>
                            </div>                                                               
            </div>
                <br>
                      <div class="row">
                                <div class="col-sm-12">
                                     <!--<button class="btn btn-primary btn-lg btn-block" type="button">Next</button>-->
                                     <button style=" width: 90%; font-size: 20px; margin-left: 20px;" class="btn btn-primary hidden" name="txt_submit" value="Pay" id="register" type="submit" >Pay</button>
                                </div>
                                
                               
                                </div>             
                        </div>
                    </div>     
        </div>
    </form>    
</body>
</html>
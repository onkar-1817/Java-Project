<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Form</title>
        <link rel="stylesheet" href="bootstrap.css"/>
        <script src="validation.js"></script>
        <style>
            body
            {
               background-color: lightblue;
            }
            .jumbotron
            {
                width:55%;
                background-color: lightgoldenrodyellow;
                margin: auto auto auto auto;
                border-radius: 20px;
                margin-top: 10px;
                box-shadow: 0px 0px 5px 5px black;
                
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
            span
            {
                color: red;
            }
            label
            {
              color:#273746; 
              font-weight: bold;
            }
            
            
             
        </style>
    </head>
    <body>
         <div class="container">   
             <form action="Registration" method="POST">
        <div class="jumbotron">
            <h1 style="text-align: center">Registration form</h1>
             <hr>
            
          <div class="row">
               <div class="col-sm-4">
                  <label>Registration number</label>
                  <input type="number" name="txt_fnum" placeholder="Enter  number" class="form-control" onkeypress="javasctript:return isNumber(event)" required=""/>
              </div>
                 <div class="col-sm-8">
                  <label>Name of owner<span>*</span></label>
                  <input type="text" name="txt_owner" placeholder="Enter name" class="form-control" onkeypress="javasctript:return isString(event)"required="Hello" title="Hello"/>
              </div>
              
          </div>
             </br>
             <div class="row">
                 <div class="col-sm-12">
                     <label>Organization Name<span>*</span></label>
                  <input type="text" name="txt_name" placeholder="Enter organization name" class="form-control"onkeypress="javasctript:return isString(event)"required="Hello" title="Hello"/>
              </div>
                 
            </div>
              </br>
             <div class="row">
                 <div class="col-sm-12">
                 <label>Address</label>
                 <textarea rows="3" class="form-control" name="txt_add" placeholder="Enter your address"  onkeypress="javasctript:return isAlphanumric(event)" required></textarea>
                 </div>
             </div>
               </br>
             <div class="row">
                 <div class="col-sm-6">
                     <label>District</label>
                     <select class="form-control" name="txt_dist">
                         <option>Select District</option>
                         <option>Kolhapur</option>
                     </select>
                 </div>
                  <div class="col-sm-6">
                     <label>Taluka</label>
                     <select class="form-control" name="txt_tal">
                         <option>Select Taluka</option>
                         <option>Gadhinglaj</option>
                     </select>
                     
                 </div>
             </div>
                </br>
             <div class="row">
                  <div class="col-sm-6">
                      <label>Email<span>*</span></label>
                     <input type="email" name="txt_email" placeholder="Enter your email" class="form-control" required=""/>
                 </div>
                 <div class="col-sm-6">
                     <label>Phone Number</label>
                     <input type="text" name="txt_num" placeholder="Enter your number" class="form-control" onkeypress="javascript:return isNumber(event)" pattern="[789][0-9]{9}" maxlength="10" minlength="10" required=""/>
                 </div>
             </div>
                </br>
                <div class="row">
                  <div class="col-sm-12">
                     <label>Password</label>
                     <input type="password" name="txt_password" placeholder="Enter your password" class="form-control" onkeypress="javasctript:return isNumber(event)" required=""/>
                 </div>
             </div>
             </br>
             <input type="submit" name="btn_save" value="Signup" class="btn btn-primary btn-lg btn-block"/>
             </br>
             <input type="submit" name="btn_save" value="Cancel" class="btn btn-secondary btn-lg btn-block"/>
        </div>
             </form>    
         </div>
    </body>
</html>

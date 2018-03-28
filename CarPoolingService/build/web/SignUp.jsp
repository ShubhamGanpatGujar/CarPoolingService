<%-- 
    Document   : SingUp
    Created on : 15 Mar, 2018, 3:05:21 AM
    Author     : SHUBHAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html><html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
  <title>JSP Page</title>
<style>
.account-wall {
     margin-top: 20px;
     padding: 40px 10px 20px 10px;
     background-color: #f7f7f7;
     -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
}

</style>
<body>
    <div class="container">
	<div class="row">
            <form class="form-horizontal" action="SignUp.do" method="post">
            <br>
             <a href="Home1.jsp">
    <img src="carpoollogo.png" alt="logo" style="width:40px;">
             </a>
            <br><br>
<fieldset>

<legend>Create your personal account on Transport your world</legend>

 <div class="account-wall">
<div class="form-group">
  <label class="col-md-4 control-label" for="Name">Name</label>  
  <div class="col-md-5">
      <input id="Name" name="customerName" type="text" placeholder="username" class="form-control input-md" required="username">
    
  </div>
</div>


<div class="form-group">
  <label class="col-md-4 control-label" for="passwordinput">Password</label>
  <div class="col-md-5">
    <input id="passwordinput" name="customerPassword" type="Password" placeholder="" class="form-control input-md" required="up">
    <span class="help-block">max 16 characters</span>
  </div>
</div>


<!--<div class="form-group">
  <label class="col-md-4 control-label" for="confirm_password">Confirm Password</label>
  <div class="col-md-5">
    <input id="confirm_password" name="confirm_password" type="password" placeholder="Re-type password" class="form-control input-md" required="up2">
    
  </div>
</div>-->

<div class="form-group">
  <label class="col-md-4 control-label" for="contactnumber">Contact Number</label>  
  <div class="col-md-5">
  <input id="mobilenumber" name="customerContact" type="text" placeholder="Contact Number" class="form-control input-md" required="">
    
  </div>
</div>


<div class="form-group">
  <label class="col-md-4 control-label" for="gender">Gender</label>
  <div class="col-md-4"> 
    <label class="radio-inline" for="gender-0">
      <input type="radio" name="customerGender" id="gender-0" value="Male" checked="checked">Male</label>
      
    <label class="radio-inline" for="gender-1">
      <input type="radio" name="customerGender" id="gender-1" value="Female">Female</label>
  </div>
</div>


<div class="form-group">
  <label class="col-md-4 control-label" for="address">Address</label>
  <div class="col-md-4">                     
    <textarea class="form-control" id="address" name="customerAddress">default text</textarea>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="date">Date</label>  
  <div class="col-md-2">
  <input id="date" name="customerDateOfBirth" type="text" placeholder="MM/DD/YYYY" class="form-control input-md" required="">
    
  </div>
</div>




<div class="form-group">
  <label class="col-md-4 control-label" for="emailId">Email Id</label>  
  <div class="col-md-6">
  <input id="emailId" name="customerEmail" type="text" placeholder="user@domain.com" class="form-control input-md" required="">
    
  </div>
</div>
 

<div class="form-group">
  <label class="col-md-4 control-label" for="submit"></label>
  <div class="col-md-4">
    <button id="submit" name="submit" class="btn btn-success">Sing Up</button>
  </div>
</div>
                 <div class="container">
        <h6> By clicking "Sign up for Transport your world", you agree to our
         <a href="Terms and condition">Terms & condition</a> and 
          <a href="Privacy">Privacy</a>
         policy.</h6>
                 </div>
 </div>

</fieldset>
            
</form>
	</div>
</div>
    
    
</body>
</html>

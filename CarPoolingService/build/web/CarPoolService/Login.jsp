<%-- 
    Document   : Login
    Created on : 14 Mar, 2018, 11:43:04 PM
    Author     : SHUBHAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <title>JSP Page</title>
       
        <style>
            .form-signin
{
    max-width: 330px;
    padding: 15px;
    margin: 0 auto;
}
.form-signin .form-signin-heading, .form-signin .checkbox
{
    margin-bottom: 10px;
}
.form-signin .checkbox
{
    font-weight: normal;
}
.form-signin .form-control
{
    position: relative;
    font-size: 16px;
    height: auto;
    padding: 10px;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
}
.form-signin .form-control:focus
{
    z-index: 2;
}
.form-signin input[type="text"]
{
    margin-bottom: -1px;
    border-bottom-left-radius: 0;
    border-bottom-right-radius: 0;
}
.form-signin input[type="password"]
{
    margin-bottom: 10px;
    border-top-left-radius: 0;
    border-top-right-radius: 0;
}

.login-title
{
    color: #555;
    font-size: 18px;
    font-weight: 400;
    display: block;
}
.profile-img
{
    width: 96px;
    height: 96px;
    margin: 0 auto 10px;
    display: block;
    -moz-border-radius: 50%;
    -webkit-border-radius: 50%;
    border-radius: 50%;
}
.need-help
{
    margin-top: 10px;
}
.new-account
{
    display: block;
    margin-top: 10px;
}
.account-walls {
     margin-top: 20px;
     padding: 20px 0px 10px 0px;
     background-color: #f7f7f7;
     -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
}
.account-wall {
     margin-top: 20px;
     padding: 40px 0px 20px 0px;
     background-color: #f7f7f7;
     -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
}
        </style>
        
    </head>
    <body>
        
         
          <div class="container">
    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
          
         <h1 class="text-center login-title"> 
             <a href="Home.jsp">
    <img src="carpoollogo.png" alt="logo" style="width:40px;">
             </a>
             <br> <br>Sign in to Transport Your World</h1>
         
         <div class="account-wall">
          <img class="profile-img" src="Prologo.png">
          
          <form class="form-signin">
          <input type="text" class="form-control" placeholder="Email / User Name" required autofocus>
          <br>
          <input type="password" class="form-control" placeholder="Password" required>
          <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
          <label class="checkbox pull-left">
          <input type="checkbox" value="remember-me">Remember me </label>                
           <a href="#" class="pull-right need-help">Need help? </a><span class="clearfix"></span>
          </form>
            </div>
             <div class="account-walls ">
            <a href="SingUp.jsp" class="text-center new-account"> If New User ? Sing Up </a>
        </div>
        </div>
    </div>
        </div>
        
        <br><br> 
        
         <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12 text-center">
                       
                        <p>
                            &COPY; 2010 Transport your World Pvt Ltd, Inc.
                            &middot; <a href="Privacy">Privacy</a>
                            &middot; <a href="Terms and condition">Terms & condition</a>
                        </p>
                    </div>
                </div>
            </div>
    </body>
</html>

    


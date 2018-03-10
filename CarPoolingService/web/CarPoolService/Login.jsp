<%-- 
    Document   : Login
    Created on : 11 Mar, 2018, 12:31:09 AM
    Author     : SHUBHAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
        <style>
            
            h1{
                font-size: 35px;
                color:#6666ff;
               font-family:Serif;
               
            }  
            body
            {
                background-image: url("Backcarpool.jpg");
                background-size: 100%;
               
                
            }
          
            
           [class="1"] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}
.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color:#007bff;
}

[class="a"] {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}
.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}


@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
   
}
        </style>
    </head>
    
    <header>
          <div class="container-fluid">
        <h1> <img src="carpoollogo.png" class="rounded" alt="carpoollogo" width="120" height="100">
               Transport Your World Pvt.Ltd</h1>
        <nav class="navbar navbar-expand-sm bg-light navbar-light">
            <ul class="nav nav-pills">
    <li class="nav-item">
      <a class="nav-link " href="Home.jsp">Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="ContactUs.jsp">Contact Us</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="AboutUs.jsp">About Us</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="Information.jsp">Information</a>
    </li>
    
        <form class="form-inline" action="/action_page.php" >
        <input class="form-control" type="text" placeholder="Search"  >
        <button class="btn btn-success" type="submit">Search</button>
        </form>
</nav>
              </div>
    </header>
         
    <body>
         <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" class="1" placeholder="Enter Username" name="uname" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" class="1" placeholder="Enter Password" name="psw" required>
        
    <button type="submit" class="a">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

        <div class="container">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
    </body>
    
</html>

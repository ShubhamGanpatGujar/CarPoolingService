<%-- 
    Document   : Header
    Created on : 10 Mar, 2018, 11:06:57 AM
    Author     : SHUBHAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script src="../js/bootstrap.min.js" type="text/javascript"></script>
 <!--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>-->
   <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">-->
   <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
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
            
            
        </style>
    </head>
          
     <body>
 
    <header>
          <div class="container-fluid">
        <h1> <img src="carpoollogo.png" class="rounded" alt="carpoollogo" width="120" height="100">
               Transport Your World Pvt.Ltd</h1>
        <nav class="navbar navbar-expand-sm bg-light navbar-lightzz">
            <ul class="nav nav-pills">
    <li class="nav-item">
      <a class="nav-link active " href="Home.jsp">Home</a>
    </li>
    
    <li class="nav-item " >
      <a class="nav-link active" href="ContactUs.jsp">Contact Us</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="AboutUs.jsp">About Us</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="Information.jsp">Information</a>
    </li>
    
        <form class="form-inline" action="/action_page.php">
        <input class="form-control" type="text" placeholder="Search">
        <button class="btn btn-success" type="submit">Search</button>
        </form>
</nav>
    </header>
  
    </body>
   
</html>
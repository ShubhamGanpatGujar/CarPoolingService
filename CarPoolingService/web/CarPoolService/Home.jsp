<%-- 
    Document   : HomePage
    Created on : 12 Mar, 2018, 6:09:18 PM
    Author     : SHUBHAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
    <head>
         <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>JSP Page</title>
    </head>
    <style>
        .carousel 
           {
               position: relative; 
               top:0; 
           }
           .carousel-inner 
           {
               position: relative; 
               width: 100%;
               overflow: hidden;
           }
    </style>
    <body>
        <%@include file="header3.jsp" %>
        
                
<div id="demo" class="carousel slide" data-ride="carousel">
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
   
  </ul>
   
  <div class="carousel-inner">
    <div class="carousel-item active">  
        <img src="image4.jpeg" alt="image"  height="100%" width="100%" >
      <div class="container">
      <div class="carousel-caption">
    <h1>Transport Your World</h1>
    <p>Lets ride today</p>
    <p>
        <a class="btn btn-large btn-primary" href="SignIn.jsp">Sign in</a></p>
  </div>
    </div>
    </div>
    <div class="carousel-item">
      <img src="image2.jpeg" alt="Chicago" height="100%" width="100%"  >
       <div class="container">
      <div class="carousel-caption">
    <h1>Transport Your World</h1>
    <p>Lets ride today</p>
    <p>
        <a class="btn btn-large btn-primary" href="SignUp.jsp">Sign up</a></p>
      </div>
    </div>
    </div>
    </div>
   
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div> 
        
        <br><br>
        <div class="container">
  <div class="row">
         <div class="container-marketing">
            <div class="row">
                <div class="col-lg-4">
                   <img src="image4.jpeg" class="rounded-circle" alt="Cinque Terre" width="304" height="236"> 
                    <p><a class="btn btn-default" href="#">Book your car</a></p>
                </div>
            </div>
         </div>
    
            
            <div class="row">
                <div class="col-lg-4">
                    <img src="image2.jpeg" class="rounded-circle" alt="Cinque Terre" width="304" height="236"> 
                    <p><a class="btn btn-default" href="#">Book your carpoolservice</a></p>
                </div>
            </div>
        
  </div>
        </div>
        <%@include file="Footer.jsp" %>
    </body>
</html>

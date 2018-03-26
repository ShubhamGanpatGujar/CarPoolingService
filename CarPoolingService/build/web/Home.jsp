<%-- 
    Document   : HomePage
    Created on : 12 Mar, 2018, 6:09:18 PM
    Author     : SHUBHAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
          body {
      font: 400 15px/1.8 Lato, sans-serif;
      color: #777;
  }
  h3, h4 {
      margin: 10px 0 30px 0;
      letter-spacing: 10px;      
      font-size: 20px;
      color: #111;
  }
  .container {
      padding: 80px 120px;
  }
 
  .carousel-inner img {
     
      width: 100%; /* Set width to 100% */
      margin: auto;
  }
  .carousel-caption h3 {
      color: blue;
  }
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; /* Hide the carousel text when the screen is less than 600 pixels wide */
    }
  }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>
       <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
     
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="image4.jpeg" alt="Image4" width="1200" height="700">
        <div class="carousel-caption">
          <h3>Transport Your World</h3>
          <p>Lets ride today</p>
           <p>
        <a class="btn btn-large btn-primary" href="SignIn.jsp">Sign in</a></p>
        </div>      
      </div>

      <div class="item">
        <img src="image2.jpeg" alt="image2" width="1200" height="600">
        <div class="carousel-caption">
          <h3>Transport Your World</h3>
          <p>Lets ride today</p>
          <p>
        <a class="btn btn-large btn-primary" href="SignUp.jsp">Sign up</a></p>
        </div>      
      </div>
    
      
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
    
    
    <div id="band" class="container text-center">
  <p><em>Car Pooling</em></p>There are many great benefits to carpooling, many of which people do not know about or even think about.
With these benefits in mind, it will be easier than ever to see why making the switch, even for just a few
days a week, can be a good idea for you and your commute. Wherever you are in the South Florida area,
carpooling can help. Check out South Florida Commuter Services to see how these benefits can be yours today!
  <p></p>
  <br>
  <div class="row">
    <div class="col-sm-6">
      <p class="text-center"><strong>Name</strong></p><br>
      <a href="#demo" data-toggle="collapse">
        <img src="bandmember.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo" class="collapse">
        <p>Guitarist and Lead Vocalist</p>
        <p>Loves long walks on the beach</p>
        <p>Member since 1988</p>
      </div>
    </div>
    <div class="col-sm-6">
      <p class="text-center"><strong>Name</strong></p><br>
      <a href="#demo2" data-toggle="collapse">
        <img src="bandmember.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo2" class="collapse">
        <p>Drummer</p>
        <p>Loves drummin'</p>
        <p>Member since 1988</p>
      </div>
    </div>
   
  </div>
</div>

    </body>
</html>


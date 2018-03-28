<%-- 
    Document   : Home1
    Created on : 28 Mar, 2018, 3:41:03 PM
    Author     : SHUBHAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <style>
 
  .carousel-inner img {
     
      width: 100%; /* Set width to 100% */
      margin: auto;
  }
  h{
      font-size: 30px;
      font-style: oblique;
      color: #0b2e13;
      font-family: monospace;
  }
  
        </style>
    </head>
    <body>
        <%@include file="header1.jsp" %>
        
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
     
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" >
      <div class="item active">
        <img src="banner1.jpg" alt="Image4" width="1200" height="700">
        <div class="carousel-caption">
          <h1>Carpooling is one the most popular concepts in the West and developed nations.</h1>
        

        </div>      
      </div>

      <div class="item">
        <img src="banner2.jpg" alt="image2" width="1200" height="600">
        <div class="carousel-caption">
          
          <h1>Transport Your World is India’s new age inter-city carpooling travel solution.</h1>

        </div>      
      </div>
    
      
   
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
   
    <div id="car pool" class="container text-center" >
  <p><em>Car Pooling</em></p>There are many great benefits to carpooling, many of which people do not know about or even think about.
With these benefits in mind, it will be easier than ever to see why making the switch, even for just a few
days a week, can be a good idea for you and your commute. Wherever you are in the South Florida area,
carpooling can help. Check out South Florida Commuter Services to see how these benefits can be yours today!
  <p></p>
  <br>
  <div class="row">
    <div class="col-sm-4">
        <img src="logo11.png"  alt="Random Name" width="255" height="255">
        <h2>JOIN NOW</h2>
        <p>It's quick, simple & free. You have to sign up to offer empty car seats or to book seats</p>
        
      </div>
  
    <div class="col-sm-4">
        <img src="logo13.png"  alt="Random Name" width="255" height="255">
        <h2>OFFER/BOOK A RIDE</h2>
        <p>Search rides on your way and book seats. Pick your ride to offer empty seats.</p>
      </div>
   
   
    <div class="col-sm-4">
        <img src="logo15.png"  alt="Random Name" width="255" height="255">
        <h2>TRAVEL TOGETHER</h2>
        <p>Don't just travel have a Win-Win Journey!! You save Time & Money :-)</p>
      </div>
    </div>
  </div>
   </div>
        
        <div  class="container text-center">
            <h>JOIN US TODAY AND MAKE WAY FOR THE GREENER INDIA FOR TOMORROW.</h>
        </div>
        <%@include file="Footer.jsp" %>
    </body>
</html>

<%-- 
    Document   : CarBooking
    Created on : 27 Mar, 2018, 8:07:31 PM
    Author     : SHUBHAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <title>JSP Page</title>
       
    </head>
    <body>
          
                <div class="container">
	<div class="row">
            <form class="form-horizontal" action="CarBooking.do" method="post">
            <br>
             <a href="Home.jsp">
    <img src="carpoollogo.png" alt="logo" style="width:40px;">
             </a>
            <br><br>
<fieldset>

<legend>Add Car Details on Transport your world</legend>
                 
            
            
<div class="form-group">
  <label class="col-md-4 control-label" for="carID">Car ID</label>  
  <div class="col-md-6">
      <input id="Name" name="carID" type="text" placeholder="Car ID" class="form-control input-md" required="">
    
  </div>
</div>
                 
                

          <div class="form-group">
  <label class="col-md-4 control-label" for="customerID">Customer ID</label>  
  <div class="col-md-6">
      <input id="Name" name="customerID" type="text" placeholder="CustomerID" class="form-control input-md" required="">
    
  </div>
</div>

              <div class="form-group">
  <label class="col-md-4 control-label" for="carbookingdate">Car Booking Date</label>
  <div class="col-md-6"> 
    <input id="Name" name="carbookingdate" type="text" placeholder="DD/MM/YYYY" class="form-control input-md" required="">
</div>   
              </div>

   <div class="form-group">
  <label class="col-md-4 control-label" for="carbookingtime">Car Booking Time</label>
  <div class="col-md-6"> 
    <input id="Name" name="carbookingtime" type="text" placeholder="HH/MM/SS" class="form-control input-md" required="">
</div>   
              </div>
             
          <div class="form-group">
  <label class="col-md-4 control-label" for="submit"></label>
  <div class="col-md-6">
    <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
  </div>
</div>       
      
            </form>
           </div>
              </div>
                <div class="col-lg-12 text-center">
                    <br> <br> <br>  <br>  <br>
                        <p>
                            &COPY; 2010 Transport your World Pvt Ltd, Inc.
                            &middot; <a href="Privacy">Privacy</a>
                            &middot; <a href="Terms and condition">Terms & condition</a>
                        </p>
                    </div>
    </body>
</html>

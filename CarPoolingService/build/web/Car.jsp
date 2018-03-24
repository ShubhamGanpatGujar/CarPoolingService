<%-- 
    Document   : Car
    Created on : 22 Mar, 2018, 9:37:27 PM
    Author     : SHUBHAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
            <form class="form-horizontal" action="Car.do" method="post">
            <br>
             <a href="Home.jsp">
    <img src="carpoollogo.png" alt="logo" style="width:40px;">
             </a>
            <br><br>
<fieldset>

<legend>Add Car Details on Transport your world</legend>
                 
            
            
<div class="form-group">
  <label class="col-md-4 control-label" for="car model">Car Model</label>  
  <div class="col-md-6">
      <input id="Name" name="carModel" type="text" placeholder="Car Model" class="form-control input-md" required="">
    
  </div>
</div>
                 
                
<div class="form-group">
  <label class="col-md-4 control-label" for="carSeating">Seating Capacity</label>  
  <div class="col-md-5">
      <select name="carSeating" >
         <option value="4">4</option>
         <option value="6">6</option>
         <option value="10">10</option>
      </select>                             
     
  </div>
</div>
          <div class="form-group">
  <label class="col-md-4 control-label" for="car model">Car Number</label>  
  <div class="col-md-6">
      <input id="Name" name="carNo" type="text" placeholder="Car Number" class="form-control input-md" required="">
    
  </div>
</div>

              <div class="form-group">
  <label class="col-md-4 control-label" for="carAC">AC</label>
  <div class="col-md-4"> 
    <label class="radio-inline" for="yes">
      <input type="radio" name="carAC" id="yes" value="Yes" checked="checked">Yes</label>
      
    <label class="radio-inline" for="no">
      <input type="radio" name="carAC" id="no" value="No">No</label>
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

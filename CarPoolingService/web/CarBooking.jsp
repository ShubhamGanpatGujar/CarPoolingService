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
  <label class="col-md-4 control-label" for="startLocation">Start Location</label>  
  <div class="col-md-5">
      <select name="startLocation" >
         <option value="Borivali">Borivali</option>
         <option value="Kandivali">Kandivali</option>
         <option value="Mald">Malad</option>
          <option value="Goregaon">Goregaon</option>
         <option value="Jogeshwari">Jogeshwari</option>
         <option value="Andheri">Andheri</option>
          <option value="Vile Parle">Vile Parle</option>
         <option value="Santacruz">Santacruz</option>
         <option value="Khar Road">Khar Road</option>
          <option value="Bandra">Bandra</option>
         <option value="Mahim Junction">Mahim</option>
         <option value="Matunga">Matunga</option>
          <option value="Dadar">Dadar</option>
         <option value="Elphinston">Elphinston</option>
         <option value="Lower Parel">Lower Parel</option>
          <option value="Mumbai Central">Mumbai Central</option>
         <option value="Grant Road">Grant Road</option>
         <option value="Charni Road">Charni Road</option>
          <option value="Marine Lines">Marine Lines</option>
         <option value=" Churchgate"> Churchgate</option>
         
      </select>                             
  
  </div>
</div>
          <div class="form-group">
  <label class="col-md-4 control-label" for="Destination">Destination</label>  
  <div class="col-md-5">
      <select name="Destination" >
         <option value="Borivali">Borivali</option>
         <option value="Kandivali">Kandivali</option>
         <option value="Mald">Malad</option>
          <option value="Goregaon">Goregaon</option>
         <option value="Jogeshwari">Jogeshwari</option>
         <option value="Andheri">Andheri</option>
          <option value="Vile Parle">Vile Parle</option>
         <option value="Santacruz">Santacruz</option>
         <option value="Khar Road">Khar Road</option>
          <option value="Bandra">Bandra</option>
         <option value="Mahim Junction">Mahim</option>
         <option value="Matunga">Matunga</option>
          <option value="Dadar">Dadar</option>
         <option value="Elphinston">Elphinston</option>
         <option value="Lower Parel">Lower Parel</option>
          <option value="Mumbai Central">Mumbai Central</option>
         <option value="Grant Road">Grant Road</option>
         <option value="Charni Road">Charni Road</option>
          <option value="Marine Lines">Marine Lines</option>
         <option value=" Churchgate"> Churchgate</option>
         
      </select>                             
  
  </div>
</div>

              <div class="form-group">
  <label class="col-md-4 control-label" for="Distance">Distance</label>  
  <div class="col-md-2">
      <input id="Name" name="Distance" type="text" placeholder="Kilo-meter" class="form-control input-md"required="">
    
  </div>
</div> 



              <div class="form-group">
  <label class="col-md-4 control-label" for="carpoolbookingdate">Car Pool Booking Date</label>
  <div class="col-md-6"> 
    <input id="Name" name="carpoolbookingDate" type="text" placeholder="MM/DD/YYYY" class="form-control input-md" required="">
</div>   
              </div>

   <div class="form-group">
  <label class="col-md-4 control-label" for="carpoolbookingtime">Car Pool Booking Time</label>
  <div class="col-md-6"> 
    <input id="Name" name="carpoolbookingTime" type="text" placeholder="HH/MM/SS" class="form-control input-md" required="">
</div>   
              </div>

<div class="form-group">
  <label class="col-md-4 control-label" for="numberofPassenger">NO. Of Passenger</label>
  <div class="col-md-6"> 
    <input id="Name" name="numberofPassenger" type="text" placeholder="IN NO" class="form-control input-md" required="">
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

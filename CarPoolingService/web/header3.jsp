<%-- 
    Document   : header3
    Created on : 14 Mar, 2018, 12:38:49 PM
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
          
           
       
         body
         {
             font-size-adjust:20;
         }
         h1{
             font-size: 50px;
         }
       </style>
    </head> 
    <body>
 
        
     <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
 
  <a class="navbar-brand" href="Home.jsp">
    <img src="carpoollogo.png" alt="logo" style="width:40px;">
  </a>
  
 
  <ul class="navbar-nav">
    <li class="nav-item ">
        <a class="nav-link" href="Home.jsp">Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="ContactUs.jsp">ContactUs</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="AboutUs.jsp">AboutUs</a>
    </li>
     <li class="nav-item">
      <a class="nav-link" href="Information.jsp">Information</a>
    </li>
    <li class="nav-item">
    <li class="dropdown">
        <a class ="dropdown-toggle" data-toggle="dropdown" href="#">MORE
            <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="carbookinglist.view">Car Booking List</a>
               <li><a href="carpoolbookinglist.view">Car pool Booking List</a>
                <li><a href="CustomerList.view">Customer List</a>
                <li><a href="EditCustomer.jsp">Edit</a>
            </ul>
    </li>
  </li>
    
  </ul>
</nav>
    </body>
   
</html>
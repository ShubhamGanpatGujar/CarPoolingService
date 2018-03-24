<%-- 
    Document   : ContactUs
    Created on : 12 Mar, 2018, 6:26:36 PM
    Author     : SHUBHAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  
        <title>JSP Page</title>
    </head>
    <body>
         <%@include file="header3.jsp" %>
         <br><br><br><br><br><br>
    <div class="w3-container w3-content w3-padding-64" style="max-width:800px" id="contact">
    <h2 class="w3-wide w3-center">CONTACT US</h2>
    <p class="w3-opacity w3-center"><i>For Any Queries Drop a note!</i></p>
    <div class="w3-row w3-padding-32">
      <div class="w3-col m6 w3-large w3-margin-bottom">
        <i class="fa fa-map-marker" style="width:30px"></i> Mumbai, US<br>
        <i class="fa fa-phone" style="width:30px"></i> Phone: +91 9002001234<br>
        <i class="fa fa-envelope" style="width:30px"> </i> Email: TansportUrWorld2010@gmail.com<br>
      </div>
      <div class="w3-col m6">
        <form action="" method="">
          <div class="w3-row-padding" style="margin:0 -16px 8px -16px">
            <div class="w3-half">
              <input class="w3-input w3-border" type="text" placeholder="Name" required name="Name">
            </div>
            <div class="w3-half">
              <input class="w3-input w3-border" type="text" placeholder="Email" required name="Email">
            </div>
          </div>
          <input class="w3-input w3-border" type="text" placeholder="Message" required name="Message">
          <button class="w3-button w3-blue w3-section w3-right" type="submit">SEND</button>
        </form>
      </div>
    </div>
  </div>
    <%@include file="Footer.jsp" %>
    </body>
</html>

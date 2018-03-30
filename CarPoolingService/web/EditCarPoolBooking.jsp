<%-- 
    Document   : EditCarPoolBooking
    Created on : 29 Mar, 2018, 12:56:13 PM
    Author     : SHUBHAM
--%>

<%@page import="com.Project1.CarPoolingService.daoimpl.CarPoolBookingDAOImpl"%>
<%@page import="com.Project1.CarPoolingService.entities.CarPoolBooking"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class ="container">
<p>
<form action="EditCarPoolBookingServlet.do" method="get">
    <br><br>
<%
CarPoolBooking carpoolbooking = new CarPoolBookingDAOImpl().getCarPoolBookingByID(Integer.parseInt(request.getParameter("carpoolbookingID")));
request.setAttribute("carpoolbooking",carpoolbooking);
%>  
<h1> Update Customer </h1>
              <br>
            <input type="hidden" name="carpoolbookingID" value="${carpoolbooking.carpoolbookingID}" />
            
            <label class="col-md-4 control-label" >Invoice Date</label>
            <div class="col-md-5">
            <input type="text" name="invoiceDate" value="${carpoolbooking.invoiceDate}" />
            </div>
            <br><br>
            
           
            <label class="col-md-4 control-label" >Car Pool Booking Date</label>
            <div class="col-md-5">
            <input type="text" name="carpoolbookingDate" value="${carpoolbooking.carpoolbookingDate}" />
            </div>
            <br><br>
            
           
            <label class="col-md-4 control-label" >Car Pool Booking Time</label>
            <div class="col-md-5">
            <input type="text" name="carpoolbookingTime" value="${carpoolbooking.carpoolbookingTime}" />
            </div>
            <br><br>
            
            
            <label class="col-md-4 control-label" >No. of Passenger</label>
            <div class="col-md-5">
            <input type="text" name="numberofPassenger" value="${carpoolbooking.numberofPassenger}" />
            </div>
            <br><br>
            
            
           
            <input type="submit" name="action" value="Save Changes" />
            <input type="submit" name="action"  value="Delete" />
        </form>
</p>
</div>
<%@include file="Footer.jsp" %>
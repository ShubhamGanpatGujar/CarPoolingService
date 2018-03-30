<%-- 
    Document   : CarBookingList
    Created on : 20 Mar, 2018, 11:44:38 PM
    Author     : SHUBHAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <%@include file="header.jsp" %>
         <br><br><br><br>
          <style>
table, td, th {    
    border: 1px solid #ddd;
    text-align: left;
}

table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    padding: 15px;
}
</style>

    </head>
    <body>
        <div class ="container">
        <table style="width: 100%">
           
        </table>
       <h2>List of Car Pool Booking</h2>
<table border="1">
    <thead >
    <th>Invoice ID</th>
    <th>Invoice Date</th>
    <th>Car ID</th>
    <th>Car Pool Booking ID</th>
    <th>Car Pool Booking Date</th>
    <th>Car Pool Booking Time</th>
    <th>Customer ID</th>
    <th>Route ID</th>
    <th>Number of Passenger</th>
    </thead>
    <tbody>
       
        
        <c:forEach  var="carpoolbooking" items="${carpoolbookingList}">
        <tr>
            <td><c:out value="${carpoolbooking.invoiceID}"/></td>
            <td><c:out value="${carpoolbooking.invoiceDate}"/></td>
            <td><c:out value="${carpoolbooking.carID}"/></td>
            <td><c:out value="${carpoolbooking.carpoolbookingID}"/></td>
            <td><c:out value="${carpoolbooking.carpoolbookingDate}"/></td>
            <td><c:out value="${carpoolbooking.carpoolbookingTime}"/></td>
            <td><c:out value="${carpoolbooking.customerID}"/></td>
            <td><c:out value="${carpoolbooking.routeID}"/></td>
            <td><c:out value="${carpoolbooking.numberofPassenger}"/></td>
             <td><a href="EditCarPoolBooking.jsp?carpoolbookingID=${carpoolbooking.carpoolbookingID}">DETAILS</a></td>
        </tr>
        </c:forEach>
    
       <c:if test="${empty carpoolbookinglist}" var="cpb">
            
        </c:if>
    </tbody>
    
</table>
        </div>
    </body>
</html>
<br><br><br><br>
<%@include file="Footer.jsp" %>
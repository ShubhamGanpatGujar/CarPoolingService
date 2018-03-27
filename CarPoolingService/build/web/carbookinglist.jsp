<%-- 
    Document   : carbookinglist
    Created on : 21 Mar, 2018, 1:17:26 AM
    Author     : SHUBHAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
        
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
<div class ="container">
       <h2>List of Car Booking</h2>
       <table style="width: 100%">
           
       </table>
       <table border="1">
    <thead >
    <th>Car Booking ID</th>
    <th>Car ID</th>
    <th>Customer ID</th>
    <th>Car Booking Date</th>
    <th>Car booking Time</th>
    </thead>
    <tbody>
       
        
        <c:forEach  var="carbooking" items="${carbookingList}">
        <tr>
            <td><c:out value="${carbooking.carbookingID}"/></td>      
            <td><c:out value="${carbooking.carID}"/></td>
            <td><c:out value="${carbooking.customerID}"/></td>
            <td><c:out value="${carbooking.carbookingDate}"/></td>
            <td><c:out value="${carbooking.carbookingTime}"/></td>
        <td><a href="carbookinglist.jsp?carbookingID= ${carbooking.carbookingID}">DETAILS</a></td>
        </tr>
        </c:forEach>
    
       <c:if test="${empty carbookinglist}" var="cb">
           
        </c:if>
    </tbody>
    
</table>
</div>
   <br><br><br><br>
<%@include file="Footer.jsp" %>

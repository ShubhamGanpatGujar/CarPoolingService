<%-- 
    Document   : carbookinglist
    Created on : 21 Mar, 2018, 1:17:26 AM
    Author     : SHUBHAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%@include file="header3.jsp" %>
       <h2>List of Car Booking</h2>
       <table border="1">
    <thead >
    <th>Car Booking ID</th>
    <th>Car ID</th>
    <th>Customer ID</th>
    <th>Car Booking Date</th>
    <th>Car booking Time</th>
    </thead>
    <tbody>
        <%--<c:if test="not employeeList equals  null" var="emp">--%>
        
        <c:forEach  var="carbooking" items="${carbookinglist}">
        <tr>
            <td><c:out value="${carbooking.carbookingID}"/></td>      
            <td><c:out value="${carbooking.carID}"/></td>
            <td><c:out value="${carbooking.customerID}"/></td>
            <td><c:out value="${carbooking.carbookingDate}"/></td>
            <td><c:out value="${carbooking.carbookingTime}"/></td>
            <td>Details</td>
            <td>Edit</td>
            <td>Delete</td>
            
        </tr>
        </c:forEach>
        <%--</c:if>--%>
        <c:if test="carbookingList equals  null" var="carbooking">
            <%out.println("No record");%>
        </c:if>
    </tbody>
    
</table>
    </body>
</html>

<%-- 
    Document   : CarpoolrouteList
    Created on : 27 Mar, 2018, 6:44:02 PM
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
       <h2>List of Car Pool Route</h2>
<table border="1">
    <thead >
    <th>Route ID</th>
    <th>Passenger Capacity</th>
    <th>Price</th>
    </thead>
    <tbody>
       
        
        <c:forEach  var="carpoolroute" items="${carpoolrouteList}">
        <tr>
            <td><c:out value="${carpoolroute.routeID}"/></td>
            <td><c:out value="${carpoolroute.passengerCapacity}"/></td>
            <td><c:out value="${carpoolroute.price}"/></td>
             <td><a href="EditCarPoolRoute.jsp?carpoolrouteID=${carpoolroute.carpoolrouteID}">DETAILS</a></td>
        </tr>
        </c:forEach>
    
       <c:if test="${empty carpoolrouteList}" var="cpr">
            
        </c:if>
    </tbody>
    
</table>
        </div>
    </body>
</html>
<br><br><br><br>
<%@include file="Footer.jsp" %>
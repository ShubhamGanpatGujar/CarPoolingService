<%-- 
    Document   : PickupList
    Created on : 27 Mar, 2018, 6:36:43 PM
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
       <h2>List of PickUp</h2>
      
       <table border="1">
    <thead >
    <th>Pickup Point</th>
    <th>Route ID</th>
    </thead>
    <tbody>
       
        
        <c:forEach  var="pickup" items="${pickupList}">
        <tr>
            <td><c:out value="${pickup.pickupPoint}"/></td>      
            <td><c:out value="${pickup.routeID}"/></td>
        <td><a href="EditPickUp.jsp?pickupID=${pickup.pickupID}">DETAILS</a></td>
        </tr>
        </c:forEach>
    
       <c:if test="${empty pickupList}" var="pu">
           
        </c:if>
    </tbody>
    
</table>
</div>
   <br><br><br><br>
<%@include file="Footer.jsp" %>


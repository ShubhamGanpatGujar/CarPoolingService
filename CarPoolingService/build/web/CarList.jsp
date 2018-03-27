<%-- 
    Document   : CarList
    Created on : 27 Mar, 2018, 6:21:08 PM
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
       <h2>List of Cars</h2>
      
       <table border="1">
    <thead >
    <th>Car Number</th>
    <th>Car Model</th>
    <th>AC/NON-AC</th>
    <th>Car Seats</th>
    </thead>
    <tbody>
       
        
        <c:forEach  var="car" items="${carList}">
        <tr>
            <td><c:out value="${car.carNo}"/></td>      
            <td><c:out value="${car.carModel}"/></td>
            <td><c:out value="${car.carAC}"/></td>
            <td><c:out value="${car.carSeating}"/></td>
        <td><a href="EditCar.jsp?carID=${car.carID}">DETAILS</a></td>
        </tr>
        </c:forEach>
    
       <c:if test="${empty carList}" var="c">
           
        </c:if>
    </tbody>
    
</table>
</div>
   <br><br><br><br>
<%@include file="Footer.jsp" %>

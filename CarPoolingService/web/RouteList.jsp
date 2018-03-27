<%-- 
    Document   : RouteList
    Created on : 27 Mar, 2018, 5:36:53 PM
    Author     : SHUBHAM
--%>


        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%@include file="header.jsp" %>
         <br><br><br><br>
        <style>
table, td, th {    
    border: 1px solid #ddd;
    text-align: left;
}

table {
    border-collapse: collapse;
    height: 100%;
    width: 100%;
    margin: auto;
}

th, td {
    padding: 15px;
}

</style>
<div class ="container">
       <h2>List of Route</h2>
       <br><br>
       <table border="1">
    <thead >
    <th>Start Location</th>
    <th>Destination</th>
    <th>Distance</th>
    <tbody>
        <%--<c:if test="not employeeList equals  null" var="emp">--%>
        
        <c:forEach  var="route" items="${routeList}">
        <tr>
            <td><c:out value="${route.startLocation}"/></td>      
            <td><c:out value="${route.destination}"/></td>
            <td><c:out value="${route.distance}"/></td>
            <td><a href="EditCustomer.jsp?routeID=${route.routeID}">DETAILS</a></td>
            
        </tr>
        </c:forEach>
        <%--</c:if>--%>
        <c:if test="${empty routeList}" var="rou">
            <%out.println("No record");%>   
        </c:if>
    </tbody>
    
</table>
</div>
        <br><br><br><br>
   <%@include file="Footer.jsp" %>
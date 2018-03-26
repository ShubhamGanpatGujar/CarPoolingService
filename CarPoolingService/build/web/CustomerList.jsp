<%-- 
    Document   : CustomerList
    Created on : 26 Mar, 2018, 1:00:00 PM
    Author     : SHUBHAM
--%>


        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        
        
       <h2>List of Customers</h2>
       <table style="width: 100%">
</table>
       <table border="1">
    <thead >
    <th>Customer Name</th>
    <th>Contact No</th>
    <th>Gender</th>
    <th>Email ID</th>
    <th>Address</th>
    <th>Birth Date</th>
    <th>Password</th>
    </thead>
    <tbody>
        <%--<c:if test="not employeeList equals  null" var="emp">--%>
        
        <c:forEach  var="customer" items="${customerList}">
        <tr>
            <td><c:out value="${customer.customerName}"/></td>      
            <td><c:out value="${customer.customerContact}"/></td>
            <td><c:out value="${customer.customerGender}"/></td>
            <td><c:out value="${customer.customerEmail}"/></td>
            <td><c:out value="${customer.customerAddress}"/></td>
            <td><c:out value="${customer.customerDateOfBirth}"/></td>
            <td><c:out value="${customer.customerPassword}"/></td>
            <td><a href="EditCustomer.jsp?customerID=${customer.customerID}">DETAILS</a></td>
            
        </tr>
        </c:forEach>
        <%--</c:if>--%>
        <c:if test="${empty customerList}" var="cus">
            <%out.println("No record");%>   
        </c:if>
    </tbody>
    
</table>
   
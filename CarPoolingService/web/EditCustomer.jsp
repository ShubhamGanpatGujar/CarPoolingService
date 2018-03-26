<%-- 
    Document   : EditCustomer
    Created on : 26 Mar, 2018, 2:27:22 PM
    Author     : SHUBHAM
--%>


<%@page import="com.Project1.CarPoolingService.daoimpl.CustomerDAOImpl"%>
<%@page import="com.Project1.CarPoolingService.entities.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<p>
<form action="EditCustomer.do" method="get">
    <br><br><br><br>
<%
Customer customer = new CustomerDAOImpl().getCustomerByID(Integer.parseInt(request.getParameter("customerID")));
request.setAttribute("customer",customer);
%>
<input type="hidden" name="customerID" value="${customer.customerID}" />
            Customer Name :<input type="text" name="customerName" value="${customer.customerName}" />
            <br/>
            Customer Contact :<input type="text" name="customerContact" value="${customer.customerContact}" />
            <br/>
            Customer Gender :<input type="text" name="customerGender" value="${customer.customerGender}" />
            <br/>
            Customer Email :<input type="text" name="customerEmail" value="${customer.customerEmail}" />
            <br/>
            Customer Address:<input type="text" name="customerAddress" value="${customer.customerAddress}" />
            <br/>
            Customer Date OF Birth :<input type="text" name="cuatomer DateOfBirth" value="${customer.customerDateOfBirth}" />
            <br/>
            Customer Password :<input type="text" name="customerPasword" value="${customer.customerPassword}"/>
            <br/>
            <input type="submit" name="action" value="Save Changes" />
            <input type="submit" name="action"  value="Delete" />
        </form>
   </p>
<%@include file="Footer.jsp" %>
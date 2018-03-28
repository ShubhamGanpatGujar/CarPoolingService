<%-- 
    Document   : EditCustomer
    Created on : 26 Mar, 2018, 2:27:22 PM
    Author     : SHUBHAM
--%>


<%@page import="com.Project1.CarPoolingService.daoimpl.CustomerDAOImpl"%>
<%@page import="com.Project1.CarPoolingService.entities.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class ="container">
<p>
<form action="EditCustomer.do" method="get">
    <br><br>
<%
Customer customer = new CustomerDAOImpl().getCustomerByID(Integer.parseInt(request.getParameter("customerID")));
request.setAttribute("customer",customer);
%>  
<h1> Update Customer </h1>
              <br>
            <input type="hidden" name="customerID" value="${customer.customerID}" />
            
            <label class="col-md-4 control-label" > Customer Name</label>
            <div class="col-md-5">
            <input type="text" name="customerName" value="${customer.customerName}" />
            </div>
            <br><br>
            
           
            <label class="col-md-4 control-label" >Customer Contact</label>
            <div class="col-md-5">
            <input type="text" name="customerContact" value="${customer.customerContact}" />
            </div>
            <br><br>
            
           
            <label class="col-md-4 control-label" >Customer Gender</label>
            <div class="col-md-5">
            <input type="text" name="customerGender" value="${customer.customerGender}" />
            </div>
            <br><br>
            
            
            <label class="col-md-4 control-label" >Customer Email</label>
            <div class="col-md-5">
            <input type="text" name="customerEmail" value="${customer.customerEmail}" />
            </div>
            <br><br>
            
            
            <label class="col-md-4 control-label" >Customer Address</label>
            <div class="col-md-5">
            <input type="text" name="customerAddress" value="${customer.customerAddress}" />
            </div>
             <br><br>
             
             <label class="col-md-4 control-label" >Customer Date OF Birth</label> 
             <div class="col-md-5">
            <input type="text" name="customerDateOfBirth" value="${customer.customerDateOfBirth}" />
             </div>
             <br><br>
             
             <label class="col-md-4 control-label" >Customer Password</label>
             <div class="col-md-5">
            <input type="text" name="customerPasword" value="${customer.customerPassword}"/>
             </div>
             <br><br>
            <input type="submit" name="action" value="Save Changes" />
            <input type="submit" name="action"  value="Delete" />
        </form>
</p>
</div>
<%@include file="Footer.jsp" %>
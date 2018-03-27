<%-- 
    Document   : EditCar
    Created on : 27 Mar, 2018, 7:30:07 PM
    Author     : SHUBHAM
--%>

<%@page import="com.Project1.CarPoolingService.daoimpl.CarDAOImpl"%>
<%@page import="com.Project1.CarPoolingService.entities.Car"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class ="container">
<p>
<form action="EditCar.do" method="get">
    <br><br>
<%
Car car = new CarDAOImpl().getCarByID(Integer.parseInt(request.getParameter("carID")));
request.setAttribute("car",car);
%>  
<h1> Update Car </h1>
              <br>
            <input type="hidden" name="carID" value="${car.carID}" />
            
            <label class="col-md-4 control-label" > Car Number</label>
            <div class="col-md-5">
            <input type="text" name="carNo" value="${car.carNo}" />
            </div>
            <br><br>
            
           
            <label class="col-md-4 control-label" >Car Model</label>
            <div class="col-md-5">
            <input type="text" name="carModel" value="${car.carModel}" />
            </div>
            <br><br>
            
           
            <label class="col-md-4 control-label" >AC/NON-AC</label>
            <div class="col-md-5">
            <input type="text" name="carAC" value="${car.carAC}" />
            </div>
            <br><br>
            
            
            <label class="col-md-4 control-label" >Seating Capacity</label>
            <div class="col-md-5">
            <input type="text" name="carSeating" value="${car.carSeating}" />
            </div>
            <br><br>
            
            <input type="submit" name="action" value="Save Changes" />
            <input type="submit" name="action"  value="Delete" />
        </form>
</p>
</div>
<%@include file="Footer.jsp" %>

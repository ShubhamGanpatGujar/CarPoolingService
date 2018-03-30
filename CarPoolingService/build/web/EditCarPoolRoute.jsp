<%-- 
    Document   : EditCarPoolRoute
    Created on : 29 Mar, 2018, 1:05:25 PM
    Author     : SHUBHAM
--%>

<%@page import="com.Project1.CarPoolingService.daoimpl.CarPoolRouteDAOImpl"%>
<%@page import="com.Project1.CarPoolingService.entities.CarPoolRoute"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class ="container">
<p>
<form action="EditCarPoolRouteServlet.do" method="get">
    <br><br>
<%
CarPoolRoute carpoolroute= new CarPoolRouteDAOImpl().getCarPoolRouteByID(Integer.parseInt(request.getParameter("carpoolrouteID")));
request.setAttribute("carpoolroute",carpoolroute);
%>  
<h1> Update Customer </h1>
              <br>
            <input type="hidden" name="carpoolrouteID" value="${carpoolroute.carpoolrouteID}" />
            
            <label class="col-md-4 control-label" > Passenger</label>
            <div class="col-md-5">
            <input type="text" name="passengerCapacity" value="${carpoolroute.passengerCapacity}" />
            </div>
            <br><br>
            
           
            <label class="col-md-4 control-label" >Price</label>
            <div class="col-md-5">
            <input type="text" name="price" value="${carpoolroute.price}" />
            </div>
            <br><br>
            
          
            <input type="submit" name="action" value="Save Changes" />
            <input type="submit" name="action"  value="Delete" />
        </form>
</p>
</div>
<%@include file="Footer.jsp" %>
<%-- 
    Document   : EditRoute
    Created on : 29 Mar, 2018, 1:11:50 PM
    Author     : SHUBHAM
--%>

<%@page import="com.Project1.CarPoolingService.daoimpl.RouteDAOImpl"%>
<%@page import="com.Project1.CarPoolingService.entities.Route"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class ="container">
<p>
<form action="EditRouteServlet.do" method="get">
    <br><br>
<%
Route route = new RouteDAOImpl().getRouteByID(Integer.parseInt(request.getParameter("routeID")));
request.setAttribute("route",route);
%>  
<h1> Update Route </h1>
              <br>
            <input type="hidden" name="routeID" value="${route.routeID}" />
            
            <label class="col-md-4 control-label" > Starting Location</label>
            <div class="col-md-5">
            <input type="text" name="startLocation" value="${route.startLocation}" />
            </div>
            <br><br>
            
           
            <label class="col-md-4 control-label" >Destination</label>
            <div class="col-md-5">
            <input type="text" name="Destination" value="${route.destination}" />
            </div>
            <br><br>
            
           
            <label class="col-md-4 control-label" >Distance</label>
            <div class="col-md-5">
            <input type="text" name="Distance" value="${route.distance}" />
            </div>
            <br><br>
            
            
          
           
            <input type="submit" name="action" value="Save Changes" />
            <input type="submit" name="action"  value="Delete" />
        </form>
</p>
</div>
<%@include file="Footer.jsp" %>
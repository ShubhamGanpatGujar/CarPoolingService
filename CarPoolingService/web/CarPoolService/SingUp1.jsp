<%-- 
    Document   : SingUp1
    Created on : 16 Mar, 2018, 4:20:36 PM
    Author     : SHUBHAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header3.jsp" %>
        
        <form action="signup.do" method="post">
            Customer Name :<input type="text" name="customerName" /><br>
            <br/>
            Contact :<input type="text" name="customerContact" /><br>
            <br/>
            Gender :<input type="text" name="customerGender" /><br>
            <br/>
            Email :<input type="text" name="customerEmail" /><br>
            <br/>
           Address :<input type="text" name="customerAddress" /><br>
            <br/>
           DateOfBirth :<input type="text" name="customerDateOfBirth" /><br>
            <br/>
            Password :<input type="text" name="customerPassword" /><br>
            <br/>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>

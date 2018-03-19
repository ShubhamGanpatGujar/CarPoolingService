<%-- 
    Document   : Login1
    Created on : 19 Mar, 2018, 2:02:31 PM
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
     <p>
<form method="post" action="signin.do">
    Login ID : <input required type="text" name="customEmail" /><br/>
    Password : <input required type="password" name="customerPassword"/><br/>
    <input type="submit" value="Login" />
    <br/>
</form>
    </p>
    </body>
</html>

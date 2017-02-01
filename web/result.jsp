<%-- 
    Document   : result
    Created on : Feb 1, 2017, 5:31:28 PM
    Author     : William A Nadeeshani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align='center'>Beer Price JSP</h1>
        <%
            String price=(String)request.getAttribute("price");
            out.print("Price=" +price);
        %>
    </body>
</html>

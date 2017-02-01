<%-- 
    Document   : index
    Created on : Jan 31, 2017, 7:37:01 PM
    Author     : William A Nadeeshani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <h1> Beer Selection Page</h1>
        <form method="post" action="SelectBeer.do">
            <p>Select Beer Characteristics </p>
            <select name='colour' size="1">
                <option>light</option>
                <option>Amber</option>
                <option>Brown</option>
                <option>Dark</option>
            </select>
            <br><br>
            
                <input type="submit">
            
        </form>
    </body>
</html>

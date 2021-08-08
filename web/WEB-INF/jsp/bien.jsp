<%-- 
    Document   : bien
    Created on : 19/07/2021, 19:22:31
    Author     : EXO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logeo</title>
    </head>
    <body style="background: #000000;color: #ff3399;font-family: cursive;font-size: 200%">
        <h2> < CodeNet > </h2>
        <hr/>
    <center>
        <form method="POST">
            Ingrese su Usuario...   <input type="text" name="usuario" style="font-size: 100%" /> 
            <br/>
            <br/>
            <input type="submit" value="ok"  style="background: #ffffff;color: #ff3399;font-size: 150%"/>
        </form>
        <hr/>
        ${usuario} 
    </center>
</body>
</html>

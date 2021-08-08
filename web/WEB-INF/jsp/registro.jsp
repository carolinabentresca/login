<%-- 
    Document   : registro
    Created on : 19/07/2021, 19:20:46
    Author     : EXO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logeo</title>
    </head>
    <body style="background: #000000;color: #ff3399;font-family: cursive;font-size: 200%">
        <h2 style="background: #ffffff"> < CodeNet > </h2>
          <center>
              <form method="POST">
                    <label>USUARIO:</label><br/>
                    <input type="text" name="usuario" placeholder=" " required="required"  style="font-size: 100%" /><br/>
                    <label>MAIL:</label><br/>
                    <input type="email" name="mail" placeholder=" " required="required"  style="font-size: 100%" /><br/>
                    <label>PASSWORD:</label><br/>
                    <input type="password" name="password" placeholder=" "  required="required" style="font-size: 100%" /><br/>
                    <br/>
                    <input type="submit" value="Registrar"  style="background: #ff3399;color: #ffffff;font-size: 100%"/>
              </form>
            </center>
    </body>
</html>

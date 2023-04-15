<%-- 
    Document   : newjsp
    Created on : 22 mar 2023, 15:54:25
    Author     : andreajalil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World dede html!</h1>
        <% String hola = "Hola desde Java";%>
        <%=hola %>
        
         <<form action="procesarForm" method="get"></form>
        <input type="text" name="nombreAlumno">
        <input type="submit">
    </body>
</html>

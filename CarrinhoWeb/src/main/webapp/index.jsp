<%-- 
    Document   : index
    Created on : Dec 10, 2015, 8:47:49 AM
    Author     : Anderson Souza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
        	
        	<label>Digite o nome do produto: </label>
        	<input type="text">
        	
        	<input type="submit" value="Adicionar">

        </form>
        
        <c:forEach items="" var="produto">
            <p>${produto}</p>
        </c:forEach>
        
    </body>
</html>
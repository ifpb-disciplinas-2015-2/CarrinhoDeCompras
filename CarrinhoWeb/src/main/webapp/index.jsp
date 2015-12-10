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
        <form action="init" method="get">
        	
        	<label>Digite o nome do produto: </label>
                <input type="text" name="produto">
        	
        	<input type="submit" value="Adicionar">

        </form>
        <%--<c:if test="${requestScope.listaDeProdutos != null}">--%>
        <c:forEach items="${sessionScope.listaDeProdutos}" var="produto">
                <p>${produto}</p>
            </c:forEach>
            <%--</c:if>--%>
        
    </body>
</html>

<%@ page import="firstPackage.Cart" %>
<%--
  Created by IntelliJ IDEA.
  User: Nikita
  Date: 22.01.2023
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart JSP</title>
</head>
<body>
    <%
        Cart cart = (Cart) session.getAttribute("cart");
    %>

    <p> Наименование: <%= cart.getName() %> </p>
    <p> Количество: <%= cart.getQuantity() %> </p>
</body>
</html>

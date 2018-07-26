<%--
  Created by IntelliJ IDEA.
  User: Kir
  Date: 26.07.2018
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>First servlet</title>
  </head>
  <body>
<% String login = (String)session.getAttribute("user_login"); %>
  <% if (login==null || "".equals(login)) { %>
  <form action="/login" method="POST">
    Login: <input type="text" name="login"><br>
    Password: <input type="password" name="password"><br>
    <input type="submit" />
  </form>
  <% } else {   %>
  <h1> You are logged in as <%= login %></h1>
  <br>Click this link to <a href="login?a=exit">logout</a>
  <% } %>
  </body>
</html>

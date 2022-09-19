<%@page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<p>
  Hoje é: <%= (new java.util.Date()).toLocaleString()%>
</p>
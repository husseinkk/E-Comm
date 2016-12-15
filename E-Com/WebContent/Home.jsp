<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Welcome Home</title>
<%@page import="Controller.User" %>
<link rel="stylesheet" href="/E-Com/style.css">

</head>
<body>
  <nav class="menu" tabindex="0">
	<div class="smartphone-menu-trigger"></div>
  <header class="avatar">
  <%User user = (User)request.getAttribute("user");%>
    <h2>Welcome, <%out.print(user.name); %></h2>
  </header>
	<ul>
    <li tabindex="0" class="icon-Dashboard"><span>Dashboard</span></li>
    <li tabindex="0" class="icon-Courses"><span>Courses</span></li>
    <li tabindex="0" class="icon-Grades"><span>Grades</span></li>
  </ul>
</nav>

</body>
</html>
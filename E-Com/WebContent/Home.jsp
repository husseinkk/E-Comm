<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Welcome Home</title>
<%@page import="Controller.User" %>
<link rel="stylesheet" href="/E-Com/style.css">
    <link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="/E-Com/myScript.js"></script>

</head>
    <body>
    <div id="wrapper">
        <div id="banner"></div>
        <div id="menuLeft">
            <ul>
                <div id="avatar">
                <%User user = (User)request.getAttribute("user"); %>
                <label>Hello, <% %></label>
                </div>
                <li><span class="fa fa-home"> Dashboard</span></li>
                <li><span class="fa fa-users"> Users</span>
                <ul>
                    <li><a href="#" onclick="addUser()"><span class="fa fa-plus" id="button"> Add User</span></a></li>
                    <li><a href="#" onclick="removeUser()"><span class="fa fa-trash" id="button"> Remove User</span></a></li>
                    <li><a href="#" onclick=""><span class="fa fa-pencil" id="button"> Edit User</span></a></li>
                    </ul>
                </li>
                <li><span class="fa fa-home"> Courses</span>
                    <ul>
                    <li><a href="#" onclick="addCourse()"><span class="fa fa-plus" id="button"> Add Course</span></a></li>
                    <li><a href="#" onclick="removeCourse()"><span class="fa fa-trash" id="button"> Remove Course</span></a></li>
                    <li><a href="#" onclick=""><span class="fa fa-link" id="button"> Assign Course</span></a></li>
                    </ul>
                </li>
                <li><span class="fa fa-graduation-cap"> Grades</span></li>
                <li><span class="fa fa-home"> Offers</span></li>
            </ul>
        </div>
        <div id="content">
        <div id="form-style-1">
            <header><h2>GPA</h2></header>
            </div>
        </div>
        <div id="footer"></div>
        </div>
    
    </body>
</html>